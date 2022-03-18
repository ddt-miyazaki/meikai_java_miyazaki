package ensyu10_1;

/*
	list10-3に示した連番クラスIdに、最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加せよ
	なお、このメソッドは、インスタンスをn個生成した時点で呼び出すとnを返すことになる
*/
// 連番クラス
class Id {
	// 何番までの識別番号を与えたか
	static int counter = 0;
	// 識別番号
	private int id;

	// コンストラクタ
	public Id() {
		// 識別番号
		id = ++counter;
	}

	// 識別番号を取得
	public int getId() {
		return id;
	}
	
	// 最後に与えた識別番号を返す
	static int getMaxId() {
		return counter;
	}
}
