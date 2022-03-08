package ensyu3_4;
// Scannerのインポート
import java.util.Scanner;

/*
	二つの変数a,bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ
	「aの方が大きいです。」
	「bの方が大きいです。」
	「aとbは同じ値です。」
*/
public class ensyu3_4 {

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

		// aの方が大きいならば
		if (a > b)
			// 文言表示
			System.out.println("aの方が大きいです。");
		
		// bの方が大きいならば
		else if (a < b)
			// 文言表示
			System.out.println("bの方が大きいです。");
			
		//同じ値ならば
		else
			// 文言表示
			System.out.println("aとbは同じ値です。");

	}

}
