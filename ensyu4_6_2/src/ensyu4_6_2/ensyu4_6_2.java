package ensyu4_6_2;
// Scannerのインポート
import java.util.Scanner;

/*
	読み込んだ値が1未満であれば改行文字を出力しないように
	list4-7およびlist4-8を書き換えたプログラムをそれぞれ作成せよ
*/
public class ensyu4_6_2 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("何個*を表示しますか：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// 変数の初期化
		int i = 1;
		// 読み込んだ値が1以上であれば処理をする
		if (n > 0) {
			// 読み込んだ値の回数繰り返す
			while (i <= n) {
				// 文言表示
				System.out.print('*');
				// インクリメント
				i++;
			}
			// 改行
			System.out.println();
		}

	}

}
