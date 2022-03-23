package ensyu13_2;

// 直角二等辺三角形クラス郡のテスト
public class ensyu13_2 {

	public static void main(String[] args) {
		// 左下直角二等辺三角形の描画
		new LeftUnderTriangle(3).print();
		// 左上直角二等辺三角形の描画
		new LeftTopTriangle(4).print();
		// 右下直角二等辺三角形の描画
		new RightUnderTriangle(5).print();
		// 右上直角二等辺三角形の描画
		new RightTopTriangle(6).print();
	}

}
