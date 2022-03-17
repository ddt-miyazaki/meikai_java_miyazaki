package ensyu2_9;
// Randomのインポート
import java.util.Random;

/*
	以下に示すプログラムを作成せよ（実数値の乱数の生成にはnextDouble()を使うこと）
	・0.0以上1.0未満の実数値をランダムに生成して表示
	・0.0以上10.0未満の実数値をランダムに生成して表示
	・-1.0以上1.0未満の実数値をランダムに生成して表示
*/
public class ensyu2_9 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();

		// 0.0以上1.0未満の実数値をランダムに生成
		double num1 = rand.nextDouble();
		// 0.0以上1.0未満の実数値の表示
		System.out.println(num1);

		// 0.0以上10.0未満の実数値をランダムに生成
		double num2 = rand.nextDouble() * 10;
		// 0.0以上10.0未満の実数値の表示
		System.out.println(num2);

		// -1.0以上1.0未満の実数値をランダムに生成
		double num3 = rand.nextDouble();
		double num4 = rand.nextDouble();
		// -1.0以上1.0未満の実数値の表示
		System.out.println(num3 - num4);

	}

}
