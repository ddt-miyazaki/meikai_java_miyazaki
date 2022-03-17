package ensyu6_6;
// Scannerのインポート
import java.util.Scanner;

/*
	テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ
	人数と点数はキーボードから打ち込むこと
*/
public class ensyu6_6 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		// 文言表示
		System.out.print("人数：");
		// キーボードから入力した値を代入
		int ninzu = stdIn.nextInt();
		// 入力された値で点数配列を作成
		int[] tensu = new int[ninzu];

		// 入力された値の回数繰り返す
		for (int i = 0; i < ninzu; i++) {
			// 文言表示
			System.out.print((i + 1) + "人目の点数： ");
			// キーボードから入力した値を代入
			tensu[i] = stdIn.nextInt();
		}
		
		// 合計点
		int sum = 0;
		// 最高点
		int max = tensu[0];
		// 最低点
		int min = tensu[0];
		
		// 点数配列の長さの分だけ繰り返す
		for (int i = 0; i < tensu.length; i++) {
			// 合計点に加算する
			sum += tensu[i];
			// 現在の最高点よりも大きい数値であれば更新する
			if (tensu[i] > max) max = tensu[i];
			// 現在の最低点よりも小さい数値であれば更新する
			if (tensu[i] < min) min = tensu[i];
		}
		// 合計点・平均点・最高点・最低点の表示
		System.out.print("合計点は" + sum + "点で、平均点は" + (sum / ninzu) + "点" +
								"で、最高点は" + max + "点で、最低点は" + min + "点です。");
	}
}
