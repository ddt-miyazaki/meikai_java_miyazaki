package ensyu14_1;

// 平行四辺形
public class Parallelogram extends Shape implements Plane2D {
	// 底辺の幅
	private int width;
	// 高さ
	private int height;
	
	public Parallelogram(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 文字列表現
	public String toString() {
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}
	
	// 描画
	public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= width; j++)
				System.out.print('#'); 
			System.out.println(); 
		}
	}
	
	// 面積を求める
	public int getArea() {
		return width * height;
	}


}
