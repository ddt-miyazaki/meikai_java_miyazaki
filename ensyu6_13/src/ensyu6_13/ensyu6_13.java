package ensyu6_13;
// Randomのインポート
import java.util.Random;

/*
	配列aの全要素を配列bに対して逆順にコピーするプログラムを作成せよ
	なお、二つの配列の要素数は同一であると仮定してよい
*/
public class ensyu6_13 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		final int leng = 4;

		// 配列の宣言
		int[] a = new int[leng];
		int[] b = new int[leng];
		
		// 要素の数繰り返す
		for (int i = 0; i < a.length; i++) {
			// 乱数を代入
			a[i] = 10 + rand.nextInt(90);
			// 値表示
			System.out.println("a[" + i + "] = " + a[i]);
		}
		// 要素の数繰り返す
		for (int i = 0; i < a.length; i++) {
			// 配列bに対して逆順に代入
			b[b.length - i - 1] = a[i];
		}
		// 文言表示
		System.out.println("配列aの全要素を配列bに対して逆順にコピーしました。");
		// 要素の数繰り返す
		for (int i = 0; i < b.length; i++) {
			// 値表示
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}

}
