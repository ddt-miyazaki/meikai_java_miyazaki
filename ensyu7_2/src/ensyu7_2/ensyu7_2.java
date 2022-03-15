package ensyu7_2;

/*
	三つのint型引数a,b,cの最小値を求めるメソッドminを作成せよ
*/
public class ensyu7_2 {

	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(min(1, 2, 3));
		System.out.println(min(3, 2, 1));
		System.out.println(min(2, 1, 3));
	}
	
	// 三つのint型引数a,b,cの最小値を求めるメソッド
	static int min(int a, int b, int c) {
		// aを最小値として設定
		int min = a;
		// bの方が小さければbを最小値として設定
		if (min > b) min = b;
		// cの方が小さければcを最小値として設定
		if (min > c) min = c;
		// minを返す
		return min;
	}
}
