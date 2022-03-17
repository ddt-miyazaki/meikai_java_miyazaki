package ensyu4_10;
// Scannerのインポート
import java.util.Scanner;

/*
	読み込んだ値が1未満であれば改行文字を出力しないようにlist4-11を書き換えたプログラムを作成せよ
*/
public class ensyu4_10 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("nの値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// nが1以上ならば処理を行う
		if (n > 0) {
			// n回繰り返し
			for (int i = 0; i < n; i++)
				// 文言表示
				System.out.print('*');
			// 改行表示
			System.out.println();
		}

	}

}
