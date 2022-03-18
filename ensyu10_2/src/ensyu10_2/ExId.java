package ensyu10_2;

/*
	前問で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ
	インスタンスを生成するたびに識別番号をnずつ増やして与える（nは正の数）。
	nの値は、指定されない限り1とするが、メソッドを通じて取得・変更できるようにする。
	例えばインスタンスを3個生成したあとにnを4に変更した場合、インスタンスに与える識別番号は生成順に
	1,2,3,7,11,15...となる
*/
// 連番クラス
class ExId {
	// 何番までの識別番号を与えたか
	static int counter = 0;
	// 識別番号の加算値
	static int n = 1;
	// 識別番号
	private int id;

	// コンストラクタ
	public ExId() {
		// 識別番号
		id = counter += n;
	}

	// 識別番号を取得
	public int getId() {
		return id;
	}

	// 最後に与えた識別番号を返す
	static int getMaxId() {
		return counter;
	}
	
	// 現在の加算値を取得
	static int getN() {
		return n;
	}
	
	// 引数の値に加算値を変更
	static void setN(int n) {
		ExId.n = n;
	}
}