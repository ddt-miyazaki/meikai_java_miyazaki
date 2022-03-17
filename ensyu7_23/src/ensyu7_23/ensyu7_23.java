package ensyu7_23;

/*
	配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を
	返却するメソッドarraySrchIdxを作成せよ
*/
public class ensyu7_23 {
	public static void main(String[] args) {
		// メソッド動作確認用配列
		int[] aryA = new int[] {1, 5, 4, 8, 5, 5, 7};
		// メソッドの実行確認
		int[] aryB = arraySrchIdx(aryA, 5);
		for (int i : aryB)
			System.out.print(i + ", ");
	}
	
	// 配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返す
	static int[] arraySrchIdx(int[] a, int x) {
		// xの個数カウント変数
		int count = 0;
		
		// 配列aの中にxがいくつあるかカウントする
		for (int i = 0; i < a.length; i++) {
			// aの要素とxが一致したら
			if (a[i] == x)
				// カウントを増やす
				count++;
		}
		
		// 配列aの中でxと一致する値のインデックスを格納する配列
		int[] ret_ary = new int[count];
		// 格納変数のインデックス管理用
		int ret_ary_idx = 0;
		
		// 配列aの中でxと一致する値のインデックスを格納していく
		for (int i = 0; i < a.length; i++) {
			// aの要素とxが一致したら
			if (a[i] == x) {
				// 格納配列にインデックスを代入
				ret_ary[ret_ary_idx] = i;
				// インデックス管理変数に加算
				ret_ary_idx++;
			}
		}

		// 生成した配列を返す
		return ret_ary;
	}
}
