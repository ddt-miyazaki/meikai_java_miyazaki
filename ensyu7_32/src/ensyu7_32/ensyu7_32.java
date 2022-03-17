package ensyu7_32;

/*
	list7-12のメソッドprintbitsは、int型整数値の内部のビットを表示するものであった
	他の整数型に対しても同様の働きを行う、多重定義されたメソッド群を作成せよ
	void printbits(byte x)
	void printbits(short x)
	void printbits(int x)
	void printbits(long x)
*/
public class ensyu7_32 {
	public static void main(String[] args) {
		// メソッドの実行確認
		printbits((byte)12);
		System.out.println();
		printbits((short)42);
		System.out.println();
		printbits(13213);
		System.out.println();
		printbits((long)464342214);
	}

	// byte型整数値の内部のビットを表示する
	static void printbits(byte x) {
		// byte型は8ビットなのでその分繰り返す
		for (int i = 7; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	// short型整数値の内部のビットを表示する
	static void printbits(short x) {
		// short型は16ビットなのでその分繰り返す
		for (int i = 15; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	// int型整数値の内部のビットを表示する
	static void printbits(int x) {
		// int型は32ビットなのでその分繰り返す
		for (int i = 31; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
	
	// long型整数値の内部のビットを表示する
	static void printbits(long x) {
		// long型は64ビットなのでその分繰り返す
		for (int i = 63; i >= 0; i--)
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
	}
}
