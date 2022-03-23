package ensyu14_1;
/*
	ここに示した図形クラス郡を利用するプログラム例を作成せよ
*/
public class ensyu14_1 {

	public static void main(String[] args) {
		// 2Dインターフェースの配列
		Plane2D[] p2d = new Plane2D[2];
		// 長方形のインスタンスを2Dインターフェース配列に代入
		p2d[0] = new Rectangle(3, 4);
		// 平行四辺形のインスタンスを2Dインターフェース配列に代入
		p2d[1] = new Parallelogram(7, 3);
		
		for (Plane2D p : p2d) {
			// 面積の表示
			System.out.println(p.getArea());
			// draw()はPlane2Dで定義されていないので使用できない
			// p.draw();
		}
		// ダウンキャストすればdraw()できる
		((Rectangle)p2d[0]).draw();
		((Parallelogram)p2d[1]).draw();
	}

}
