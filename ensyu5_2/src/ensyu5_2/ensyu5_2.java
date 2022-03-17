package ensyu5_2;
// Scannerのインポート
import java.util.Scanner;

/*
	float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ
*/
public class ensyu5_2 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		System.out.print("x：");
		// キーボードから入力した値をfloat変数に代入
		float x = stdIn.nextFloat();
		// 文言表示
		System.out.print("y：");
		// キーボードから入力した値をdouble変数に代入
		double y = stdIn.nextDouble();
		// 文言表示
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}
