package ensyu9_3;

/*
	銀行口座クラスのテスト
*/
public class ensyu9_3 {
	public static void main(String[] args) {
		// インスタンス化してコンストラクタの確認
		Account a = new Account("たかし", "1111111", 300, new Day(2022, 2, 3));
		// toStringの確認
		System.out.println("以下toString\n" + a);
		// ゲッタの確認
		System.out.println("以下getOpenDay\n" + a.getOpenDay());
	}
}
