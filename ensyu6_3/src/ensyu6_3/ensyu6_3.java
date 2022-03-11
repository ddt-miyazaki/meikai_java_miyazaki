package ensyu6_3;

/*
	要素型がdouble型で要素数が5の配列の要素に対して、
	先頭から順に1.1,2.2,3.3,4.4,5.5を代入して表示するプログラムを作成せよ
*/
public class ensyu6_3 {

	public static void main(String[] args) {
		// 配列の初期化
		double[] a = new double[5];
		// 変数の初期化
		double n = 0.0;
		
		// 配列の個数分繰り返す
		for (int i = 0; i < a.length; i++) {
			// 値の代入
			a[i] = n += 1.1;
			// 配列の中の値を表示
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
