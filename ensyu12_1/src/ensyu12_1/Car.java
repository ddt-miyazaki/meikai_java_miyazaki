package ensyu12_1;

// 自動車クラス【第２版】
public class Car {
	// 名前
	private String name;
	// 幅
	private int width;
	// 高さ
	private int height;
	// 長さ
	private int length;
	// 現在位置Ｘ座標
	private double x;
	// 現在位置Ｙ座標
	private double y;
	// 残り燃料
	private double fuel;
	// 購入日
	private Day purchaseDay;
	
	// コンストラクタ
	public Car(String name, int width, int height, int length, double fuel,
				  Day purchaseDay) {
		this.name = name;  		this.width = width;	this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0;
		this.purchaseDay = new Day(purchaseDay); 
	}
	
	// 現在位置Ｘ座標を取得
	public double getX() { return x; }
	// 現在位置Ｙ座標を取得
	public double getY() { return y; }
	// 残り燃料を取得
	public double getFuel() { return fuel; }
	// 購入日を取得
	public Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	// スペック表示
	public void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width  + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}
	
	// Ｘ方向にdx・Ｙ方向にdy移動
	public boolean move(double dx, double dy) {
		// 移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);
		
		if (dist > fuel)
		// 移動できない…燃料不足
			return false;
		else {
			// 移動距離の分だけ燃料が減る
			fuel -= dist;
			x += dx;
			y += dy;
			// 移動完了
			return true;
		}
	}
}
