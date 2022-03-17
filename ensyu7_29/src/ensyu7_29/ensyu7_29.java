package ensyu7_29;

/*
	2次元配列aと同じ配列（要素数が同じで、全ての要素の値が同じ配列）を生成して返却するメソッド
	aryClone2を作成せよ
*/
public class ensyu7_29 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[][] aryX = new int[][] {{1, 3, 5}, {7, 5, 6}};
		// メソッドの実行確認
		printMatrix(aryClone2(aryX));
		printMatrix(aryX);
	}

	// 配列aと同じ配列を生成して返す
	static int[][] aryClone2(int[][] a) {
		// aと同じ配列を格納
		int[][] ret_ary = new int[	a.length][]; 
		// aと同じ配列を生成
		for (int i = 0; i < a.length; i++) {
			// aの内側の配列の長さで配列を作る
			ret_ary[i] = new int[a[i].length];
			for (int j = 0; j < a[i].length; j++) {
				// aと同じインデックスに同じ値を代入
				ret_ary[i][j] = a[i][j];
			}
		}
		// 生成を終えたらそれを返す
		return ret_ary;
	}

	// 行列mの全要素を表示
	static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + "  ");
			System.out.println();
		}
	}
}
