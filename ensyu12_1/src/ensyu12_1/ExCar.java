package ensyu12_1;

/*
	総走行距離を表すフィールドと、その値を調べるメソッドを追加した自動車クラスを作成せよ
	自動車クラスCar第2版から派生すること
*/
public class ExCar extends Car {
	// 総走行距離
	private double totalMileage;
	
	// コンストラクタ
	public ExCar(String name, int width, int height, int length, double fuel,
				  Day purchaseDay, double totalMileage) {
		// Carクラスのコンストラクタ呼び出し
		super(name, width, height, length, fuel, purchaseDay);
		// 総走行距離の設定
		this.totalMileage = totalMileage;
	}
	
	// 総走行距離のゲッタメソッド
	public double getTotalMileage() {
		// 総走行距離を返す
		return totalMileage;
	}
	
	

}
