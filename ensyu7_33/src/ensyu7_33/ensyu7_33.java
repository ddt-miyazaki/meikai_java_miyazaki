package ensyu7_33;

/*
	int型の1次元配列とint型の2次元配列（業によって列数が異なる可能性がある）の
	全要素の値を表示する、多重定義されたメソッド群を作成せよ
	なお、1次元配列の表示では、各要素の間には1文字分のスペースを空けること
	また、2次元配列の表示では、各列の数値の戦闘がそろうように、最低限のスペースを空けること
*/
public class ensyu7_33 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] aryX = new int[] {12, 536, -8, 7};
		int[][] aryY = new int[][] {{32, -1, 32, 45, 67}, {535, 99999, 2}, {2, 5, -123, 9}};
		// メソッドの実行確認
		printArray(aryX);
		System.out.println();
		printArray(aryY);
	}

	// 配列aの全要素を表示
	static void printArray(int[] a) {
		// aの要素を表示
		for (int i : a) {
			// 各要素の間に1文字分のスペースを空ける
			System.out.print(i + " ");
		}
	}
	
	// 行列aの全要素を表示
	static void printArray(int[][] a) {
		// 行列aの要素を表示
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				// 各列の数値先頭揃えし、その後スペースを空ける
				System.out.printf("%-5d\t", a[i][j]);
			// 1行終わったら改行
			System.out.println();
		}
	}
}
