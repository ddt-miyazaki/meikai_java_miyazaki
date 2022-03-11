package ensyu6_14;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	月を1~12の数値として表示して、その英語表現を入力させる英単語学習プログラムを作成せよ
	・出題する月の値は乱数で生成する
	・学習者が望む限り、何度も繰り返せる
	・同一月を連続して出題しない	
*/
public class ensyu6_14 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] monthString = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};
		
		// 文言表示
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします。");
		
		// 問題の月の指定
		int month = rand.nextInt(12);
		// 次の問題の指定
		int next_question = 0;
		// リトライフラグ
		boolean retry = true;
		// 正解フラグ
		boolean answer = true;
		// 繰り返し処理
		do {
			// 前回正解していたならば問題を変更する
			if (answer) {
				// 繰り返し処理
				do {
					// 問題の指定
					next_question = rand.nextInt(12);
				// 前回の問題と同じ場合やりなおし
				} while (month == next_question);
			}
			
			// 次の問題を設定
			month = next_question;
			
			// 文言表示
			System.out.print(month + 1 + "月：");
			// プレイヤーの回答
			String m = stdIn.next();
			// 正解ならば
			if (monthString[month].equals(m)) {
				// 正解フラグをtrueに
				answer = true;
				// 文言表示
				System.out.print("正解です。もう一度？1...Yes/0...No：");
				// 1が入力されたらリトライフラグをtrueに、それ以外はfalse
				retry = stdIn.nextInt() == 1;
			// 不正解ならば
			} else {
				// 正解フラグをfalseに
				answer = false;
				// 文言表示
				System.out.println("違います。");
			}
		// リトライフラグでループ管理
		} while(retry);
		
	}

}
