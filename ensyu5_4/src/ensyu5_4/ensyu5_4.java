package ensyu5_4;
// Scannerのインポート
import java.util.Scanner;

/*
	三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ
	平均は実数として表示すること
*/
public class ensyu5_4 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.println("整数値xとyとzの合計と平均を求めます。");
		System.out.print("x：");
		// キーボードから入力した値を代入
		int x = stdIn.nextInt();
		// 文言表示
		System.out.print("y：");
		// キーボードから入力した値を代入
		int y = stdIn.nextInt();
		// 文言表示
		System.out.print("z：");
		// キーボードから入力した値を代入
		int z = stdIn.nextInt();
		
		int sum = x + y + z;
		double avg = sum / 3.0;
		
		System.out.println("xとyとzの合計は" + sum + "です。");
		System.out.println("xとyとzの平均は" + avg + "です。");

	}

}
