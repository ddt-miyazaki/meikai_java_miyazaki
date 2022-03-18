package ensyu9_2;

/*
	日付クラス第3版を利用するプログラムを作成せよ
	全てのコンストラクタの働きを確認できるようにすること
*/
public class ensyu9_2 {

	public static void main(String[] args) {
		// 1つ目のコンストラクタ利用
		Day d1 = new Day();
		// 2つ目のコンストラクタ利用
		Day d2 = new Day(2022);
		// 3つ目のコンストラクタ利用
		Day d3 = new Day(2032, 4);
		// 4つ目のコンストラクタ利用
		Day d4 = new Day(2041, 11, 23);
		// 5つ目のコンストラクタ利用
		Day d5 = new Day(d3);

		//　設定内容を出力して確認
		System.out.println("d1：" + d1);
		System.out.println("d2：" + d2);
		System.out.println("d3：" + d3);
		System.out.println("d4：" + d4);
		System.out.println("d5：" + d5);
	}

}
