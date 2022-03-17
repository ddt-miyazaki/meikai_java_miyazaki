package ensyu3_3;
//Scannerのインポート
import java.util.Scanner;

//list3-5の最後のelseを、else if (n == 0)に変更したらどうなるかを検討せよ
public class ensyu3_3 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数値：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();

		// nがプラスならば
		if (n > 0)
			// 文言表示
			System.out.println("その値は正です。");
		// nがマイナスならば
		else if (n < 0)
			// 文言表示
			System.out.println("その値は負です。");
		// nが0ならば
		else if (n == 0)
			// 文言表示
			System.out.println("その値は0です。");

	}
}
