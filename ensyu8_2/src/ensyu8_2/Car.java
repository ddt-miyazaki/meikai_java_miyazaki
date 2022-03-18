package ensyu8_2;

/*
	自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ
	・ナンバーを表すフィールドを追加
	・給油のためのメソッドを追加
*/

// 自動車クラス
class Car {
	// 名前
	private String name;
	// 幅
	private int width;
	// 高さ
	private int height;
	// 長さ
	private int length;
	// 現在位置X座標
	private double x;
	// 現在位置Y座標
	private double y;
	// 残り燃料
	private double fuel;
	// ナンバー
	private int no;

	// コンストラクタ
	Car(String name, int width, int height, int length, double fuel, int no) {
		// 名前の初期設定
		this.name = name;
		// 幅の初期設定
		this.width = width;
		// 高さの初期設定
		this.height = height;
		// 長さの初期設定
		this.length = length;
		// 残り燃料の初期設定
		this.fuel = fuel;
		// X･Y座標の初期設定
		x = y = 0.0;
		// ナンバーの初期設定
		this.no = no;
	}

	// 現在位置X座標を取得
	double getX() {
		return x;
	}
	// 現在位置Y座標を取得
	double getY() {
		return y;
	}
	// 残り燃料を取得
	double getFuel() {
		return fuel;
	}
	
	// ナンバーを取得
	int getNo() {
		return no;
	}
	

	// スペック表示
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width  + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}

	// X方向にdx・Y方向にdy移動
	boolean move(double dx, double dy) {
		// 移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);

		// 移動できない　… 燃料不足
		if (dist > fuel)
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
	
	// 燃料を追加する
	double addFuel(double n) {
		// 燃料をn分追加し、追加した値を返す
		return this.fuel += n;
	}
}


