package ensyu4_24;
// Scannerのインポート
import java.util.Scanner;

/*
	正の整数値を読み込み、それが素数であるかどうかを判定するプログラムを作成せよ
*/
public class ensyu4_24 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("正の整数値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		// 素数フラグの初期化
		int primeNum = 1;
		
		// 割り切れる数が見つかるまで繰り返し
		for (int i = 2; i < n; i++) {
			// 割り切れたならば処理終了
			if (n % i == 0) {
				// 素数フラグを設定
				primeNum = 0;
				// 処理終了
				break;
			}
		}
		// 素数判定を行い文言表示
		System.out.println("その値は素数" + (primeNum == 1 ? "です。" : "ではありません。"));

	}

}
