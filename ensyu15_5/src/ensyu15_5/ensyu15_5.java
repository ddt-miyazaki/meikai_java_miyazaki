package ensyu15_5;

import java.util.Scanner;

/*
	3人で行うジャンケンプログラムを作成せよ
	プレーヤ2人のうち、コンピュータを2人として、人間を1人とすること
	また、演習13-3で作成した、プレーやクラスを利用すること
*/
public class ensyu15_5 {

	public static void main(String[] args) {
		// Scannerのインスタンス化
		Scanner stdIn = new Scanner(System.in);
		// ジャンケンを再度行うかを管理する
		int retry;
		// 人間プレイヤーの名前登録
		System.out.print("名前を入力してください：");
		// 人間プレイヤー
		Player p = new Player(stdIn.nextLine());
		// コンピュータプレイヤー1
		ComPlayer cp1 = new ComPlayer("com1");
		// コンピュータプレイヤー2
		ComPlayer cp2 = new ComPlayer("com2");
		// プレイヤー配列
		AbsPlayer[] players =  {cp1, cp2, p};
		
		
		do {
			// プレイヤー配列内のプレイヤーに対する処理
			for (AbsPlayer ap : players)
				// プレイヤーにジャンケンの手を決めさせる
				ap.play();
			
			// 全員の手を開示
			for (AbsPlayer ap : players)
				// プレイヤーの名前と手を結合して表示
				System.out.println(ap.getName() + "は" + ap.getHand() + "を出しました。");
			
			// ジャンケンの結果発表
			// あいこの処理（全員同じ手）
			if (p.getSelectHand() == cp1.getSelectHand() && p.getSelectHand() == cp2.getSelectHand())
				System.out.println("引き分けです。");
			// あいこの処理（全員違う手）
			else if (p.getSelectHand() != cp1.getSelectHand() && p.getSelectHand() != cp2.getSelectHand() && cp1.getSelectHand() != cp2.getSelectHand())
				System.out.println("引き分けです。");
			// 勝ちの処理（あいこの処理が終わっているのでcp1かcp2に勝っていれば勝ち）
			else if ((p.getSelectHand() - cp1.getSelectHand() + 3) % 3 == 2 || (p.getSelectHand() - cp2.getSelectHand() + 3) % 3 == 2)
				System.out.println("あなたの勝ちです。");
			// 負けの処理（他の処理が終わっているのでここまで到達したら負け）
			else
				System.out.println("あなたの負けです。");
				
			// もう一度行うかどうか確認
			do {
				System.out.print("もう一度？ (0)いいえ (1)はい：");
				retry = stdIn.nextInt();
			} while (retry !=0 && retry != 1);
			
		} while (retry == 1);

	}

}
