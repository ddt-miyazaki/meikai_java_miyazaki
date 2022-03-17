package ensyu3_13;
// Scannerのインポート
import java.util.Scanner;

/*
	キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ
	※例えば2,3,1の中央値は2で、1,2,1の中央値は1で、3,3,3の中央値は3である
*/
public class ensyu3_13 {

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

		// 中央値変数の初期化
		int med;

		// aがb以上の時
		if (a >= b)
			// aがb,c以上の時
			if (a >= c)
				// a,b,cの順の時
				if (b >= c)
					// bを中央値に設定
					med = b;
				// a,c,bの順の時
				else
					// cを中央値に設定
					med = c;
			// c,a,bの順の時
			else
				// aを中央値に設定
				med = a;
		// bがaより大きいとき
		else
			// bがa,c以上の時
			if (b >= c)
				// b,a,cの順の時
				if (a >= c)
					// aを中央値に設定
					med = a;
				// b,c,aの順の時
				else
					// cを中央値に設定
					med = c;
			// c,b,aの順の時
			else
				// bを中央値に設定
				med = b;

		// 中央値を表示
		System.out.println("中央値は" + med + "です。");

	}

}
