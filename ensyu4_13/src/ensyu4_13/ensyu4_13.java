package ensyu4_13;
// Scannerのインポート
import java.util.Scanner;

/*
	1からnまでの和を求めるlist4_10をfor文で実現せよ
*/
public class ensyu4_13 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("1からnまでの和を求めます。");
		// 変数の初期化
		int n;
		// 繰り返し処理の記述
		do {
			// 文言表示
			System.out.print("nの値：");
			// キーボードから入力した値を代入
			n = stdIn.nextInt();
		// 1以上の値が入力されるまで繰り返す
		} while (n <= 0);
		
		// 合計値計算変数の初期化
		int sum = 0;
		
		// iがnと同値になるまで繰り返す
		for (int i = 1; i <= n; i++) {
			// 合計値に足していく
			sum += i;
		}
			// 文言表示
			System.out.println("1から" + n + "までの和は" + sum + "です。");
	}
}
