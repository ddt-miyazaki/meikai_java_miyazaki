package ensyu3_10;
// Scannerのインポート
import java.util.Scanner;

// 二つの正数値を読み込んで、それらの値の差を表示するプログラムを作成せよ
public class ensyu3_10 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数a：");
		// キーボードから入力した値を代入
		int a = stdIn.nextInt();

		// 文言表示
		System.out.print("整数b：");
		// キーボードから入力した値を代入
		int b = stdIn.nextInt();

		// 値の差を表示
		System.out.println("値の差は" + (a > b ? a - b : b - a) + "です。");
	
	}

}
