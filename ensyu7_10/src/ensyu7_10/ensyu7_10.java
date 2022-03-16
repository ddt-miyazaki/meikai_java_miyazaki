package ensyu7_10;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	list7-11を拡張して、以下の四つの問題をランダムに出題するプログラムを作成せよ
		x + y + z
		x + y - z
		x - y + z
		x - y - z
*/
public class ensyu7_10 {
	// 変数の初期化
	static Scanner stdIn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		// 文言表示
		System.out.println("暗算力トレーニング！");
		
		// 3桁3項の加減ランダムな式を生成し、正解するまで繰り返す
		do {
			// 式の1項目格納変数
			int x = rand.nextInt(900) + 100;
			// 式の2項目格納変数
			int y = rand.nextInt(900) + 100;
			// 式の3項目格納変数
			int z = rand.nextInt(900) + 100;
			// 演算子をランダムに設定するための変数
			// 0 = -, 1 = +
			// 1つ目の演算子格納変数
			int o1 = rand.nextInt(2);
			// 2つ目の演算子格納変数
			int o2 = rand.nextInt(2);
			
			// 出題された問題に正解するまで処理を繰り返す
			while (true) {
				// 式の表示
				System.out.print(x + stringOperator(o1) + y + stringOperator(o2) + z + " = ");
				// キーボードから読み込んだ解答を変数に格納
				int k = stdIn.nextInt();
				// 解答が式の答えと一致したら
				if (k == x + changeNum(o1, y) + changeNum(o2, z))
					// 同問題の再出題を終わる
					break;
				// 不正解メッセージの表示
				System.out.println("違いますよ！");
			}
		// 続行の確認
		} while (confirmRetry());
	}
	
	// 続行の確認
	static boolean confirmRetry() {
		// 続行意思確認格納変数
		int cont;
		// 続行意思が読み取れるまで繰り返す
		do {
			// 出題を続けるか確認するメッセージの表示
			System.out.print("もう一度？<Yes...1/No...0>：");
			// 続行意思をキーボード入力から読みこむ
			cont = stdIn.nextInt();
		// 0か1が入力されるまで繰り返す
		} while (cont != 0 && cont != 1);
		// キーボード入力が1ならばtrue, 0ならばfalseを返す
		return cont == 1;
	}
	
	// 引数から演算子を割り当てて文字列にして返す
	// 0 = -, 1 = +
	static String stringOperator(int n) {
		// 0ならば-、それ以外ならば+を返す
		return n == 0 ? " - " : " + ";
	}
	
	// 渡された演算子変数に応じて、数値のプラスマイナスを変更する
	// 引数oが、 0 = -, 1 = +
	static int changeNum(int o, int n) {
		// 0ならば-、それ以外ならば+を返す
		return o == 0 ? -n : n;
	}
}
