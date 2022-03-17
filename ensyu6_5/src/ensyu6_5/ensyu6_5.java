package ensyu6_5;
// Scannerのインポート
import java.util.Scanner;

/*
	配列の要素数と、個々の要素の値を読み込んで、右のように各要素の値を表示するプログラムを作成せよ
	表示の形式は、初期化子と同じ形式、すなわち各要素の値をコンマで区切って{}で囲んだ形式にすること
*/
public class ensyu6_5 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("要素数：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();
		// 入力された値で配列作成
		int[] a = new int[n];
		//カンマ区切りの配列要素文字列変数の初期化
		String yoso = "";
		
		// 入力された値の回数繰り返す
		for (int i = 0; i < n; i++) {
			// 文言表示
			System.out.print("a[" + i + "] = ");
			// 入力された値を代入
			a[i] = stdIn.nextInt();
			// 要素表示用変数に代入していく、最後の要素でなければカンマで区切る
			yoso += a[i] + (i != n - 1 ? ", " : "");
		}
			// 各要素の値をコンマで区切って{}で囲んだ形式で表示
			System.out.println("a = {" + yoso + "}");
	}

}
