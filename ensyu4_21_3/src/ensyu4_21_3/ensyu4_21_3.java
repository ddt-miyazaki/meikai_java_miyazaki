package ensyu4_21_3;
// Scannerのインポート
import java.util.Scanner;

/*
	直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ
*/
public class ensyu4_21_3 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("右上直角の三角形を表示します。");
		System.out.print("段数は：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// n回繰り返し（三角形の縦）
		for (int i = n; i > 0; i--) {
			// n回繰り返し（三角形の横）
			for (int j = n; j > 0; j--) {
				// jがiより大きいとき
				if (j > i)
					//スペース表示
					System.out.print(' ');
				// jがi以下の時
				else
					//文言表示
					System.out.print('*');
			}
			//改行表示
			System.out.println();
		}
	}

}
