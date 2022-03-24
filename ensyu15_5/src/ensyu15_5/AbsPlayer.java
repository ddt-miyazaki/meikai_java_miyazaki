package ensyu15_5;

// プレイヤー抽象クラス
public abstract class AbsPlayer {
	// プレイヤーの名前
	private String name;
	// ジャンケンの手
	private String[] hands = {"グー", "チョキ", "パー"};
	// 選択したジャンケンの手
	private int selectHand;

	// コンストラクタ
	// 引数からnameを設定
	public AbsPlayer(String name) {
		this.name = name;
	}
	
	// nameのゲッタ
	public String getName() {
		return name;
	}
	
	// handsのゲッタ
	public String[] getHands() {
		return hands;
	}
	
	// selectHandのゲッタ
	public int getSelectHand() {
		return selectHand;
	}
	
	// selectHandとHandから手を文字列にして返す
	public String getHand() {
		return hands[selectHand];
	}
	
	// selectHandのセッタ
	public void setSelectHand(int n) {
		selectHand = n;
	}
	
	// ジャンケンの手を出す抽象メソッド
	public abstract void play();
}