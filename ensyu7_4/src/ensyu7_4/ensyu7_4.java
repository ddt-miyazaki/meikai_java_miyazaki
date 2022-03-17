package ensyu7_4;

/*
	1からnまでの全整数の和を求めて返却するメソッドを作成せよ
*/
public class ensyu7_4 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(sumUp(0));
		System.out.println(sumUp(1));
		System.out.println(sumUp(10));
	}
	
	// 1からnまでの全整数の和を求めて返却するメソッド
	static int sumUp(int n) {
		// 和変数の初期化
		int sum = 0;
		
		// nが0になるまで加算する
		do {
			sum += n;
		} while (n-- > 0);
		
		// 和を返す
		return sum;
	}

}
