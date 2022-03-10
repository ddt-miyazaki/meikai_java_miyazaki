package ensyu4_20;
// Scannerのインポート
import java.util.Scanner;

/*
	n段の正方形を表示するプログラムを作成せよ。
*/
public class ensyu4_20 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("nの値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// n回繰り返し（正方形の縦）
		for (int i = 0; i < n; i++) {
			// n回繰り返し（正方形の横）
			for (int j = 0; j < n; j++)
				//文言表示
				System.out.print('*');
			//改行表示
			System.out.println();
		}
	}

}
