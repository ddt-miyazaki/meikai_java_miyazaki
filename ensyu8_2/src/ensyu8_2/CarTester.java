package ensyu8_2;

// Carに追加したメソッドのテスト
public class CarTester {
	public static void main(String[] args) {
		// Carをインスタンス化
		Car kuruma = new Car("車", 111, 222, 333, 34000.0, 1234);
		// 新規作成したメソッドのテスト
		System.out.println(kuruma.getNo());
		System.out.println(kuruma.addFuel(421.21));
		
	}
}
