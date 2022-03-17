package ensyu6_1;

/*
	要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ
*/
public class ensyu6_1 {

	public static void main(String[] args) {
		// 配列の初期化
		double[] a = new double[5];
		
		// 適当な数字を代入
		a[1] = 3.6d;
		a[2] = 0.4d;
		a[4] = 2.1d;
		
		// 配列の個数分繰り返す
		for (int i = 0; i < a.length; i++)
			// 配列の中の値を表示
			System.out.println("arr[" + i + "] = " + a[i]);
	}

}
