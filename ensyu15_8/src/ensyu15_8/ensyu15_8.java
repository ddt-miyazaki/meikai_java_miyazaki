package ensyu15_8;
// Calendarのインポート
import java.util.Calendar;

/*
	コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ
	コマンドラインから年のみが与えられた場合は、その年の1月から12月までのカレンダーを表示して
	年と付きが与えられた場合は、その月のカレンダーを表示して、年も付きも与えられなかったら、
	現在の月のカレンダーを表示すること
*/
public class ensyu15_8 {

	public static void main(String[] args) {
		// カレンダー
		Calendar[] calendars;
		// 年
		int year = 0;
		// 月
		int month = 0;
		
		// 引数から年月を設定
		// 引数のうち最初に出現した4桁の値を年、最初に出現した1か2桁の1～12の値を月に設定する
		for (String s : args) {
			// 年設定が初期設定のままかつ引数の長さが4ならば
			if (year == 0 && s.length() == 4)
				// 引数を年に設定
				year = Integer.parseInt(s);
			// 月設定が初期設定のままかつ引数の長さが3未満ならば
			else if (month == 0 && s.length() < 3) {
				int tmp = Integer.parseInt(s);
				// 1以上12以下ならば
				if (tmp > 0 && tmp < 13)
					// 引数を月に設定
					month = tmp;
			}
		}
		// 引数で年と月が与えられたとき
		if (year != 0 && month != 0) {
			//その年月のカレンダーを生成
			calendars = new Calendar[1];
			calendars[0] = setYearMonth(year, month);
			
		// 引数で年が与えられたとき
		} else if (year != 0) {
			//その年の1~12月のカレンダー配列を生成
			calendars = setYear(year);

		// 引数で月が与えられたとき
		} else if (month != 0) {
			//その月のカレンダーを生成
			calendars = new Calendar[1];
			calendars[0] = setMonth(month);
			
		// 引数で年も月も与えられなかったとき
		} else {
			// 現在の月のカレンダーを生成
			calendars = new Calendar[1];
			// setMonthに0を渡すことで当月のカレンダーを受け取る
			calendars[0] = setMonth(0);
		}
		
		// カレンダー配列を繰り返してカレンダーを描画する
		for (Calendar cl : calendars) {
			// カレンダーの描画
			printCalendar(cl);
			// 改行
			System.out.println();
		}

	}
	
	// 引数の年月で1日に設定したカレンダーを返す
	private static Calendar setYearMonth(int year, int month) {
		// カレンダーのインスタンス化
		Calendar cl = Calendar.getInstance();
		// year年month月1日に設定
		// - 1しているのはCalendarのMONTHが0から始まるから
		cl.set(year, month - 1, 1);
		// 生成したカレンダーを返す
		return cl;
	}
	
	// 引数の年の1日に設定した1月~12月のカレンダーの配列を返す
	private static Calendar[] setYear(int year) {
		// 1~12月分の配列
		Calendar[] calendars = new Calendar[12];
		// 1月から順に12月までのカレンダーを作る
		for (int i = 0; i < 12; i++) {
			// カレンダーのインスタンス化
			Calendar cl = Calendar.getInstance();
			// 引数の年のi月1日に設定
			cl.set(year, i, 1);
			// 配列に追加していく
			calendars[i] = cl;
		}
		// カレンダーの配列を返す
		return calendars;
	}
	
	// 引数の月に設定したカレンダーのインスタンスを返す
	// @param month 1～12が与えられた場合はその月に設定、0が与えられた場合は当月に設定
	private static Calendar setMonth(int month) {
		// カレンダーのインスタンス化
		Calendar cl = Calendar.getInstance();
		// monthが0でなければmonthの月に設定し、0ならば当月のままにする
		if (month != 0)
			// 引数の月に設定する
			// - 1しているのはCalendarのMONTHが0から始まるから
			cl.set(Calendar.MONTH, month - 1);
		// その月の1日に設定する
		cl.set(Calendar.DATE, 1);
		// 指定月1日に設定したカレンダーを返す
		return cl;
	}
	
	// カレンダーの描画
	// @param cl 1日に設定したカレンダーインスタンス
	private static void printCalendar(Calendar cl) {
		// 年・月の表示
		System.out.println(cl.get(Calendar.YEAR) + "/" + (cl.get(Calendar.MONTH) + 1) );
		
		// 曜日の表示
		printWeek();
		
		// 1日の曜日
		int firstWeek = cl.get(Calendar.DAY_OF_WEEK);
		// 次の月に設定する
		cl.add(Calendar.MONTH, 1);
		// 一日戻し、前月の最終日に設定する
		cl.add(Calendar.DATE, -1);
		// 最終日
		int endDate = cl.get(Calendar.DATE);
		
		// 日付の描画
		printDay(firstWeek, endDate);
	}
	
	// 曜日の表示
	private static void printWeek() {
		// 曜日
		final String[] WEEK = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		
		// 曜日の表示
		for (int i = 0; i < WEEK.length; i++)
			System.out.printf("%4s", WEEK[i]);
		// 改行
		System.out.println();
	}
	
	private static void printDay(int firstWeek, int endDate) {
		// 描画する日
		int day = 1;
		// 描画する日が最終日になるまで繰り返す
		for (int i = 0; day <= endDate; i++) {
			// 一週間（7日）分の描画
			for (int j = 0; j < 7; j++) {
				// 1日だったら正しい曜日までスペースで埋める
				if (day == 1 && j < firstWeek - 1) {
					System.out.printf("%4s", "");
					continue;
				}
				// 最終日以降は描画しない
				if (day > endDate)
					break;
				// 日の表示
				System.out.printf("%4d", day);
				// 日の追加
				day++;
			}
			// 改行
			System.out.println();
		}
	}

}
