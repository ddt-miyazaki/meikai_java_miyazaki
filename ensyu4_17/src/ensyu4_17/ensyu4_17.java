package ensyu4_17;
// Scannerのインポート
import java.util.Scanner;

/*
	読み込んだ整数値のすべての約数を表示するlist4-13を書き換えて、
	約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ
*/
public class ensyu4_17 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("整数値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		// カウント変数の初期化
		int count = 0;
		
		// n回繰り返す
		for (int i = 1; i <= n; i++) {
			// nの約数の時
			if (n % i == 0) {
				// 文言表示
				System.out.println(i);
				// カウント追加
				count++;
			}
		}
		// 文言表示
		System.out.print("約数は" + count + "個です。");

	}

}
