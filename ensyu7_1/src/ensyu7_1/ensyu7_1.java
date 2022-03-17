package ensyu7_1;

/*
	受け取ったint型引数の値nが負であれば-1を返却し、0であれば0を返却し、
	正であれば1を返却するメソッドsignOfを作成せよ
*/
public class ensyu7_1 {

	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(signOf(31242));
		System.out.println(signOf(-2141));
		System.out.println(signOf(0));

	}
	/*
		受け取ったint型引数の値nが負であれば-1を返却し、0であれば0を返却し、
	 	正であれば1を返却するメソッド
	 */
	static int signOf(int n) {
		// 引数が負の値ならば-1を返す
		if (n < 0) 
			return -1;
		// 引数が0ならば0を返す
		else if (n == 0)
			return 0;
		// 引数が正の値ならば1を返す
		else
			return 1;
	}

}
