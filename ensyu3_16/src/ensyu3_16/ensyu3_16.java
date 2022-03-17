package ensyu3_16;
// Scannerのインポート
import java.util.Scanner;

/*
	三つの整数値を読み込んで昇順にソートするプログラムを作成せよ
*/
public class ensyu3_16 {

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

		// 文言表示
		System.out.print("整数c：");
		// キーボードから入力した値を代入
		int c = stdIn.nextInt();

		// 変数の初期化
		int min, med, max;

		// aがb以上の時
		if (a >= b) {
			// aがb,c以上の時
			if (a >= c) {
				// aを最大値に設定
				max = a;
				// a,b,cの順の時
				if (b >= c) {
					// bを中央値に設定
					med = b;
					// cを最小値に設定
					min = c;
				// a,c,bの順の時
				} else {
					// cを中央値に設定
					med = c;
					// bを最小値に設定
					min = b;
				}
			// c,a,bの順の時
			} else {
				// cを最大値に設定
				max = c;
				// aを中央値に設定
				med = a;
				// bを最小値に設定
				min = b;
			}
		// bがaより大きいとき
		} else {
			// bがa,c以上の時
			if (b >= c) {
				// bを最大値に設定
				max = b;
				// b,a,cの順の時
				if (a >= c) {
					// aを中央値に設定
					med = a;
					// cを最小値に設定
					min = c;
				// b,c,aの順の時
				} else {
					// cを中央値に設定
					med = c;
					// aを最小値に設定
					min = a;
				}
			// c,b,aの順の時
			} else {
				// cを最大値に設定
				max = c;
				// bを中央値に設定
				med = b;
				// aを最小値に設定
				min = a;
			}
		}

		// 昇順で表示
		System.out.println("昇順：" + min + "," + med + "," + max);

	}

}
