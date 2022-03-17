package ensyu7_31;

/*
	int型整数xの絶対値、long型整数xの絶対値、float型整数xの絶対値、double型整数xの絶対値を求める、
	以下に示す多重定義されたメソッド群を作成せよ
	int　absolute(int x)
	long　absolute(long x)
	float　absolute(float x)
	double　absolute(double x)
*/
public class ensyu7_31 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(absolute(45718));
		System.out.println(absolute((long)-12421421));
		System.out.println(absolute((float)-2123.421));
		System.out.println(absolute((double)75.335));
	}
	
	// int型整数xの絶対値を返す
	static int absolute(int x) {
		// 0未満ならば符号を反転して返す
		return x >= 0 ? x: -x;
	}
	// long型整数xの絶対値を返す
	static long absolute(long x) {
		// 0未満ならば符号を反転して返す
		return x >= 0 ? x: -x;
	}
	// float型整数xの絶対値を返す
	static float absolute(float x) {
		// 0未満ならば符号を反転して返す
		return x >= 0 ? x: -x;
	}
	// double型整数xの絶対値を返す
	static double absolute(double x) {
		// 0未満ならば符号を反転して返す
		return x >= 0 ? x: -x;
	}
}
