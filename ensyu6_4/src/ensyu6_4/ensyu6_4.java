package ensyu6_4;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	list6-5を書き換えて、右に示すように縦向きの棒グラフで表示するプログラムを作成せよ
	最下段には、インデックスを10で割った剰余を表示すること
*/
public class ensyu6_4 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("要素数：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		// 入力された値で配列作成
		int[] a = new int[n];
		// 表示する線変数の初期化
		String line = "";
		
		// 入力された値の回数繰り返す
		for (int i = 0; i < n; i++) {
			// 1~10の乱数を代入
			a[i] =1 + rand.nextInt(10);
			// 線を伸ばす
			line += "---";
		}
		
		// *表示時の比較変数
		int x = 10;
		// 10段分繰り返し
		for (int i = 0; i < 10; i++) {
			// 入力された値の回数繰り返す
			for (int j = 0; j < n; j++) {
				// 現在扱っている変数が比較変数以上の値ならば
				if (a[j] >= x)
					// *を表示
					System.out.print("*\t");
				//　そうでなければ
				else
					// 空白表示
					System.out.print(" \t");
			}
			// 比較変数を減らす
			x--;
			// 改行
			System.out.println();
		}
		// 線を表示
		System.out.println(line);
		// 入力された値の回数繰り返す
		for (int i = 0; i < n; i++)
			// インデックスを10で割った剰余を表示
			System.out.print(i % 10 + "\t");
	}

}
