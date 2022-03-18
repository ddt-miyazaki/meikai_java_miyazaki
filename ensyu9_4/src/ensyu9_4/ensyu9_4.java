package ensyu9_4;
/*
	演習8-1で作成した《人間クラス》に、誕生日のフィールドとtoStringメソッドを追加せよ
*/
public class ensyu9_4 {

	public static void main(String[] args) {
		// インスタンス化してコンストラクタの確認
		Human a = new Human("たかし", 162, 53, 42, 0, new Day(2022, 2, 3));
		// toStringの確認
		System.out.println("以下toString\n" + a);
		// ゲッタの確認
		System.out.println("以下getOpenDay\n" + a.getBirthDay());
	}

}
