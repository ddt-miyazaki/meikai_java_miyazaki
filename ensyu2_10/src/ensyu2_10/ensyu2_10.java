package ensyu2_10;
// Scannerのインポート
import java.util.Scanner;

// 名前の姓と名とを個別にキーボード読み込んで、挨拶を行うプログラムを作成せよ
public class ensyu2_10 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
        
		// 文言表示
		System.out.print("姓：");
		// キーボートから読み込んだ姓の代入
		String sei = stdIn.nextLine();
        
		// 文言表示
		System.out.print("名：");
		// キーボートから読み込んだ名の代入
		String mei = stdIn.nextLine();

		// 読み込んだ姓と名を連結してあいさつを表示
		System.out.print("こんにちは" + sei + mei + "さん。");
		
	}
}
