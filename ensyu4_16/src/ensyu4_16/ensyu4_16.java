package ensyu4_16;
// Scannerのインポート
import java.util.Scanner;

/*
	読み込んだ個数だけ*を表示するlist4-11を書き換えて、
	5個表示するごとに改行するプログラムを作成せよ
*/
public class ensyu4_16 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("何個*を表示しますか：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// n回繰り返す
		for (int i = 1; i <= n; i++) {
			// 文言表示
			System.out.print('*');
			// 5の倍数の時
			if (i % 5 == 0)
				// 改行表示
				System.out.println();
		}

	}

}
