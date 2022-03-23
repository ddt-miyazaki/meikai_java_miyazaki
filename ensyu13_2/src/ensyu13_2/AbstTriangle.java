package ensyu13_2;

/*
	図形クラス郡に対して、直角二等辺三角形を表すクラス軍を追加せよ
	左下が直角のもの、左上が直角のもの、右下が直角のもの、右上が直角のものを追加すること
	直角二等辺三角形を表す抽象クラスを作り、そこから個々のクラスを派生して作ること
*/
// 直角二等辺三角形を表す抽象クラス
public abstract class AbstTriangle extends Shape {
	// 直角二等辺三角形の縦横一辺の長さ
	private int length;
	
	// コンストラクタ
	public AbstTriangle(int length) {
		// 引数から一辺の長さを設定
		this.length = length;
	}
	
	// 一辺の長さを返す
	public int getLength() {
		// lengthを返す
		return length;
	}

}
