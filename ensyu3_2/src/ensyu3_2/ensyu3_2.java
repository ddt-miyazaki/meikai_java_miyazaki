package ensyu3_2;
// Scannerのインポート
import java.util.Scanner;

/*
	二つの正の整数値を読み込んで、後者が前者の約数であれば「BはAの約数です。」と表示し、
	そうでなければ「BはAの約数ではありません。」と表示するプログラムを作成せよ
*/
public class ensyu3_2 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数A：");
		// キーボードから入力した値を代入
		int a = stdIn.nextInt();

		// 文言表示
		System.out.print("整数B：");
		// キーボードから入力した値を代入
		int b = stdIn.nextInt();

		// BがAの約数ならば
		if (a % b == 0)
			// 文言表示
			System.out.println("BはAの約数です。");
		
		// BがAの約数でないならば
		else
			// 文言表示
			System.out.println("BはAの約数ではありません。");
	}

}
