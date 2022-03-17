package ensyu4_4;
// Scannerのインポート
import java.util.Scanner;

/*
	list4-4のwhile文終了時にxの値が-1になることを確認するプログラムを作成せよ
*/
public class ensyu4_4 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("カウントダウンします。");
		// 変数の初期化
		int x;
		// 繰り返し処理の記述
		do {
			// 文言表示
			System.out.print("正の整数値：");
			// キーボードから入力した値を代入
			x = stdIn.nextInt();
		// 1以上の値が入力されるまで繰り返す
		} while (x <= 0);
		
		// xが0になるまで繰り返す
		while (x >= 0) {
			// 文言表示
			System.out.println(x);
			x--;
		}
		// 終了時のxの値を表示
		System.out.println("終了時のxの値は" + x + "です。");
	}

}
