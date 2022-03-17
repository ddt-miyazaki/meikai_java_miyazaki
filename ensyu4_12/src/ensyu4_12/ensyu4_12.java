package ensyu4_12;
// Scannerのインポート
import java.util.Scanner;

/*
	全問とは逆に、0から正の整数値までカウントアップするプログラムを作成せよ
*/
public class ensyu4_12 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("カウントダウンします。");
		// 変数の初期化
		int x;
		// 繰り返し処理の記述
		do {
			// 文言表示
			System.out.print("正の整数値：");
			// キーボードから入力した値を代入
			x = stdIn.nextInt();
		// 1以上の値が入力されるまで繰り返す
		} while (x <= 0);
		
		// 0からxになるまで繰り返す
		for (int i = 0; i <= x; i++) {
			// 文言表示
			System.out.println(i);
		}

	}

}
