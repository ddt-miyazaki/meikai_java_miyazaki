package ensyu13_3;
// Randomクラスのインポート
import java.util.Random;

/*
	ジャンケンの《プレーヤ》を表す抽象クラスを定義せよ
	そのクラスから、以下のクラスを派生すること
	・人間プレーヤクラス（出す手をキーボードから読み込む）
	・コンピュータプレーヤクラス（出す手を乱数で生成する）
*/
// コンピュータプレーヤクラス
public class ComPlayer extends AbsPlayer {

	// 乱数からジャンケンの手を出す
	public String play() {
		// Randomのインスタンス化
		Random rand = new Random();
		// 乱数から手を決定して返す
		return getHands()[rand.nextInt(3)];
		
	}
}
