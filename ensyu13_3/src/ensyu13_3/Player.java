package ensyu13_3;
// Scannerクラスのインポート
import java.util.Scanner;

/*
	ジャンケンの《プレーヤ》を表す抽象クラスを定義せよ
	そのクラスから、以下のクラスを派生すること
	・人間プレーヤクラス（出す手をキーボードから読み込む）
	・コンピュータプレーヤクラス（出す手を乱数で生成する）
*/
// 人間プレーヤクラス
public class Player extends AbsPlayer {
	
	// キーボード入力からジャンケンの手を出す
	public String play() {
		// Scannerのインスタンス化
		Scanner stdIn = new Scanner(System.in);
		// キーボード入力値
		int n;
		do {
			// ジャンケンの合図
			System.out.println("ジャンケン...（0:グー/1:チョキ/2:パー）：");
			// 入力値を記憶
			n = stdIn.nextInt();
		// 入力値が指定の範囲外ならば再度行う
		} while (n < 0 || n > 2);
		
		// 入力された値から手を決定して返す
		return getHands()[n];
	}
}
