package ensyu9_5;

// 期間クラス
public class Period {
	// 開始日
	private Day from = new Day();
	// 終了日
	private Day to = new Day();
	
	// コンストラクタ
	// 初期値で設定
	public Period() {}
	// 開始日を引数から設定
	public Period(Day from) {
		this.from = new Day(from);
	}
	// 開始日と終了日を引数から設定
	public Period(Day from, Day to) {
		this(from);
		this.to = new Day(to);
	}
	// Period変数から同じ値を設定
	public Period(Period p) {
		this(p.from, p.to);
	}
	
	// fromを取得
	public Day getFrom() {
		return from;
	}
	
	// toを取得
	public Day getTo() {
		return to;
	}
	
}
