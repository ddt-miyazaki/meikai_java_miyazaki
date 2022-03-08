package ensyu2_5;
// Scannerのインポート
import java.util.Scanner;

// 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ
public class ensyu2_5 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		
		// 文言表示
		System.out.print("xの値：");
		
		// キーボードから入力した値を代入
		double x = stdIn.nextDouble();
		
		// 文言表示
		System.out.print("yの値：");
		
		// キーボードから入力した値を代入
		double y = stdIn.nextDouble();

		// 合計の表示
	    System.out.println("合計は" + (x + y) + "です。");
		
		// 平均の表示
	    System.out.println("平均は" + (x + y) / 2 + "です。");

	}

}
