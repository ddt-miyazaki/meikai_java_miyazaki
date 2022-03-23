package ensyu13_3;

// ジャンケンプレイヤークラスのテスト
public class ensyu13_3 {

	public static void main(String[] args) {
		// 人間プレイヤー
		Player p = new Player();
		// キーボード入力から手を選べることの確認
		System.out.println(p.play());
		
		// コンピュータプレイヤー
		ComPlayer cp = new ComPlayer();
		// ランダムに手を出すことの確認
		System.out.println(cp.play());
	}

}
