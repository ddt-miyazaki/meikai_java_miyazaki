package ensyu4_3;
// Scannerのインポート
import java.util.Scanner;

/*
	二つの整数値を読み込んで、小さい方の数以上で大きい方の数以下の全整数を
	小さい方から順に表示するプログラムを作成せよ
*/
public class ensyu4_3 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		
		// 文言表示
		System.out.print("整数A：");
		// キーボードから入力した値を代入
		int a = stdIn.nextInt();
		
		// 文言表示
		System.out.print("整数B：");
		// キーボードから入力した値を代入
		int b = stdIn.nextInt();
		
		// 最小値最大値変数の初期化
		int min, max;
		
		// aがbよりも大きければ
		if (a > b) {
			// 最小値にbを設定
			min = b;
			// 最大値にaを設定
			max = a;
			// そうでなければ
		} else {
			// 最小値にaを設定 
			min = a;
			// 最大値にbを設定
			max = b;
		}
		// 最小値を表示
		System.out.print(min);
		
		// 最小値と最大値が同値で無ければ処理を行う
		if (min != max) {
			// 繰り返し処理の記述
			do {
				min++;
				// 最小値から順に1ずつ足しながら表示する
				System.out.print(" " + min);
			// 最大値を表示するまで繰り返す
			} while (min != max);
		}	
	}
}
