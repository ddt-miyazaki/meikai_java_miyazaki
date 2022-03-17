package ensyu4_2;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

/*
	2桁の整数値（10~99）を当てさせる≪数当てゲーム≫を作成せよ
*/
public class ensyu4_2 {
	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		// 正解の生成
		int no = rand.nextInt(90) + 10;
		
		// ゲーム開始メッセージの表示
		System.out.println("数当てゲーム開始!!");
		System.out.println("10~99の数を当ててください。");
		
		// プレイヤーの入力値保存用変数の初期化
		int x;
		
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
		// 不正解ならば繰り返す
		} while (x != no);
		
		// 正解メッセージの表示
		System.out.println("正解です。");
	}
}
