package ensyu4_1;
// Scannerのインポート
import java.util.Scanner;

/*
	読み込んだ整数値の符号を判定するList3-5のプログラムを、好きなだけ何度でも繰り返して
	入力・表示できるようにしたプログラムを作成せよ
*/
public class ensyu4_1 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// もう一度行うかのフラグ
		int retry;
		
		do {
			// 文言表示
			System.out.print("整数値：");
			// キーボードから入力した値を代入
			int n = stdIn.nextInt();
	
			// nがプラスならば
			if (n > 0)
				// 文言表示
				System.out.println("その値は正です。");
			// nがマイナスならば
			else if (n < 0)
				// 文言表示
				System.out.println("その値は負です。");
			// nが0ならば
			else
				// 文言表示
				System.out.println("その値は0です。");
			
			// もう一度行うか問うメッセージの表示
			System.out.print("もう一度？1…Yes/0…No：");
			retry = stdIn.nextInt();
		} while (retry == 1);
		
	}

}
