package ensyu7_22;
/*
	配列aと同じ配列（要素数が同じで、全ての要素の値が同じ配列）を生成して返却するメソッドarrayCloneを作成せよ
*/
public class ensyu7_22 {
public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] aryA = new int[] {4, 2, 1, 3, 4, 2,};
		
		// メソッドの実行確認
		int[] aryB = arrayClone(aryA);
		for (int i : aryB)
			System.out.print(i + ", ");
	}
	
	// 配列aと同じ配列を生成して返す
	static int[] arrayClone(int[] a) {
		// 返すための配列
		int[] ret_ary = new int[a.length];
		
		// 配列の長さ分繰り返す
		for (int i = 0; i < a.length; i++)
			// 生成した配列にaの要素を代入していく
			ret_ary[i] = a[i];
		
		// 生成した配列を返す
		return ret_ary;
	}

}
