package ensyu2_3;
// Scannerのインポート
import java.util.Scanner;

// キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ
public class ensyu2_3 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		
		// 文言表示
		System.out.print("整数値：");
		
		// キーボードから入力した値を代入
		int x = stdIn.nextInt();
		
		// 文言表示
		System.out.println(x + "と入力しましたね。");
	
	}

}
