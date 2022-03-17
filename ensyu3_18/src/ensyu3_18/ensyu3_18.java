package ensyu3_18;
// Scannerのインポート
import java.util.Scanner;

/*
	月を1~12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ
*/
public class ensyu3_18 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("何月？");
		// キーボードから入力した値を代入
		int month = stdIn.nextInt();
		
		// 季節の判定
		switch (month) {
			// 1,2,12ならば冬と表示
			case 12 :
			case 1 :
			case 2 : System.out.println("それは冬です。"); break;
			// 3,4,5ならば春と表示
			case 3 :
			case 4 :
			case 5 : System.out.println("それは春です。"); break;
			// 6,7,8ならば夏と表示
			case 6 :
			case 7 :
			case 8 : System.out.println("それは夏です。"); break;
			// 9,10,11ならば秋と表示
			case 9 :
			case 10 :
			case 11 : System.out.println("それは秋です。"); break;
			// 1~12以外が入力されたときのエラーメッセージ
			default : System.out.println("1~12の間で入力してください。"); break;
		}

	}

}
