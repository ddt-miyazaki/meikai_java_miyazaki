package System.out;
// Scannerのインポート
import java.util.Scanner;

/*
	正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ
*/
public class ensyu4_8 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("整数値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		// 桁数のカウント変数の初期化
		int i = 0;
		// 入力された値が0ならば
		if (n == 0) {
			// 1桁として設定
			i = 1;
			// 正の整数ならば
		} else {
				// 0以下になるまで
			while (n > 0) {
				// 10で割り、代入する
				n /=10;
				// 桁数のインクリメント
				i++;
			}
		}
		// 桁数の表示
		System.out.println("その値は" + i + "桁です。");
	}

}
