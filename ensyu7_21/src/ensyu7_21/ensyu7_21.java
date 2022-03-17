package ensyu7_21;

/*
	配列aと配列bの全要素の値を交換するメソッドaryExchngを作成せよ
	二つの配列の要素数が等しくない場合は、小さい方の要素数分の要素を交換すること
*/
public class ensyu7_21 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] aryA = new int[] {1, 2, 3, 4, 5, 6, 7};
		int[] aryB = new int[] {5, 4, 3, 2, 1};
		// メソッドの実行確認
		aryExchng(aryA, aryB);
		for (int i : aryA)
			System.out.print(i + ", ");
		System.out.println();
		for (int i : aryB)
			System.out.print(i + ", ");
	}
	
	// 配列aと配列bの全要素の値を交換する
	static void aryExchng(int[] a, int[] b) {
		// 配列の長さ格納変数
		int length = 0;
		
		// aの配列の方が小さい、または配列の長さが同じならば
		if (a.length < b.length || a.length == b.length)
			// aの配列の長さを適用する
			length = a.length;
		// bの配列の方が小さいならば
		else if (a.length > b.length)
			// bの配列の長さを適用する
			length = b.length;
		
		// 配列の大きさが小さい方にあわせて繰り返し処理する
		for (int i = 0; i < length; i++) {
			// 一時退避させる
			int tmp = a[i];
			// aにbの値を代入
			a[i] = b[i];
			// bにaの値を代入
			b[i] = tmp;
		}
	}
}
