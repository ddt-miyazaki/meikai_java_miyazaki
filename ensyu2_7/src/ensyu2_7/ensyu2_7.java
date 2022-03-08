package ensyu2_7;
// Randomのインポート
import java.util.Random;

/*
	以下に示すプログラムを作成せよ
	・1桁の正の整数値(1以上9以下)をランダムに生成して表示
	・1桁の負の整数値(-9以上-1以下)をランダムに生成して表示
	・1桁の正の整数値(1以上9以下)をランダムに生成して表示
*/
public class ensyu2_7 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();

		// 1桁の正の整数値の代入
		int posNum1 = rand.nextInt(9) + 1;
		// 1桁の正の整数値の表示
		System.out.println(posNum1);


		// 1桁の負の整数値表示用数値の代入
		int negNum = rand.nextInt(9) + 1;
		// 1桁の負の整数値の表示
		System.out.println("-" + negNum);

		// 2桁の正の整数値の代入
		int posNum2 = rand.nextInt(90) + 10;
		// 2桁の正の整数値の表示
		System.out.println(posNum2);

	}

}
