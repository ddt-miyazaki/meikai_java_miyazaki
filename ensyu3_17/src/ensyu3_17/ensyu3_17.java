package ensyu3_17;
// Randomのインポート
import java.util.Random;

/*
	0,1,2の何れかの値の乱数を生成し、
	0であれば"グー"を、1であれば"チョキ"を、2であれば"パー"を表示するプログラムを作成せよ
*/
public class ensyu3_17 {

	public static void main(String[] args) {
		// 変数の初期化
		Random rand = new Random();
		
		// 0,1,2の何れかを生成
		int hand = rand.nextInt(3);
		
		// 値の判定
		switch (hand) {
			// 0ならばグーを表示
			case 0 : System.out.println("グー"); break;
			// 1ならばチョキを表示
			case 1 : System.out.println("チョキ"); break;
			// 2ならばパーを表示
			case 2 : System.out.println("パー"); break;
		}
		
	}

}
