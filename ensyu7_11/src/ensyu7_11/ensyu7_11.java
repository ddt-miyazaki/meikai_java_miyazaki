package ensyu7_11;

/*
	整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを確認するプログラムを作成せよ
*/
public class ensyu7_11 {

	public static void main(String[] args) {
		// シフトする数
		final int SHIFT= 5;
		// 計算する整数
		final int X = 421907;
		// 左シフトに対応する乗算後の結果
		int left_result = X;
		// 右シフトに対応する除算後の結果
		int right_result = X;
		
		// シフトする回数繰り返す
		for (int i = 0; i < SHIFT; i++) {
			// 2のべき乗の乗算となるよう結果に2を掛ける
			left_result *= 2; 
			// 2のべき乗の除算となるよう結果を2で割る
			right_result /= 2;
		}
		// 左シフトした値と乗算した値が一致すればtrueと表示される
		System.out.println(X << SHIFT == left_result ? "true" : "false");
		// 右シフトした値と除算した値が一致すればtrueと表示される
		System.out.println(X >> SHIFT == right_result ? "true" : "false");

	}

}
