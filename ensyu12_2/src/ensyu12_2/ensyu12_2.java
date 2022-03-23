package ensyu12_2;

// TimeAccountのテスト
public class ensyu12_2 {

	public static void main(String[] args) {
		// 基準となるTimeAccountインスタンス（以下、1とする）
		TimeAccount ta1 = new TimeAccount("", "", 123456, 345678);
		// 1よりも少ない合計額
		TimeAccount ta2 = new TimeAccount("", "", 123, 653);
		// 1よりも多い合計額
		TimeAccount ta3 = new TimeAccount("", "", 987123456, 345678567);
		// 1と等しい合計額
		TimeAccount ta4 = new TimeAccount("", "", 345678, 123456);
		// Account型のインスタンス
		Account a = new Account("", "", 123456);
		
		// 1が返ってくることの確認
		System.out.println(TimeAccount.compBalance(ta1, ta2));
		// -1が返ってくることの確認
		System.out.println(TimeAccount.compBalance(ta1, ta3));
		// 0が返ってくることの確認
		System.out.println(TimeAccount.compBalance(ta1, ta4));
		// Account方のインスタンスでも正常に動作することの確認
		System.out.println(TimeAccount.compBalance(ta1, a));

	}

}
