package ensyu12_1;

// ExCarクラスのテスト
public class ensyu12_1 {

	public static void main(String[] args) {
		// ExCarのインスタンス化
		ExCar car = new ExCar("くるま", 1234, 21, 423, 421.87, new Day(), 3.22);
		// ゲッタのテスト
		System.out.println(car.getTotalMileage());
		// スーパークラスのメソッドが呼び出せることのテスト
		car.putSpec();
	}

}
