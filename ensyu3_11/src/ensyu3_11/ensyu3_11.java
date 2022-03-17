package ensyu3_11;
// Scannerのインポート
import java.util.Scanner;

/*
	右に示すように、二つの正数値を読み込んで、それらの値の差が10以下であれば「それらの差は10以下です。」と表示し、
	そうでなければ「それらの差は11以上です。」と表示するプログラムを作成せよ
*/
public class ensyu3_11 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数A：");
		// キーボードから入力した値を代入
		int a = stdIn.nextInt();

		// 文言表示
		System.out.print("整数B：");
		// キーボードから入力した値を代入
		int b = stdIn.nextInt();

		// 差の計算結果を代入
		int res = a > b ? a - b : b - a;
		// 値の差を判定して表示
		System.out.println("それらの差は" + (res <= 10 ? "10以下" :	"11以上") + "です。");
	
	}

}
