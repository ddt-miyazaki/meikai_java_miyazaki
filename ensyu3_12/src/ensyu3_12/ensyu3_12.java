package ensyu3_12;
// Scannerのインポート
import java.util.Scanner;

// キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ
public class ensyu3_12 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数a：");
		// キーボードから入力した値を代入
		int a = stdIn.nextInt();

		// 文言表示
		System.out.print("整数b：");
		// キーボードから入力した値を代入
		int b = stdIn.nextInt();

		// 文言表示
		System.out.print("整数c：");
		// キーボードから入力した値を代入
		int c = stdIn.nextInt();

		// 整数aを暫定的な最小値として設定
		int min = a;
		// 整数bの方が小さければ最小値として設定
		if (b < min) min = b;
		// 整数cの方が小さければ最小値として設定
		if (c < min) min = c;

		// 最小値を表示
		System.out.println("最小値は" + min + "です。");
	
	}

}
