package ensyu2_1;

// List2-6の2の箇所を、小数部をもつ実数値をxとyに代入するように変更して、その結果を考察せよ。
public class ensyu2_1 {

	public static void main(String[] args) {
		// 変数の初期化
		int x;
		int y;

		// 変数への代入
		x = 6.3;
		y = 1.8;

		// 教本通りの表示の実装
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + (x + y) + "です。");
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}

}
