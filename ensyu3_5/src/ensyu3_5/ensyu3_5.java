package ensyu3_5;
// Scannerのインポート
import java.util.Scanner;

/*
	正の整数値を読み込んで、それが5で割り切れれば「その値は5で割り切れます。」と表示し、
	そうでなければ「その値は5で割り切れません。」と表示するプログラムを作成せよ
	※正でない値を読み込んだ場合は、「正でない値が入力されました。」と表示すること
*/
public class ensyu3_5 {

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
		
		// 5で割り切れるならば
		else if (n % 5 == 0)
			// 文言表示
			System.out.println("その値は5で割り切れます。");
			
		// 5で割り切れないならば
		else
			// 文言表示
			System.out.println("その値は5で割り切れません。");
	}

}
