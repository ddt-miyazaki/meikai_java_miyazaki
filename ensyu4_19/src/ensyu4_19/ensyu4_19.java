package ensyu4_19;
// Scannerのインポート
import java.util.Scanner;

/*
	季節を求めるlist4-1の月の読み込みにおいて、1~12以外の値が入力された場合は、
	再入力させるように修正したプログラムを作成せよ
	(do文の中にdo文が入る二重ループとなる)
*/
public class ensyu4_19 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// リトライ変数の初期化
		int retry;
		
		// 繰り返し処理の記述
		do {
			// 変数の初期化
			int month;
			// 繰り返し処理の記述
			do {
				// 文言表示
				System.out.print("季節を求めます。\n何月ですか：");
				// キーボードから入力した値を代入
				month = stdIn.nextInt();
			// 1~12以外の値が入力された場合繰り返し
			} while (month < 1 || month >12);
			// 3~5ならば
			if (month >= 3 && month <= 5)
				// 文言表示
				System.out.println("それは春です。");
			// 6~8ならば
			else if (month >= 6 && month <= 8)
				// 文言表示
				System.out.println("それは夏です。");
			// 9~11ならば
			else if (month >= 9 && month <= 11)
				// 文言表示
				System.out.println("それは秋です。");
			// 12, 1, 2ならば
			else if (month == 12 || month == 1 || month == 2)
				// 文言表示
				System.out.println("それは冬です。");
			
			// 文言表示
			System.out.print("もう一度？ 1...Yes/0...No：");
			// リトライ変数へ代入
			retry = stdIn.nextInt();
		// 1が入力されたら繰り返し
		} while (retry == 1);
		
	}

}
