package ensyu10_4;

// 日付クラスのテスト
public class ensyu10_4 {
	public static void main(String[] args) {
		//引数を受け取らない場合、プログラム実行時の日付で初期化されるか確認
		Day d1 = new Day();
		System.out.println("d1：" + d1);
		
		// 年を受け取るコンストラクタに不正な年が指定された場合に適当な値に調整されるか確認
		Day d11 = new Day(-321);
		System.out.println("d11：" + d11);
		
		// 年月を受け取るコンストラクタに不正な月が指定された場合に適当な値に調整されるか確認
		Day d12 = new Day(222, 19);
		System.out.println("d12：" + d12);
		
		// 年月日を受け取るコンストラクタに不正な日が指定された場合に適当な値に調整されるか確認
		Day d13 = new Day(2022, 2, 29);
		System.out.println("d13：" + d13);
		
		// 年内での経過日数を求めるメソッドの確認
		System.out.println(d1.thisYearElapsed() + "日");
		
		// 年内の残り日数を求めるメソッドの確認
		System.out.println(d1.thisYearDaysLeft() + "日");
		
		// 以前の日付
		Day d2 = new Day(2022, 3, 1);
		// 同じ日付
		Day d3 = new Day(2022, 3, 22);
		// 以後の日付
		Day d4 = new Day(2022, 4, 1);
		
		// 他の日付との前後関係を判定するインスタンスメソッドの確認
		// 以前との比較
		resCompare(d1.compareDate(d2));
		// 同じ日付との比較
		resCompare(d1.compareDate(d3));
		// 以後との比較
		resCompare(d1.compareDate(d4));
		
		
		// 二つの日付の前後関係を判定するクラスメソッドの確認
		// 以前との比較
		resCompare(Day.compareDate(d1, d2));
		// 同じ日付との比較
		resCompare(Day.compareDate(d1, d3));
		// 以後との比較
		resCompare(Day.compareDate(d1, d4));
		
		// 日付を一つ後ろにすすめるメソッドの確認
		d1.addDay();
		System.out.println("1日足すと");
		System.out.println("d1：" + d1);
		
		// 次の日の日付を返却するメソッドの確認
		System.out.println("d1の次の日：" + d1.nextDay());
		
		// 日付を一つ前に戻すメソッドの確認
		d1.minusDay();
		System.out.println("1日戻すと");
		System.out.println("d1：" + d1);
		
		// 前の日の日付を返却するメソッドの確認
		System.out.println("d1の前の日：" + d1.prevDay());
		
		//	日付をn日後ろにすすめるメソッドの確認
		d1.addDays(7);
		System.out.println("7日足すと");
		System.out.println("d1：" + d1);
		
		//	日付をn日前に戻すメソッド
		d1.addDays(-14);
		System.out.println("14日戻すと");
		System.out.println("d1：" + d1);
		
		//	n日後の日付を返却するメソッド
		System.out.println("d1の3日後：" + d1.whenDay(3));
		
		//	n日前の日付を返却するメソッド
		System.out.println("d1の5日前：" + d1.whenDay(-5));
		
	}
	
	// compareDateの戻り値から前後関係を判定するメソッド
	public static void resCompare(int n) {
		// compareDateの戻りが1ならば
		if (n == 1)
			// 以前の日付なので、そのメッセージを表示
			System.out.println("以前の日付です");
		// compareDateの戻りが0ならば
		else if (n == 0)
			// 同じ日付なので、そのメッセージを表示
			System.out.println("同じ日付です");
		// compareDateの戻りが-1ならば
		else if (n == -1)
			// 以前の日付なので、そのメッセージを表示
			System.out.println("以後の日付です");
		// その他の場合
		else
			// なにかが間違っているのでエラー表示
			System.out.println("エラー");
	}

}
