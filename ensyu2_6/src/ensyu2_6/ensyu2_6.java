package ensyu2_6;
// Scannerのインポート
import java.util.Scanner;

// 三角形の底辺と高さを読み込んで、その面積を表示するプロうグラムを作成せよ
public class ensyu2_6 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);

		// 文言表示
		System.out.println("三角形の面積を求めます。");
		
		// 文言表示
		System.out.print("底辺：");
		
		// キーボードから入力した値を代入
		double b = stdIn.nextDouble();
		
		// 文言表示
		System.out.print("高さ：");
		
		// キーボードから入力した値を代入
		double h = stdIn.nextDouble();
		
		// 面積の表示
		System.out.println("面積は" + (b * h / 2) + "です。");
	}

}
