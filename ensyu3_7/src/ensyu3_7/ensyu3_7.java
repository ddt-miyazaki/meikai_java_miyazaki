package ensyu3_7;
// Scannerのインポート
import java.util.Scanner;

/*
	正の整数値を読み込んで、それを③で割った値に応じて「その値は3で割り切れます。」「その値を3で割った余りは1です。」
	「その値を3で割った余りは2です。」のいずれかを表示するプログラムを作成せよ
	※正でない値を読み込んだ場合は、「正でない値が入力されました。」と表示すること
*/
public class ensyu3_7 {

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
		
		// 3で割り切れるならば
		else if (n % 3 == 0)
			// 文言表示
			System.out.println("その値は3で割り切れます。");

		// 3で割って余り1ならば
		else if (n % 3 == 1)
			// 文言表示
			System.out.println("その値を3で割った余りは1です。");
			
		// 3で割って余り2ならば
		else
			// 文言表示
			System.out.println("その値を3で割った余りは2です。");

	}

}