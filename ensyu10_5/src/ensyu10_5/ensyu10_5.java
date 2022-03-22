package ensyu10_5;

// 銀行口座クラスAccountのテスト
public class ensyu10_5 {

	public static void main(String[] args) {
		// インスタンス作成時にメッセージが表示されることの確認
		Account a1 = new Account("たなか", "343212", 1234567890);
		System.out.println(a1.getName());
		// インスタンス作成時にメッセージが表示されることの確認
		Account a2 = new Account("たいなか", "987656", 876543);
		System.out.println(a2.getName());
	}
}
