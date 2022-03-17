package ensyu6_12;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	配列の要素の並びをシャッフルするプログラムを作成せよ
*/
public class ensyu6_12 {
	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("要素数：");
		// キーボードから入力した値を代入
		int yoso = stdIn.nextInt();
		// 配列の宣言
		int[] a = new int[yoso];
		
		// 要素の数繰り返す
		for (int i = 0; i < yoso; i++) {
			// 乱数を代入
			a[i] = 10 + rand.nextInt(90);
			// 値表示
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		// 要素の数繰り返す
		for (int i = 0; i < yoso; i++) {
			// 入れ替える要素をランダムに指定
			int s1 = rand.nextInt(yoso);
			int s2 = rand.nextInt(yoso);
			// ランダムに指定された要素と要素を入れ替える
			int t = a[s1];
			a[s1] = a[s2];
			a[s2] = t;
		}
		// 文言表示
		System.out.println("要素の並びをシャッフルしました。");
		// 要素の数繰り返す
		for (int i = 0; i < yoso; i++)
			// 値表示
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
