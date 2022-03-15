package ensyu7_6;

/*
	引数mで指定された月の季節を表示するメソッドprintSeasonを作成せよ
	mが3,4,5であれば「春」、6,7,8であれば「夏」、9,10,11であれば「秋」、12,1,2であれば「冬」と表示し、
	それ以外の値であれば何も表示しないこと
*/
public class ensyu7_6 {
	public static void main(String[] args) {
		// メソッドの実行確認
		printSeason(587);
		printSeason(1);
		printSeason(4);
		printSeason(7);
		printSeason(10);
	}
	
	// 指定された月の季節を表示するメソッド
	static void printSeason(int m) {
		// 季節の判定
		switch (m) {
			// 1,2,12ならば冬と表示
			case 12 :
			case 1 :
			case 2 : System.out.println("それは冬です。"); break;
			// 3,4,5ならば春と表示
			case 3 :
			case 4 :
			case 5 : System.out.println("それは春です。"); break;
			// 6,7,8ならば夏と表示
			case 6 :
			case 7 :
			case 8 : System.out.println("それは夏です。"); break;
			// 9,10,11ならば秋と表示
			case 9 :
			case 10 :
			case 11 : System.out.println("それは秋です。"); break;
		}
	}
}
