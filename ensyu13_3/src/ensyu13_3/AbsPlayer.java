package ensyu13_3;

/*
	ジャンケンの《プレーヤ》を表す抽象クラスを定義せよ
	そのクラスから、以下のクラスを派生すること
	・人間プレーヤクラス（出す手をキーボードから読み込む）
	・コンピュータプレーヤクラス（出す手を乱数で生成する）
*/
// プレイヤー抽象クラス
public abstract class AbsPlayer {
	// ジャンケンの手
	private String[] hands = {"グー", "チョキ", "パー"};
	
	// handsのゲッタ
	public String[] getHands() {
		return hands;
	}
	
	// ジャンケンの手を出す抽象メソッド
	public abstract String play();
}
