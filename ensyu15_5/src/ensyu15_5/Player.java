package ensyu15_5;
// Scannerクラスのインポート
import java.util.Scanner;

// 人間プレーヤクラス
public class Player extends AbsPlayer {
	
	// コンストラクタ
	// 引数からnameを設定
	public Player(String name) {
		super(name);
	}

	// キーボード入力からジャンケンの手を出す
	public void play() {
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

		// 入力された値から手を決定し、自身にセットする
		setSelectHand(n);
	}
}