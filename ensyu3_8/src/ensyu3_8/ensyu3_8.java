package ensyu3_8;
// Scannerのインポート
import java.util.Scanner;

/*
	キーボードから読み込んだ点数に応じて、優/良/可/不可を判定して表示するプログラムを作成せよ
	判定は以下のように行うこと
	0~59⇒不可/60~69⇒可/70~79⇒良/80~100⇒優
*/
public class ensyu3_8 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.print("点数：");
		// キーボードから入力した値を代入
		int n = stdIn.nextInt();

		//0~59ならば
		if (n >= 0 && n <=59)
			// 文言表示
			System.out.println("不可");
		
		// 60~69ならば
		else if (n >= 60 && n <= 69)
			// 文言表示
			System.out.println("可");

		// 70~79ならば
		else if (n >= 70 && n <= 79)
			// 文言表示
			System.out.println("良");
			
		// 80~100ならば
		else if (n >= 80 && n <= 100)
			// 文言表示
			System.out.println("優");
		
		// 0~100以外ならば
		else
			// 文言表示
			System.out.println("0~100の範囲で入力してください。");

	}

}
