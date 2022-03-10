package ensyu4_18;
// Scannerのインポート
import java.util.Scanner;

/*
	右に示すように、1からnまでの整数値の2乗値を表示するプログラムを作成せよ
*/
public class ensyu4_18 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("nの値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// n回繰り返す
		for (int i = 1; i <= n; i++) {
			// 文言表示
			System.out.println(i + "の2乗は" + i * i);
		}

	}

}
