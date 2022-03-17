package ensyu4_15;
// Scannerのインポート
import java.util.Scanner;

/*
	身長と標準体重の対応表を表示するプログラムを作成せよ
	表示する身長の範囲（開始値/終了値/増分）は、整数値として読み込むこと
	※標準体重は（身長-100）*0.9によって求められる
*/
public class ensyu4_15 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("何cmから：");
		// キーボードから入力した値を代入
		int start = stdIn.nextInt();
		// 文言表示
		System.out.print("何cmまで：");
		// キーボードから入力した値を代入
		int end = stdIn.nextInt();
		// 文言表示
		System.out.print("何cmごと：");
		// キーボードから入力した値を代入
		int gain = stdIn.nextInt();

		// 文言表示
		System.out.println("身長 標準体重");
		// iがnと同値になるまで繰り返す
		for (int i = start; i <= end; i += gain) {
			// 身長、標準体重の表示
			System.out.println(i + " " + (i - 100) * 0.9 );
		}

	}

}
