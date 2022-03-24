package ensyu15_4;

/*
	浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッド
	printDoubleを作成せよ
*/
public class ensyu15_4 {

	public static void main(String[] args) {
		// printDoubleの実行確認
		printDouble(16.174,1, 12);
	}
	
	// 浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッド
	public static void printDouble(double x, int p, int w) {
		// %w.pfのフォーマットを生成し、そのフォーマットでxを表示
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}

}
