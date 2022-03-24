package ensyu14_3;

/*
	クラスDVDPlayerを利用するプログラム例を作成せよ
*/
public class ensyu14_3 {

	public static void main(String[] args) {
		// DVDPlayer型のときすべてのメソッドが定義されているのですべて利用できる
		DVDPlayer dp = new DVDPlayer();
		dp.play();
		dp.stop();
		dp.slow();
		
		// ExPlayer型のときすべてのメソッドが定義されているのですべて利用できる
		ExPlayer ep = new DVDPlayer();
		ep.play();
		ep.stop();
		ep.slow();
		
		// Player型のときslowメソッドが定義されていないのでエラーとなる
		Player p = new DVDPlayer();
		p.play();
		p.stop();
//		p.slow();
		
	}

}
