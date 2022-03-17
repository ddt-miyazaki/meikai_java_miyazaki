package ensyu7_28;

/*
	行列xとyの和を格納した2次元配列を返すメソッドを作成せよ
	※行数及び列数が同一の配列をxとyに受け取ることを前提としてよい
*/
public class ensyu7_28 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[][] aryX = new int[][] {{1, 2, 3}, {4, 5, 6}};
		int[][] aryY = new int[][] {{6, 3, 4}, {5, 1, 0}};
		// メソッドの実行確認
		printMatrix(addMatrix(aryX, aryY));
	}

	// 行列xとyの和を格納した2次元配列を返す
	static int[][] addMatrix(int[][] x, int[][] y) {
		// xとyの和を格納する配列
		int[][] ret_ary = new int[x.length][x[0].length]; 
		// 行列xとyの和をzに代入
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				ret_ary[i][j] = x[i][j] + y[i][j];
		// 加算を終えたらそれを返す
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
