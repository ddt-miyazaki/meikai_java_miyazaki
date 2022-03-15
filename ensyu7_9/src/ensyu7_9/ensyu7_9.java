package ensyu7_9;
// Scannerのインポート
import java.util.Scanner;

/*
	「正の整数値：」と表示してキーボードから正の整数値を読み込んで、
	その値を返却するメソッドreadPlusIntを作成せよ
	0や負の値が入力されたら再入力させること
*/
public class ensyu7_9 {
	public static void main(String[] args) {
		// メソッドの実行確認
		System.out.println(readPlusInt());
	}
	
	// 「正の整数値：」と表示してキーボードから正の整数値を読み込んで、その値を返却するメソッド
	static int readPlusInt() {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 戻り値変数
		int ret;
		// 繰り返し処理
		do {
			// 文言表示
			System.out.print("正の整数値：");
			// キーボードから値を読み込む
			ret = stdIn.nextInt();
			// 入力値が0以下ならやりなおし
		} while (ret <= 0);
		// 入力された正の整数値を返す
		return ret;
	}
}
