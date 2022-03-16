package ensyu7_19;

/*
	配列aから要素a[idx]を先頭とするn個の要素を削除するメソッドaryRmvNを作成せよ
	削除はa[idx]より後ろの全要素をn個前方にずらすことによって行うこと
	なお、移動されずに余ってしまう要素の値は変更しなくて良い
*/
public class ensyu7_19 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] ary = new int[] {1, 3, 4, 7, 9, 11};
		// メソッドの実行確認
		aryRmvN(ary, 1, 3);
		for (int i : ary)
			System.out.print(i + ", ");
	}
	
	// 配列aから要素a[idx]を先頭とするn個の要素を削除する
	static void aryRmvN(int[] a, int idx, int n) {
		// 要素の回数繰り返す、配列長-nはループに含まない
		for (int i = 0; i < a.length - n; i++) {
			// 引数のインデックス以降は削除処理を行う
			if (i >= idx)
				// n個先の要素の値を持ってくる
				a[i] = a[i + n];
		}
	}
}
