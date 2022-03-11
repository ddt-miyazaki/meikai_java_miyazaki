package ensyu6_9;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	要素型がint型である配列を作り、全要素を1~10の乱数で埋め尽くす（1以上10以下の値を代入する）プログラムを作成せよ
	要素数はキーボードから読み込むこと
*/
public class ensyu6_9 {

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
			// 乱数を生成し代入
			a[i] = 1 + rand.nextInt(10);
			// 文言表示
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
