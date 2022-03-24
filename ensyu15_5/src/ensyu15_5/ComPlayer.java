package ensyu15_5;
// Randomクラスのインポート
import java.util.Random;

// コンピュータプレーヤクラス
public class ComPlayer extends AbsPlayer {

	// コンストラクタ
	// 引数からnameを設定
	public ComPlayer(String name) {
		super(name);
	}

	// 乱数からジャンケンの手を出す
	public void play() {
		// Randomのインスタンス化
		Random rand = new Random();
		// 乱数から手を決定し、自身にセットする
		setSelectHand(rand.nextInt(3));
	}
}