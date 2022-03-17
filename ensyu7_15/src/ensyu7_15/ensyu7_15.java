package ensyu7_15;

/*
	配列aの全要素の合計を求めるメソッドsumOfを作成せよ
*/
public class ensyu7_15 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(sumOf(new int[] {0}));
		System.out.println(sumOf(new int[] {1}));
		System.out.println(sumOf(new int[] {1, 2, 3}));
		System.out.println(sumOf(new int[] {-1, 2, -3}));
	}
	
	// 配列aの全要素の合計
	static int sumOf(int[] a) {
		// 合計変数
		int sum = 0;
		// 配列の要素の回数繰り返し
		for (int i : a) {
			// 合計変数に数値を加算する
			sum += i;
		}
		// 合計を返す
		return sum;
	}
}
