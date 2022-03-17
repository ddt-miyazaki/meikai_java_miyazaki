package ensyu4_25;
// Scannerのインポート
import java.util.Scanner;

/*
	合計だけでなく平均も求めるようにlist4-17及び4-18のプログラムを書き換えよ
*/
public class ensyu4_25 {
	
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		// 合計値
		int sum = 0;
		// 加算カウント
		int count = 0;
		
		// 指定された回数繰り返し
		for (int i = 0; i < n; i++) {
			// 文言表示
			System.out.print("整数（0で終了）：");
			// キーボードから入力した値を代入
			int t = stdIn.nextInt();
			// 0が入力されたら処理終了
			if (t == 0) break;
			// 合計値に加算
			sum += t;
			// 加算した回数をカウント
			count++;
		}
		// 合計表示
		System.out.println("合計は" + sum + "です。");
		// 平均表示
		System.out.println("平均は" + sum / count + "です。");
	}
}
