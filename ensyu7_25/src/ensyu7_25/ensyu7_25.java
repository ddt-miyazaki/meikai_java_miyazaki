package ensyu7_25;

/*
	配列aから要素a[idx]を先頭とするn個の要素を削除した配列を返却するメソッド
	arrayRmvOfNを作成せよ
	削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと
*/
public class ensyu7_25 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] aryA = new int[] {1, 3, 4, 7, 9, 11, 13};
		// メソッドの実行確認
		int[] aryB = arrayRmvOfN(aryA, 1, 3);
		for (int i : aryB)
			System.out.print(i + ", ");
	}

	// 配列aから要素a[idx]を削除する
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		// 配列aから要素a[idx]からn個を削除したものを格納する配列
		int[] ret_ary = new int[a.length - n];

		// 要素の回数繰り返す、最後の要素はループに含まない
		for (int i = 0; i < ret_ary.length; i++) {
			// 指定のインデックスよりも前の場合は
			if (i < idx) 
				// 同じインデックスの値を代入する
				ret_ary[i] = a[i];
			// 指定のインデックス以降は
			else
				// n個先の値を持ってくる
				ret_ary[i] = a[i + n];
		}
		// 生成した配列を返す
		return ret_ary;
	}
}
