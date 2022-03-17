package ensyu5_1;
// Scannerのインポート
import java.util.Scanner;

/*
	10進整数を読み込んで、その値を8進数と16進数で表示するプログラムを作成せよ
*/
public class ensyu5_1 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("整数：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		
		// 文言表示
		System.out.printf("8進数では%oです。\n", n);
		// 文言表示
		System.out.printf("16進数では%xです。\n", n);
	}

}
