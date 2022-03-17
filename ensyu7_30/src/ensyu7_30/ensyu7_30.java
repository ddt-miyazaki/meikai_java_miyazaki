package ensyu7_30;

/*
	二つのint型整数a,bの最小値、三つのint型整数a,b,cの最小値、配列aの要素の最小値を求める、
	以下に示す多重定義されたメソッド群を作成せよ
	int min(int a, int b)
	int min(int a, int b, int c)
	int min(int[] a)
*/
public class ensyu7_30 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(min(7, 2));
		System.out.println(min(4, -8, 1));
		System.out.println(min(new int[] {-7, 5, 6}));
	}

	// 二つのint型整数a,bの最小値
	static int min(int a, int b) {
		// aとbを比較して小さい方を返す
		return a < b ? a : b;
	}
	// 三つのint型整数a,b,cの最小値
	static int min(int a, int b, int c) {
		// 整数aを暫定的な最小値として設定
		int min = a;
		// 整数bの方が小さければ最小値として設定
		if (b < min) min = b;
		// 整数cの方が小さければ最小値として設定
		if (c < min) min = c;
		// 設定した最小値を返す
		return min;
	}
	// 配列aの要素の最小値
	static int min(int[] a) {
		// 配列の最初の値を暫定的な最小値として設定
		int min = a[0];
		// 配列内の最小値を探す
		for (int i : a) {
			// 現在の値が、設定されている最小値よりも小さければ、現在の値を最小値として設定
			if (i < min) min = i;
		}
		// 設定した最小値を返す
		return min;
	}
}
