package ensyu4_22;
// Scannerのインポート
import java.util.Scanner;

/*
	n段のピラミッドを表示するプログラムを作成せよ
	第i行目には(i-1)*2+1個の'*'記号を表示して、
	最終行である第n行目には(n-1)*2+1個の'*'記号を表示すること
*/
public class ensyu4_22 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("ピラミッドを表示します。");
		System.out.print("段数は：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// n回繰り返し（ピラミッドの高さ）
		for (int i = 1; i <= n; i++) {
			// n回繰り返し（ピラミッドの列）
			for (int j = 1; j <= (n - 1) * 2 + 1; j++) {
				// 列の繰り返し回数が高さ-現在の段数以下であれば
				if (j <= n - i)
					//スペース表示
					System.out.print(' ');
				// 列の繰り返し回数が高さ-現在の段数より大きければ
				else
					//文言表示
					System.out.print('*');
				// 文字の出力の必要がなくなり次第次の処理へ
				if (j == n + i - 1)
					break;
			}
			//改行表示
			System.out.println();
		}

	}

}
