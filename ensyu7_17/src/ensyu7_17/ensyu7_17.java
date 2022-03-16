package ensyu7_17;

/*
	メソッドlinearSearchは、探索するキーと同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるものである
	もっとも末尾側に位置する要素を見つけるメソッドlinearSearchRを作成せよ
*/
public class ensyu7_17 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(linearSearchR(new int[] {1, 2, 3, 2, 4, 5}, 2));
	}
	
	// もっとも末尾側に位置する要素を見つける
	static int linearSearchR(int[] a, int key) {
		// 末尾から順に探索
		for (int i = a.length - 1; i >= 0; i--) {
			// keyが存在した場合
			if (a[i] == key)
				// そのインデックスを返す
				return i;
		}
		// keyが存在しない場合-1を返す
		return -1;
	}
}
