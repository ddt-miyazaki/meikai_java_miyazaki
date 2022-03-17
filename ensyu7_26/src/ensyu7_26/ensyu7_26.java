package ensyu7_26;

/*
	配列aの要素a[idx]にxを挿入した配列を返却するメソッドarrayInsOfを作成せよ
	挿入に伴ってa[idx]以降の全要素を一つ後方にずらすこと
*/
public class ensyu7_26 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] aryA = new int[] {1, 3, 4, 7, 9, 11};
		// メソッドの実行確認
		int[] aryB = arrayInsOf(aryA, 2, 99);
		for (int i : aryB)
			System.out.print(i + ", ");
	}

	// 配列aの要素a[idx]にxを挿入した配列を返す
	static int[] arrayInsOf(int[] a, int idx, int x) {
		// 配列aの要素a[idx]にxを挿入した配列
		int[] ret_ary = new int[a.length + 1];

		// 要素の回数繰り返す、最後の要素はループに含まない
		for (int i = 0; i < ret_ary.length; i++) {
			// 指定のインデックスよりも前の場合は
			if (i < idx) 
				// 同じインデックスの値を代入する
				ret_ary[i] = a[i];
			// 指定のインデックスの時
			else if (i == idx)
				// xを挿入
				ret_ary[i] = x;
			// 指定のインデックス以降は
			else
				// aの残りの要素を代入していく
				ret_ary[i] = a[i - 1];
		}
		// 生成した配列を返す
		return ret_ary;
	}
}
