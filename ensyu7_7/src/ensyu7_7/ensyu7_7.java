package ensyu7_7;

/*
	list7-7に示したn個の'*'を連続表示するメソッドputStarsを、
	内部でlist7-8のメソッドputCharsを呼び出すことによって表示を行うように書き換えよ
*/
public class ensyu7_7 {
	public static void main(String[] args) {
		// メソッドの実行確認
		putStars(3);
	}
	
	// 文字*をn個連即表示
	static void putStars(int n) {
		// *を表示するようメソッド呼び出し
		putChars('*', n);
	}
	
	// 文字cをn個連続表示
	static void putChars(char c, int n) {
		while(n-- > 0)
			System.out.print(c);
	}
}
