package ensyu4_7;
// Scannerのインポート
import java.util.Scanner;

/*
	読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ
	表示は*と+を交互に行うこと
*/
public class ensyu4_7 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("何個表示しますか：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// 変数の初期化
		int i = 0;
		// 読み込んだ値の回数繰り返す
		while (i < n) {
			// iの値が偶数なら*奇数なら+を表示
			System.out.print(i % 2 == 0 ? '*' : '+');
			// インクリメント
			i++;
		}
		// 改行
		System.out.println();

	}

}
