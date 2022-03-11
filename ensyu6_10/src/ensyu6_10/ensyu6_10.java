package ensyu6_10;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	連続する要素が同じ値を持つことのないように演習6-9のプログラムを改良したプログラムを作成せよ
*/
public class ensyu6_10 {

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
		
		// 入力された値の回数繰り返す
		for (int i = 0; i < yoso; i++) {
			// 繰り返し処理
			do {
				// 乱数を生成し代入
				a[i] = 1 + rand.nextInt(10);
				// 初回のみ無条件で次の処理へ
				if (i == 0) break;
			// 一つ前の要素と同じ値の場合やりなおし
			} while (a[i] == a[i - 1]);
			// 文言表示
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
