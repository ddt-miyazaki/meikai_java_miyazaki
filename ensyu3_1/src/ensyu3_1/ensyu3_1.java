package ensyu3_1;
// Scannerのインポート
import java.util.Scanner;

// 整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ
public class ensyu3_1 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数値：");

		// キーボードから入力した値を代入
		int x = stdIn.nextInt();

		// xがマイナスならば
		if (x < 0)
			//反転
			x = -x;

		// 絶対値の表示
		System.out.println("その絶対値は" + x + "です");

	}
}
