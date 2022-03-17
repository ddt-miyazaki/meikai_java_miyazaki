package ensyu7_12;

/*
	整数xを右にnビット回転した値を返すメソッドrRotateと、
	左にnビット回転した値を返すメソッドlRotateを作成せよ
*/
public class ensyu7_12 {
	public static void main(String[] args) {
		// 回転したい整数
		final int X = 587642;
		// 回転するビット数
		final int SHIFT = 3;
		
		// 右にSHIFTビット回転したXの値を表示
		System.out.println(rRotate(X, SHIFT));
		// 左にSHIFTビット回転したXの値を表示
		System.out.println(lRotate(X, SHIFT));
	}
	
	// 整数xを右にnビット回転した値を返す
	static int rRotate(int x, int n) {
		// 右にnビットシフトした値と左に32-nビットシフトした値の論理和が右にnビット回転した値であるのでそれを返す
		return x >>> n | x << 32 - n;
	}
	
	// 整数xを左にnビット回転した値を返す
	static int lRotate(int x, int n) {
		// 左にnビットシフトした値と右に32-nビットシフトした値の論理和が左にnビット回転した値であるのでそれを返す
		return x << n | x >>> 32 - n;
	}
}
