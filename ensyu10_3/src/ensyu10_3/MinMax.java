package ensyu10_3;

/*
	二値/三値/配列の最小値を求めるメソッドや、最大値を求めるメソッドを集めたユーティリティクラス
	MinMaxを作成せよ
*/
public class MinMax {
	// 二値の最小値を求める
	static int min(int a, int b) {
		// 配列にして処理を投げる
		return min(new int[]{ a, b });
	}

	// 三値の最小値を求める
	static int min(int a, int b, int c) {
		// 配列にして処理を投げる
		return min(new int[]{ a, b, c });
	}
	
	// 配列の最小値を求める
	static int min(int[] a) {
		// １つ目の要素を最小値に設定
		int min = a[0];
		// 要素全確認
		for (int i : a) {
			// 現在の値のほうが設定されている最小値よりも小さければ
			if (i < min)
				// 現在の値を最小値に設定
				min = i;
		}
		// 最小値を返す
		return min;
	}
	
	// 二値の最大値を求める
	static int max(int a, int b) {
		// 配列にして処理を投げる
		return max(new int[]{ a, b });
	}

	// 三値の最大値を求める
	static int max(int a, int b, int c) {
		// 配列にして処理を投げる
		return max(new int[]{ a, b, c });
	}
	
	// 配列の最大値を求める
	static int max(int[] a) {
		// １つ目の要素を最大値に設定
		int max = a[0];
		// 要素全確認
		for (int i : a) {
			// 現在の値のほうが設定されている最大値よりも大きければ
			if (i > max)
				// 現在の値を最大値に設定
				max = i;
		}
		// 最大値を返す
		return max;
	}
}

