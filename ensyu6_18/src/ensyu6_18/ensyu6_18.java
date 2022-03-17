package ensyu6_18;
// Scannerのインポート
import java.util.Scanner;

/*
	行数・各行の列数・各要素の値をキーボードから読み込むようにList6-18を書き換えたプログラムを作成せよ
*/
public class ensyu6_18 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 配列の初期化
		int [][] c;

		// 文言表示
		System.out.print("配列の行数：");
		// キーボードから入力した値で行数設定
		c  = new int[stdIn.nextInt()][];
		
		// 要素の数繰り返し、各行の列数を設定
		for (int i = 0; i < c.length; i++) {
			// 文言表示
			System.out.print(i + 1 + "行目の列数：");
			// キーボードから入力した値で列数設定
			c[i]  = new int[stdIn.nextInt()];
		}
		
		// 要素の数繰り返し、cに行列の値を代入する
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				// 文言表示
				System.out.print("c[" + i + "][" + j + "] = ");
				// キーボードから入力した値を代入
				c[i][j]  = stdIn.nextInt();
			}
		}
		
		// 要素の数繰り返す
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				// 配列内の値表示
				System.out.printf("%3d", c[i][j]);
			}
			// 改行
			System.out.println();
		}
		
	}

}
