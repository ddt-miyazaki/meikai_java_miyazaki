package ensyu4_9;
// Scannerのインポート
import java.util.Scanner;

/*
	正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成せよ
*/
public class ensyu4_9 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("nの値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		// 積変数の初期化
		int product = n;
		// 積計算用変数の初期化
		int i = 1;
		
		// nが0でなければ処理を開始
		if (n != 0) {
			// iがnより小さい限り繰り返す
			while (i < n) {
				// 積の計算
				product *= i;
				// インクリメント
				i++;
			}
		}
			
		// 1からnまでの積の表示
		System.out.println("1から" + "n" +"までの積は" + product + "です。");
	}

}
