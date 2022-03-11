package ensyu5_6;

/*
	list5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
	list5-10のように、int型の変数を0から1000までインクリメントした値を1000で割った値を求める様子を、
	横に並べて表示するプログラムを作成せよ
*/
public class ensyu5_6 {

	public static void main(String[] args) {
		// 変数の初期化
		float x = 0.0F;
		
		// 文言表示
		System.out.println("     float             int");
		System.out.println("------------------------------");
		
		// 1000回繰り返し
		for (int i = 0; i <= 1000; i++) {
			// 0.0から1.0まで0.001ずつ増やして表示
			System.out.printf("%1.7f", x);
			// 空白表示
			System.out.print("   ");
			// 0から1000までインクリメントした値を1000で割った値を表示
			System.out.printf("%1.7f", (float)i / 1000);
			// 改行
			System.out.println();
			// 0.001ずつ増やす
			x += 0.001F;
		}
	
	}

}
