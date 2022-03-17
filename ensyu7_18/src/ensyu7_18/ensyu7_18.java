package ensyu7_18;

/*
	配列aから要素a[idx]を削除するメソッドaryRmvを作成せよ
	削除はa[idx]より後ろの全要素を一つ前方にずらすことによって行うこと
	なお、移動されずに余ってしまう末尾要素a[a.length - 1 ]の値は変更しなくて良い
*/
public class ensyu7_18 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] ary = new int[] {1, 2, 3, 2, 4, 5};
		// メソッドの実行確認
		aryRmv(ary, 0);
		for (int i : ary)
			System.out.print(i + ", ");
	}
	
	// 配列aから要素a[idx]を削除する
	static void aryRmv(int[] a, int idx) {
		// 要素の回数繰り返す、最後の要素はループに含まない
		for (int i = 0; i < a.length - 1; i++) {
			// 引数のインデックス以降は削除処理を行う
			if (i >= idx)
				// 次の要素の値を持ってくる
				a[i] = a[i + 1];
		}
	}
}
