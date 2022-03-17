package ensyu4_21;
// Scannerのインポート
import java.util.Scanner;

/*
	直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ
*/
public class ensyu4_21 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("左上直角の三角形を表示します。");
		System.out.print("段数は：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// n回繰り返し（三角形の縦）
		for (int i = n; i > 0; i--) {
			// n回繰り返し（三角形の横）
			for (int j = i; j > 0; j--)
				//文言表示
				System.out.print('*');
			//改行表示
			System.out.println();
		}
	}
}
