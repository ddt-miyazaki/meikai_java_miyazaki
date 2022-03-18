package ensyu9_5;

/*
	開始日と終了日とから構成される《期間》を表すクラスperiodを作成せよ。
	コンストラクタやメソッドを自由に定義すること
*/
public class ensyu9_5 {
	public static void main(String[] args) {
		// コンストラクタの確認
		Period p1 = new Period();
		Period p2 = new Period(new Day(2022, 2, 22));
		Period p3 = new Period(new Day(2156, 4, 30), new Day(2496, 8, 10));
		Period p4 = new Period(p2);
		
		// ゲッタメソッドの確認
		printPeriod(p1);
		printPeriod(p2);
		printPeriod(p3);
		printPeriod(p4);
	}
	// ゲッタメソッド出力
	static void printPeriod(Period p) {
		System.out.println(p.getFrom());
		System.out.println(p.getTo());
	}

}
