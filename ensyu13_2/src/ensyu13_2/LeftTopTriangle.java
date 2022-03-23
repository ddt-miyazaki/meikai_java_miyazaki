package ensyu13_2;

/*
	図形クラス郡に対して、直角二等辺三角形を表すクラス軍を追加せよ
	左下が直角のもの、左上が直角のもの、右下が直角のもの、右上が直角のものを追加すること
	直角二等辺三角形を表す抽象クラスを作り、そこから個々のクラスを派生して作ること
*/
// 左上が直角のもの
public class LeftTopTriangle extends AbstTriangle {
	// コンストラクタ
	public LeftTopTriangle(int length) {
		// 引数から一辺の長さを設定
		super(length);
	}
	
	// 自身のクラス名と一辺の長さを文字列にして返す
	@Override public String toString() {
		return "LeftTopTriangle(length:" + getLength() + ")"; 
	}

	// 左上が直角の二等辺三角形の描画
	@Override public void draw() {
		// 三角形の縦の描画
		for (int i = getLength(); i > 0; i--) {
			// 三角形の横の描画
			for (int j = i; j > 0; j--)
				// *を表示
				System.out.print('*');
			// 改行
			System.out.println();
		}
	}
}
