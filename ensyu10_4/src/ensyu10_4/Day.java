package ensyu10_4;

// ユーティリティのインポート
import static java.util.Calendar.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
	日付クラス第4版を以下のように改良せよ
	●	引数を受け取らないコンストラクタによるインスタンスの生成時は、西暦1年1月1日で初期化するのではなく、
		プログラム実行時の日付で初期化する
	●	引数を受け取るコンストラクタに不正な値が指定された場合は、適当な値に調整する
		（例えば13月が指定された場合は12月とする／9月31日と指定された場合は9月30日とする）
	さらに、以下に示すメソッドを追加すること
	・年内での経過日数（その年の元旦から数えて何日目であるか）を求めるメソッド
	・年内の残り日数を求めるメソッド
	・他の日付との前後関係（より前の日付か／同じ日付か／より後ろの日付か）を判定するインスタンスメソッド
	・二つの日付の前後関係を判定するクラスメソッド
	・日付を一つ後ろにすすめるメソッド（日付が2012年12月31日であれば、2013年1月1日に更新する）
	・次の日の日付を返却するメソッド
	・日付を一つ前に戻すメソッド
	・前の日の日付を返却するメソッド
	・日付をn日後ろにすすめるメソッド
	・n日後の日付を返却するメソッド
	・日付をn日前に戻すメソッド
	・n日前の日付を返却するメソッド
*/
// 日付クラスDay【第4版】
public class Day {
    // 年
	private int year  = 1;
    // 月
    private int month = 1;
    // 日
	private int date  = 1;

	// y年は閏年か？
	public static boolean isLeap(int y) {
		return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
	}
	
	// 二つの日付の前後関係を判定するクラスメソッド
	// d1がd2よりも　より前ならば1、同じならば0同じ、より後ろならば-1を返す
	public static int compareDate(Day d1, Day d2) {
		// Calendarのインスタンス作成
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		// 引数のDay変数から年月日をセット
		c1.set(d1.year, d1.month, d1.date);
		c2.set(d2.year, d2.month, d2.date);
		
		// 計算結果を返す
		return c1.compareTo(c2);
	}

	// コンストラクタ
	//	引数を受け取らないコンストラクタによるインスタンスの生成時は、西暦1年1月1日で初期化するのではなく、
	// プログラム実行時の日付で初期化する
	public Day() {
		// utilを利用してプログラム実行時の日付を取得する
		GregorianCalendar today = new GregorianCalendar();
		// 当日の年で初期化
		year = today.get(YEAR);
		// 当日の月で初期化
		month = today.get(MONTH) + 1;
		// 当日の日で初期化
		date = today.get(DATE);
	}
	public Day(int year) {
		// ０以下の年数が指定された場合
		if (year < 0)
			// 2022年に設定
			year = 2022;
		this.year = year;
		}
	public Day(int year, int month) {
		this(year);
		// 13月以上1月未満が指定された場合
		if (month > 12 || month < 1)
			// 12月に設定
			month = 12;
		this.month = month;
		}
	public Day(int year, int month, int date) {
		this(year, month);
		// 月の指定が
		switch (month) {
		// ２月のとき
		case 2:
			// うるう年ならば
			if (isLeap(year)) {
				// 29より大きい値が指定されていたら
				if (date > 29)
					// 29に丸める
					date = 29;
			// うるう年出ないならば
			} else {
				// 28より大きい値が指定されていたら
				if (date > 28)
					// 28に丸める
					date = 28;
			}
		// 4,6,9,11月のとき
		case 4:
		case 6:
		case 9:
		case 11:
			// 30より大きい値が指定されていたら
			if (date > 30)
				// 30に丸める
				date = 30;
			break;
		default:
			// 31より大きい値が指定されていたら
			if (date > 31)
				// 31に丸める
				date = 31;
		}
		this.date = date;
		}
	public Day(Day d) { this(d.year, d.month, d.date); }

	// 年・月・日を取得
    // 年を取得
	public int getYear() { return year; }
    // 月を取得
	public int getMonth() { return month; }
    // 日を取得
	public int getDay() { return date; }

	// 年・月・日を設定
    // 年を設定
	public void setYear(int year) { this.year  = year; }
    // 月を設定
	public void setMonth(int month) { this.month = month; }
    // 日を設定
	public void setDate(int date) { this.date  = date; }

