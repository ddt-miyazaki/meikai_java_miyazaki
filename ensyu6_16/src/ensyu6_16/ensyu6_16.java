package ensyu6_16;
// Scannerのインポート
import java.util.Scanner;

/*
	4行3列の行列と3行4列の行列の積を求めるプログラムを作成せよ
	各要素の値はキーボードから読み込むこと
*/
public class ensyu6_16 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		
		// 計算に使用する配列の初期化
		int [][] x = new int [4][3];
		int [][] y = new int [3][4];
		// 計算結果格納配列
		int [][] z = new int [4][4];
		
		// 要素の数繰り返し、xに行列の値を代入する
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				// 文言表示
				System.out.print("x[" + i + "][" + j + "] = ");
				// キーボードから入力した値を代入
				x[i][j]  = stdIn.nextInt();
			}
		}
		
		// 要素の数繰り返し、yに行列の値を代入する
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j < y[i].length; j++) {
				// 文言表示
				System.out.print("y[" + i + "][" + j + "] = ");
				// キーボードから入力した値を代入
				y[i][j]  = stdIn.nextInt();
			}
		}
		
		// 行列の積の計算
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 3; k++) {
					// 計算結果を加算する
					z[i][j] += x[i][k] * y[k][j];
				}
			}
		}
		// 要素の数繰り返す
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				// 計算結果表示
				System.out.printf("%4d\t", z[i][j]);
			}
			// 改行
			System.out.println();
		}
		
	}

}
