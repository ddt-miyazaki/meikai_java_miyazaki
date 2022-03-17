package ensyu2_4;
// Scannerのインポート
import java.util.Scanner;

// キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ
public class ensyu2_4 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("整数値：");
		
		// キーボードから入力した値を代入
		int x = stdIn.nextInt();
		
		//10を加えた値の表示
		System.out.println("10を加えた値は" + ( x + 10) + "です。");
		
		//10を減じた値の表示
		System.out.println("10を減じた値は" + ( x - 10) + "です。");

	}

}
