package ensyu6_7;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	list6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである
	もっとも末尾側に位置する要素を見つけるプログラムを作成せよ
*/
public class ensyu6_7 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		// 要素数
		final int n = 12;
		// 配列を宣言
		int[] a = new int[n];
		
		// 要素の数繰り返す
		for (int j = 0; j < n; j++)
			// 乱数を代入
			a[j] = rand.nextInt(10);
		
		// 文言表示
		System.out.print("配列aの全要素の値\n{ ");
		// 要素の数繰り返す
		for (int j = 0; j < n; j++) 
			// 要素の値表示
			System.out.print(a[j] + " ");
		// 文言表示
		System.out.println("}");
		
		// 文言表示
		System.out.print("探す数値：");
		// 入力された値をキーに設定
		int key = stdIn.nextInt();
		
		// 変数の初期化
		int i;
		
		// 要素の後ろから処理を繰り返す
		for (i = n - 1; i >= 0; i--)
			// キーとマッチしたら
			if (a[i] == key) 
				// 処理を抜ける
				break;
		
		// 全てのループを繰り返す前ならば
		if (i >= 0)
			// 文言表示
			System.out.println("それはa[" + i + "]にあります。");
		// そうでなければ
		else
			// 文言表示
			System.out.println("それはありません。");
	}

}
