package ensyu6_19;
// Scannerのインポート
import java.util.Scanner;

/*
	クラス数・各クラスの人数・全員の点数を読み込んで、点数の合計点と平均点を求めるプログラムを作成せよ
	合計点と平均点は、クラスごとのものと、全体のものとを表示すること
*/
public class ensyu6_19 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 配列の初期化
		int [][] c;
		// 計算用の値保持変数
		int ninzu = 0;
		int total_sum = 0;
		
		// 文言表示
		System.out.print("クラス数：");
		// キーボードから入力した値でクラス数設定
		c  = new int[stdIn.nextInt()][];
		// 合計点保持配列
		int [] sum = new int [c.length];
		
		// 要素の数繰り返し、クラスごとの人数、点数を設定
		for (int i = 0; i < c.length; i++) {
			// 文言表示
			System.out.print(i + 1 + "組の人数：");
			// キーボードから入力した値で人数設定
			c[i]  = new int[stdIn.nextInt()];
			ninzu += c[i].length;
			
			// 人数分繰り返す
			for (int j = 0; j < c[i].length; j++) {
				// 文言表示
				System.out.print(i + 1 + "組" + (j + 1) + "番の点数：");
				// キーボードから入力した値で点数設定
				c[i][j]  = stdIn.nextInt();
				// 合計点保持配列に加算
				sum[i] += c[i][j];
				// 全体の合計点保持変数に加算
				total_sum += c[i][j];
			}
		}
		// 文言表示
		System.out.printf("組\t合計\t平均\n");
		// 要素の数繰り返す
		for (int i = 0; i < c.length; i++) {
			// 文言表示
			System.out.printf("%d組\t", i + 1);
			// 合計点表示
			System.out.printf("%d\t", sum[i]);
			// 平均点表示
			System.out.printf("%.1f\n", (double)sum[i] / c[i].length);
		}
		// 文言表示
		System.out.printf("計\t");
		// 合計点表示
		System.out.printf("%d\t", total_sum);
		// 平均点表示
		System.out.printf("%.1f\n", (double)total_sum / ninzu);
		
	}

}
