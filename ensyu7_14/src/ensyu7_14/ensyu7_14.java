package ensyu7_14;

/*
	整数xのposビット目を最下位として連続するn個のビットを、
	1にした値を返すメソッドsetN、
	0にした値を返すメソッドresetN、
	反転した値を返すメソッドinverseNを作成せよ
*/
public class ensyu7_14 {
	public static void main(String[] args) {
		// 書き換える値
		final int X = 180;
		// 何ビットから書き換えるのか
		final int POSITION = 2;
		// 何個書き換えるのか
		final int N = 3;
		
		// XのPOSITIONビット目からN個を1にした値を表示
		System.out.println(setN(X, POSITION, N));
		// XのPOSITIONビット目からN個を0にした値を表示
		System.out.println(resetN(X, POSITION, N));
		// XのPOSITIONビット目からN個を反転した値を表示
		System.out.println(inverseN(X, POSITION, N));
	}
	
	// 整数xのposビット目を最下位として連続するn個のビットを1にした値を返す
	static int setN(int x, int pos, int n) {
		// -1をn個左シフトし、その補数を取ることで連続するn個の1を作る
		// その連続する1をpos分左シフトすることでposからn個連続した1を作る
		// xとその値の論理和がposビット目からn個の1が連続した値になるのでそれを返す
		return x | ~(-1 << n) << pos;
	}
	
	// 整数xのposビット目を最下位として連続するn個のビットを0にした値を返す
	static int resetN(int x, int pos, int n) {
		// -1をn個左シフトし、その補数を取ることで連続するn個の1を作る
		// その連続する1をpos分左シフトすることでposからn個連続した1を作る
		// その補数を取ることで1埋めされたposからn個連続した0を作る
		// xとその値の論理積を取ることでposビット目からn個の0が連続した値になるのでそれを返す
		return x & ~(~(-1 << n) << pos);
	}
	
	// 整数xのposビット目を最下位として連続するn個のビットを反転した値を返す
	static int inverseN(int x, int pos, int n) {
		// -1をn個左シフトし、その補数を取ることで連続するn個の1を作る
		// その連続する1をpos分左シフトすることでposからn個連続した1を作る
		// xとその値の排他的論理和を取ることでposビット目から連続するn個の値が反転するのでそれを返す
		return x ^ ~(-1 << n) << pos;
	}
}
