package ensyu3_15;
// Scannerのインポート
import java.util.Scanner;

/*
	二つの整数値を読み込んで、降順にソートするプログラムを作成せよ
*/
public class ensyu3_15 {
	
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
		
		// 降順に出力
		System.out.println("降順：" + max + "," + min);

	}
	
}
