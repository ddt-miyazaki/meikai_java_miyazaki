package ensyu7_16;

/*
	配列aの要素の最小値を求めるメソッドminOfを作成せよ
*/
public class ensyu7_16 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(minOf(new int[] {0}));
		System.out.println(minOf(new int[] {1}));
		System.out.println(minOf(new int[] {1, 2, 3}));
		System.out.println(minOf(new int[] {-1, 2, -3}));
	}
	
	// 配列aの要素の最小値
	static int minOf(int[] a) {
		// 最小値変数
		int min = a[0];
		// 配列の要素の回数繰り返し
		for (int i : a) {
			// 現在設定中の最小値よりも現在の値が小さい場合
			if (min > i)
			// 現在の値を最小値に設定する
			min = i;
		}
		// 最小値を返す
		return min;
	}
}
