package ensyu14_3;

// DVDプレーヤ
public class DVDPlayer implements ExPlayer {

	// 再生
	public void play() {
		System.out.println("■ DVD再生開始！");
	}

	// 停止
	public void stop() {
		System.out.println("■ DVD再生終了！");
	}

	// スロー再生
	public void slow() {
		System.out.println("■ DVDスロー再生開始！");
	}

}
