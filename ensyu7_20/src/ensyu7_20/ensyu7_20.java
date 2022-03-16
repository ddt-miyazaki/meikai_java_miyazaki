package ensyu7_20;

/*
	配列aの要素a[idx]にxを挿入するメソッドaryInsを作成せよ
	挿入に伴ってa[idx]～a[a.length - 2]を一つ後方にずらさなければならない
*/
public class ensyu7_20 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] ary = new int[] {1, 3, 4, 7, 9, 11};
		// メソッドの実行確認
		aryIns(ary, 2, 99);
		for (int i : ary)
			System.out.print(i + ", ");
	}
	
	// 配列aの要素a[idx]にxを挿入する
	static void aryIns(int[] a, int idx, int x) {
		// 要素の回数繰り返す、最後の要素はループに含まない
		for (int i = a.length - 1; i > idx; i--) {
			// 引数のインデックス以降処理を行う
			if (i >= idx)
				// 現在の要素に一つ前の要素を代入する
				a[i] = a[i - 1];
		}
		// 指定のインデックスに指定の値を代入する
		a[idx] = x;
	}
}
