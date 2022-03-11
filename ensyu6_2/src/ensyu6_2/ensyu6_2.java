package ensyu6_2;

/*
	要素型がint型で要素数が5の配列の要素に対して、先頭から順に5,4,3,2,1を代入して表示するプログラムを作成せよ
*/
public class ensyu6_2 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] a = new int[5];
		
		// 配列の個数分繰り返す
		for (int i = 0; i < a.length; i++) {
			// 値の代入
			a[i] = 5 - i;
			// 配列の中の値を表示
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
