package ensyu3_6;
// Scannerのインポート
import java.util.Scanner;

/*
	正の整数値を読み込んで、それが10の倍数であれば「その値は10の倍数です。」と表示し、
	そうでなければ「その値は10の倍数ではありません。」と表示するプログラムを作成せよ
	※正でない値を読み込んだ場合は、「正でない値が入力されました。」と表示すること
*/
public class ensyu3_6 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();

		//正でないならば
		if (n < 0)
			// 文言表示
			System.out.println("正でない値が入力されました。");
		
		// 10の倍数ならば
		else if (n % 10 == 0)
			// 文言表示
			System.out.println("その値は10の倍数です。");
			
		// 10の倍数でないならば
		else
			// 文言表示
			System.out.println("その値は10の倍数ではありません。");

	}

}
