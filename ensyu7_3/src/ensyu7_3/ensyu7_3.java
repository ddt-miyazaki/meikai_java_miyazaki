package ensyu7_3;

/*
	三つのint型引数a,b,cの中央値を求めるメソッドmedを作成せよ
*/
public class ensyu7_3 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(med(1, 2, 3));
		System.out.println(med(3, 2, 1));
		System.out.println(med(2, 1, 3));
	}
	
	// 三つのint型引数a,b,cの中央値を求めるメソッド
	static int med(int a, int b, int c) {
		// 中央値変数の初期化
		int med;

		// aがb以上の時
		if (a >= b)
			// aがb,c以上の時
			if (a >= c)
				// a,b,cの順の時
				if (b >= c)
					// bを中央値に設定
					med = b;
				// a,c,bの順の時
				else
					// cを中央値に設定
					med = c;
			// c,a,bの順の時
			else
				// aを中央値に設定
				med = a;
		// bがaより大きいとき
		else
			// bがa,c以上の時
			if (b >= c)
				// b,a,cの順の時
				if (a >= c)
					// aを中央値に設定
					med = a;
				// b,c,aの順の時
				else
					// cを中央値に設定
					med = c;
			// c,b,aの順の時
			else
				// bを中央値に設定
				med = b;

		// 中央値を返す
		return med;
	}

}
