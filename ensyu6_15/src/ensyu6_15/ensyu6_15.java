package ensyu6_15;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成せよ
	・出題する曜日は乱数で生成する
	・学習者が望む限り、何度も繰り返せる
	・同一曜日を連続して出題しない	
*/
public class ensyu6_15 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		String[] weekString = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
		String[] weekStringJp = {"日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"};
		
		// 文言表示
		System.out.println("英語の曜日名を小文字で入力してください。");
		
		// 問題の曜日の指定
		int week = rand.nextInt(7);
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
					next_question = rand.nextInt(7);
				// 前回の問題と同じ場合やりなおし
				} while (week == next_question);
			}
			
			// 次の問題を設定
			week = next_question;
			
			// 文言表示
			System.out.print(weekStringJp[week] + "：");
			// プレイヤーの回答
			String s = stdIn.next();
			// 正解ならば
			if (weekString[week].equals(s)) {
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
