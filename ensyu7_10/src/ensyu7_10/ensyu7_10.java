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
		
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			while (true) {
				System.out.print(x + " + " + y + " + " + z + " = ");
				int k = stdIn.nextInt();
				if (k == x + y + z)
					break;
				System.out.println("違いますよ！");
			}
		
		
		} while (confirmRetry());
		// メソッドの実行確認
		
	}
	
	// 続行の確認
	static boolean confirmRetry() {
		int cont;
		do {
			System.out.print("もう一度？<Yes...1/No...0>：");
			cont = stdIn.nextInt();
		} while (cont != 0 && cont != 1);
		return cont == 1;
	}
}
