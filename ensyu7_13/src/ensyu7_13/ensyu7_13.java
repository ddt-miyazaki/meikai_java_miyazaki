package ensyu7_13;

/*
	整数xのposビット目を、
	1にした値を返すメソッドset、
	0にした値を返すメソッドreset、
	反転した値を返すメソッドinverseを作成せよ
*/
public class ensyu7_13 {
	public static void main(String[] args) {
		// 書き換える値
		final int X = 24;
		// 何ビット目を書き換えるのか
		final int POSITION = 2;
		
		// XのPOSITIONビット目を1にした値を表示
		System.out.println(set(X, POSITION));
		// XのPOSITIONビット目を0にした値を表示
		System.out.println(reset(X, POSITION));
		// XのPOSITIONビット目を反転した値を表示
		System.out.println(inverse(X, POSITION));
	}
	
	// 整数xのposビット目を1にした値を返す
	static int set(int x, int pos) {
		// 1を左シフトすることでposビット目が1の値を作る
		// xとその値の論理和がposビット目を1にした値なのでそれを返す
		return x | 1 << pos;
	}
	
	// 整数xのposビット目を0にした値を返す
	static int reset(int x, int pos) {
		// 1を左シフトすることでposビット目が1の値を作る
		// その補数を取ることでposビット目が0で、他が1の値を作る
		// xとその値の論理積を取ることでposビット目以外でもともと1だった部分は1、もともと0だった部分は0のまま、
		// posビット目は0になるのでそれを返す
		return x & ~(1 << pos);
	}
	
	// 整数xのposビット目を反転した値を返す
	static int inverse(int x, int pos) {
		// 1を左シフトすることでposビット目が1の値を作る
		// xとその値の排他的論理和を取ることで、もとの値が1ならば0、0ならば1となり、
		// posビット目の値が反転するのでそれを返す
		return x ^ 1 << pos;
	}
}