    // 年月日
	public void set(int year, int month, int date) {
        // 年
		this.year  = year;	
        // 月
		this.month = month;
        // 日
		this.date  = date;
	}

	// 閏年か？
	public boolean isLeap() { return isLeap(year); }

	// 曜日を求める
	// 0:日, 1:月, 2:火, 3:水, 4:木, 5:金, 6:土
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// 日付dと等しいか
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	// 文字列表現を返却
	public String toString() {
		String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
		return String.format("%04d年%02d月%02d日(%s)", 
										year, month, date, wd[dayOfWeek()]);
	}
	
	// Calendar変数の設定メソッド
	public Calendar createCalendar(int y, int m, int d) {
		// Calendarのインスタンス作成
		Calendar c = Calendar.getInstance();
		// 引数の年月日をセット
		c.set(y, m, d);
		// 引数から生成したCalendar変数を返す
		return c;
	}
	
	// Calendar変数のfromとtoから差の日数を返す
	public int dayDiff(Calendar from, Calendar to) {
		// fromの日をミリ秒に変換
        long dateTimeFrom = from.getTimeInMillis();
        // toの日をミリ秒に変換
        long dateTimeTo = to.getTimeInMillis();
        // fromとtoの差を計算し、ミリ秒から日数を割り出す
        long dayDiff = ( dateTimeTo - dateTimeFrom  ) / (1000 * 60 * 60 * 24 );
        // 割り出した日数をint型に変換し返す
        return (int)dayDiff;
	}
	
	// 年内での経過日数を求めるメソッド
	public int thisYearElapsed() {
		// インスタンスの年の1月1日からインスタンスの日付までの経過日数を返す
		return dayDiff(createCalendar(this.year, 1, 1), createCalendar(this.year, this.month, this.date));
	}
	
	// 年内の残り日数を求めるメソッド
	public int thisYearDaysLeft() {
		// インスタンスの日付からインスタンスの年の12月31日までの残り日数を返す
		return dayDiff(createCalendar(this.year, this.month, this.date), createCalendar(this.year, 12, 31));
	}
	
	// 他の日付との前後関係（より前の日付か／同じ日付か／より後ろの日付か）を判定するインスタンスメソッド
	// 比較対象のdayが　より前ならば1、同じならば0同じ、より後ろならば-1を返す
	public int compareDate(Day day) {
		// インスタンスの日付と引数の日付を比較し、結果を返す
		return createCalendar(this.year, this.month, this.date).compareTo(createCalendar(day.year, day.month, day.date));
	}
	
	// 引数の日数分日付の操作を行う
	// 引数がプラスなら日数を足し、マイナスならば前日に戻す
	public Calendar controllDay(Calendar c, int n) {
		// n日日数を足す
		c.add(c.DAY_OF_MONTH, n);
		// 日数操作後のインスタンスを返す
		return c;
	}
	
	// 日付を一つ後ろにすすめるメソッド
	public void addDay() {
		// 1日後の年月日を設定
		addDays(1);
	}
	
	// 次の日の日付を返却するメソッド
	public Day nextDay() {
		// 1日後の日付を返す
		return whenDay(1);
	}
	
	// 日付を一つ前に戻すメソッド
	public void minusDay() {
		// 1日前の年月日を設定
		addDays(-1);
	}
	
	// 前の日の日付を返却するメソッド
	public Day prevDay() {
		// 1日前の日付を返す
		return whenDay(-1);
	}
	
	//	日付をn日後ろにすすめるメソッド
	//	日付をn日前に戻すメソッド
	public void addDays(int n) {
		// n日後のCalendar変数を作成
		// nがマイナスならば前の日
		Calendar c = controllDay(createCalendar(this.year, this.month, this.date), n);
		// n日後のCalendar変数から自身のインスタンスの年月日を設定
		set(c.get(YEAR), c.get(MONTH), c.get(DAY_OF_MONTH));
	}
	
	//	n日後の日付を返却するメソッド
	//	n日前の日付を返却するメソッド
	public Day whenDay(int n) {
		// n日後のCalendar変数を作成
		// nがマイナスならば前の日
		Calendar c = controllDay(createCalendar(this.year, this.month, this.date), n);
		// n日後のCalendar変数から新たなDayインスタンスを作成し、返す
		return new Day(c.get(YEAR), c.get(MONTH), c.get(DAY_OF_MONTH));
	}
	
}
