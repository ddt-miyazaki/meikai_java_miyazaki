package ensyu15_2;
// Scannerのインポート
import java.util.Scanner;
/*
	文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ
*/
public class ensyu15_2 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// キーボードから文字列読み込み
		String s = stdIn.nextLine();
		
		// 読み込んだ文字列を順に取り出し
		for (int i = 0; i < s.length(); i++) {
			// 文字コードを表示
			System.out.println(s.codePointAt(i));
		}

	}

}
