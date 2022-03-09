package ensyu3_14;
// Scannerのインポート
import java.util.Scanner;

/*
	list3-13と同様に、二つの整数値を読み込んで、小さい方の値と大きい方の値の両方を表示するプログラムを作成せよ
	ただし、二つの整数値が等しい場合は、「二つの値は同じです。」と表示すること
*/
public class ensyu3_14 {
	
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
		
		//最小値、最大値変数の初期化
		int min, max;
		
		// aがbより小さい場合
		if (a < b) {
			// 最小値にaを設定
			min = a;
			// 最大値にbを設定
			max = b;
		// そうでなければ
		} else {
			// 最小値にbを設定
			min = b;
			// 最大値にaを設定
			max = a;
		}
		
		// 同値だった場合
		if (min == max) {
			System.out.println("二つの値は同じです。");
			
		// 同値でない場合
		} else {
			System.out.println("小さい方の値は" + min + "です。");
			System.out.println("大きい方の値は" + max + "です。");
		}
	}
	
}
