package ensyu4_11;
// Scannerのインポート
import java.util.Scanner;

/*
	正の整数値を0までカウントダウンするlist4-4をfor文で実現せよ
*/
public class ensyu4_11 {

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
		
		// 0になるまで繰り返す
		for (int i = 0; i <= x; i++) {
			// 文言表示
			System.out.println(x - i);
		}

	}

}
