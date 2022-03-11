package ensyu5_5;
// Scannerのインポート
import java.util.Scanner;

/*
	三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ
	平均はキャスト演算子を利用して求め、実数として表示すること
*/
public class ensyu5_5 {

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
		
		// 合計の計算
		int sum = x + y + z;
		// 平均の計算
		double avg = (double) sum / 3;
		
		// 文言表示
		System.out.println("xとyとzの合計は" + sum + "です。");
		System.out.println("xとyとzの平均は" + avg + "です。");

	}

}
