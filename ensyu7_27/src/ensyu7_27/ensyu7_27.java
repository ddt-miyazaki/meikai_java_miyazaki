package ensyu7_27;

/*
	list7-20のプログラムは、三つの配列x,y,zの行数及び列数が同一であることを前提としている
	三つの配列の要素数が等しければ加算を行ってtrueを返し、
	等しくなければ加算を行わずにfalseを返すメソッドに書き換えよ
*/
public class ensyu7_27 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[][] aryX = new int[][] {{1, 2, 3}, {4, 5, 6}};
		int[][] aryY = new int[][] {{6, 3, 4}, {5, 1, 2}};
		int[][] aryZ = new int[2][3];
		// メソッドの実行確認
		System.out.println(addMatrix(aryX, aryY, aryZ));
		printMatrix(aryX);
		printMatrix(aryY);
		printMatrix(aryZ);
	}
	
	// 配列aと配列bの全要素の値を交換する
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// x,y,zの外側の配列の長さが違うものがあったならば
		if (x.length != y.length || x.length != z.length || y.length != z.length)
			//	falseを返す
			return false;
		// x,y,zの外側の配列の長さが一致した場合
		else {
			// xの内側の配列の要素数を保持する配列
			int[] inner_x = new int[x.length];
			// yの内側の配列の要素数を保持する配列
			int[] inner_y = new int[y.length];
			// zの内側の配列の要素数を保持する配列
			int[] inner_z = new int[z.length];
			// xの内側の要素数を取り出す
 			innerLength(x, inner_x);
			// yの内側の要素数を取り出す
 			innerLength(y, inner_y);
			// zの内側の要素数を取り出す
 			innerLength(z, inner_z);
 			// 取り出した配列の長さの比較
			for (int i = 0; i < inner_x.length; i++) {
				// x,y,zの内側の配列のうち一つでも長さが違うものがある場合
				if (inner_x[i] != inner_y[i] || inner_x[i] != inner_z[i] || inner_y[i] != inner_z[i])
					// falseを返す
					return false;
			}
		}
		// 行列xとyの和をzに代入
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		// 滞りなく加算を行えたらtrue
		return true;
	}
	
	// 配列aの中の配列の長さを取り出し、受け取った配列bにしまう
	static void innerLength(int[][] a, int[] b) {
		// 配列aの要素分繰り返す
		for (int i = 0; i < a.length; i++)
			// 中の配列の長さをしまっていく
			b[i] = a[i].length;
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
