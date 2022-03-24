package ensyu15_1;
// Scannerのインポート
import java.util.Scanner;
/*
	文字列を読み込んで、その文字列を逆順に表示するプログラムを作成せよ
*/
public class ensyu15_1 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// キーボードから文字列読み込み
		String s = stdIn.nextLine();
		
		// 読み込んだ文字列を逆順に取り出し
		for (int i = s.length() - 1; i >= 0; i--) {
			// 文字列を表示
			System.out.println(s.charAt(i));
		}
	}

}
