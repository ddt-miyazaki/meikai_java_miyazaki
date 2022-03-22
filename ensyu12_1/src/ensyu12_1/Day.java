package ensyu12_1;

// 日付クラスDay【第3版】
public class Day {
	// 年
	private int year = 1;
	// 月
	private int month = 1;
	// 日
	private int date = 1;

	// コンストラクタ
	// インスタンス生成時、フィールドは初期値
	public Day() {}
	// インスタンス生成時、年だけ引数の値で設定、他のフィールドは初期値
	public Day(int year) {
		this.year = year;
	}
	// インスタンス生成時、年と月を引数の値で設定、日は初期値
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	// インスタンス生成時、年月日を引数の値で設定
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	// 引数の日付インスタンスから同じ値のインスタンスを生成
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	// 年・月・日を取得
	// 年を取得
	public int getYear() {
		return year;
	}
	// 月を取得
	public int getMonth() {
		return month;
	}
	// 日を取得
	public int getDate() {
		return date;
	}

	// 年・月・日を設定
	// 年を設定
	public void setYear(int year) {
		this.year = year;
	}
	// 月を設定
	public void setMonth(int month) {
		this.month = month;
	} 
	// 日を設定
	public void setDate(int date) {
		this.date = date;
	}

	// 年月日を設定
	public void set(int year, int month, int date) {
		// 年を設定
		this.year  = year;
		// 月を設定
		this.month = month;
		// 日を設定
		this.date  = date;
	}

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
}