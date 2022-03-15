package ensyu7_8;
// Randomのインポート
import java.util.Random;

/*
	a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成せよ
	内部で乱数を生成する標準ライブラリを呼び出すこと
	なお、bの値がaより小さい場合には、aの値をそのまま返却すること
*/
public class ensyu7_8 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(random(6, 3));
		System.out.println(random(7, 8));
		System.out.println(random(5, 100));
	}
	
	// a以上b未満の乱数を生成して、その値を返却するメソッド
	static int random(int a, int b) {
		// bの値がaより小さい場合には、aの値をそのまま返却
		if (a > b) return a;
		// 変数の初期化
		Random rand = new Random();
		// 乱数を生成
		int ret = rand.nextInt(b);
		// 生成した乱数がaよりも小さい限り
		while (ret < a)
			// 再度乱数生成
			ret = rand.nextInt(b);
		// 生成した乱数を返す
		return ret;
	}
}
