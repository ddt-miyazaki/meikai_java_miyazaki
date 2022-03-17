package ensyu6_11;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	異なる要素が同じ値を持つことのないように演習6-9のプログラムを改良したプログラムを作成せよ
	配列の要素数は10以下であるとする
*/
public class ensyu6_11 {
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
			// 配列に直接代入せずに一度よけておく
			int n;
			// 重複フラグ
			boolean dup_flg = true;
			// 繰り返し処理
			do {
				// 乱数を生成し代入
				n = 1 + rand.nextInt(10);
				// 配列の個数分繰り返す
				for (int j : a) {
					// 配列内の値と新規に代入する値が異なれば重複フラグfalse
					if (j != n) {
						dup_flg = false;
					// 一致した場合、重複フラグtrue
					} else {
						dup_flg = true;
					}
					// 重複していた場合、配列の走査を終了
					if (dup_flg)
						break;
				}
				// 重複している場合、乱数の生成からやりなおし
			} while (dup_flg);
			
			// 配列に生成した乱数を代入
			a[i] = n;
			// 文言表示
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
