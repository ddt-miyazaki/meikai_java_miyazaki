package ensyu6_8;
// Scannerのインポート
import java.util.Scanner;

/*
	double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ
	要素数と全要素の値はキーボードから読み込むこと
*/
public class ensyu6_8 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("要素数：");
		// キーボードから入力した値を代入
		int yoso = stdIn.nextInt();
		// 配列の宣言
		double[] a = new double[yoso];
		
		// 入力された値の回数繰り返す
		for (int i = 0; i < yoso; i++) {
			// 文言表示
			System.out.print("a[" + i + "] = ");
			// キーボードから入力した値を代入
			a[i] = stdIn.nextDouble();
		}
		
		// 合計値
		double sum = 0;
		
		// 要素の数繰り返す
		for (double i : a)
			// 合計値に加算
			sum += i;
		
		System.out.println("全要素の合計値は" + sum + "で、平均値は" + sum / yoso + "です。");
	}
}
