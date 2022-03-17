package ensyu2_8;
// Randomのインポート
import java.util.Random;
// Scannerのインポート
import java.util.Scanner;

// キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ
public class ensyu2_8 {
	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		// 文言表示
		System.out.print("整数値：");
		
		// キーボードから入力した値を代入
		int x = stdIn.nextInt();

		// プラスマイナス5の範囲の整数値の代入
		int num = rand.nextInt(11) - 5;

		// 入力値±5の値の表示
		System.out.println("その値の±5の乱数を生成しました。それは" + (x + num) + "です。");

	}

}
