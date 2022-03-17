package ensyu6_17;
// Scannerのインポート
import java.util.Scanner;

/*
	6人の2科目（国語・数学）の点数を読み込んで、
	科目ごとの平均点、学生ごとの平均点を求めるプログラムを作成せよ
*/
public class ensyu6_17 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		
		// 計算に使用する配列の初期化
		int [][] x = new int [6][2];
		// 計算結果格納配列
		int [] stu_total = new int [6];
		int kokugo = 0;
		int sugaku = 0;
		
		// 要素の数繰り返し、学生の点数を配列にを代入する
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				// 文言表示
				System.out.print(i + 1 +"人目の" + (j == 0 ? "国語" : "数学") + "の点数：");
				// キーボードから入力した値を代入
				x[i][j]  = stdIn.nextInt();
			}
		}
		
		// 要素の数繰り返し、点数を加算する
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				// 計算結果を加算する
				stu_total[i] += x[i][j];
				// jが0のとき
				if (j == 0)
					// 国語の点数に加算
					kokugo += x[i][j];
				// そうでなければ
				else
					// 数学の点数に加算
					sugaku += x[i][j];
			}
		}
		
		// 計算結果表示
		System.out.println("国語の平均点は" + kokugo / x.length + "です。");
		System.out.println("数学の平均点は" + sugaku / x.length + "です。");
		
		// 要素の数繰り返す
		for (int i = 0; i < stu_total.length; i++) {
			// 計算結果表示
			System.out.println(i + 1 +"人目の平均点は" + stu_total[i] / x[0].length + "です。");
		}
		
	}

}
