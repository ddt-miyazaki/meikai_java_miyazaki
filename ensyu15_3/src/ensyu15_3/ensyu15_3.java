package ensyu15_3;
// Scannerのインポート
import java.util.Scanner;

/*
	文字列探索のプログラムを書き換えて、右のように表示するプログラムを作成せよ
	一致する部分が上下で揃うように表示すること
*/
public class ensyu15_3 {

	public static void main(String[] args) {
		// 変数の初期化
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("文字列s1：");
		// キーボードから文字列読み込み
		String s1 = stdIn.nextLine();

		System.out.print("文字列s2：");
		// キーボードから文字列読み込み
		String s2 = stdIn.nextLine();
		
		// s1にs2が含まれるか
		int idx = s1.indexOf(s2);
		
		// 含まれないとき
		if (idx == -1)
			// メッセージの表示
			System.out.println("s1中にs2は含まれません。");
		// 含まれるとき
		else {
			// s1の表示
			System.out.println("s1：" + s1);
			// s2の接頭語の表示
			System.out.print("s2：");
			// 一致する文字列までをスペースで埋める
			for (int i = 0; i < idx; i++)
				System.out.print("  ");
			// s2の表示
			System.out.println(s2);
		}

	}

}
