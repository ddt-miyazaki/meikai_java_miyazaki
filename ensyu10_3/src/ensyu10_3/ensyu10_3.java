package ensyu10_3;

/*
	二値/三値/配列の最小値を求めるメソッドや、最大値を求めるメソッドを集めたユーティリティクラス
	MinMaxを作成せよ
	上記クラスのテスト
*/
public class ensyu10_3 {
	public static void main(String[] args) {
		// 二値の最小値
		System.out.println(MinMax.min(5,2));
		// 三値の最小値
		System.out.println(MinMax.min(98,24,32));
		// 配列の最小値
		System.out.println(MinMax.min(new int[]{ 41, 421, 634 }));
		// 二値の最大値
		System.out.println(MinMax.max(5,7));
		// 三値の最大値
		System.out.println(MinMax.max(532,224,413));
		// 配列の最大値
		System.out.println(MinMax.max(new int[]{ 53, 5352, 987 }));

	}

}
