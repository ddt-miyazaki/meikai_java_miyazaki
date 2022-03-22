package id;
// ユーティリティのインポート
import static java.util.Calendar.*;

import java.util.GregorianCalendar;
/*
	list10-12のクラスDateIdをパッケージidに所属させるように書き換えよ
	なお、クラスDateIdTesterは無名パッケージに所属させること
*/
// 識別番号クラス（その3：開始番号を今日の日付から決定）
public class DateId {
	// 何番までの識別番号を与えたか
	private static int counter;
	// 識別番号
	private int id;
	
	// クラス初期化子
	static {
		GregorianCalendar today = new GregorianCalendar();
		// 年
		int y = today.get(YEAR);
		// 月
		int m = today.get(MONTH) + 1;
		// 日
		int d = today.get(DATE);
		
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		counter = y * 1000000 + m * 10000 + d * 100;	
	}
	
	// コンストラクタ
	public DateId() {
		// 識別番号
		id = ++counter; 
	}

	// 識別番号を取得
	public int getId() {
		return id;
	}
}

