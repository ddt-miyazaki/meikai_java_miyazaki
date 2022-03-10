package ensyu4_27;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	list4-3の数あてゲームのプレイヤーが入力できる回数に制限を設けたプログラムを作成せよ
	制限回数内にあてられなかった場合は、正解を表示してゲームを終了すること
*/
public class ensyu4_27 {
	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		// 正解の生成
		int no = rand.nextInt(100);
		
		// ゲーム開始メッセージの表示
		System.out.println("数当てゲーム開始!!");
		System.out.println("0~99の数を当ててください。");
		
		// プレイヤーの入力値保存用変数の初期化
		int x;
		// 制限の設定
		int limit = 3;
		// 解答回数カウント変数の初期化
		int count = 0;
		
		// 繰り返し処理の記述
		do {
			// 文言表示
			System.out.print("いくつかな：");
			// キーボードから入力した値を代入
			x = stdIn.nextInt();
			
			// 入力値が正解よりも大きければ
			if (x > no)
				// 文言表示
				System.out.println("もっと小さな数だよ。");
			// 入力値が正解よりも小さければ
			else if (x < no)
				// 文言表示
				System.out.println("もっと大きな数だよ。");
			// 解答回数をカウント
			count++;
			// 解答回数が制限と同じになったら
			if (count == limit) {
				// 正解の表示
				System.out.println("正解は" + no +"でした。");
				// 処理終了
				break;
			}
		// 不正解ならば繰り返す
		} while (x != no);
		
		// 解答回数が制限を超えなければ
		if (count < limit) {
			// 正解メッセージの表示
			System.out.println("正解です。");
		}
	}
}
