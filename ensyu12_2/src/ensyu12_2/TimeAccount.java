package ensyu12_2;

/*
	定期預金付き銀行口座クラス型変数a, bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド
	compBalanceを作成せよ
	static int compBalance(Account a, Account b)
	合計額を比較して、aのほうが多ければ1、等しければ0、bのほうが多ければ-1を返却すること
	もしaやbの参照先が、定期預金を持たないAccount型のインスタンスであれば、普通預金の金額を比較の対象とすること
*/
// 定期預金付き銀行口座クラス【第1版】
public class TimeAccount extends Account{
	// 預金残高（定期預金）
	private long timeBalance;
	
	// コンストラクタ
	TimeAccount(String n, String num, long z, long timeBalance) {
		// クラスAccountのコンストラクタの呼び出し
		super(n, num, z);
		// 預金残高（定期預金）
		this.timeBalance = timeBalance;
	}
	
	// 定期預金残高を調べる
	long getTimeBalance() {
		return timeBalance;
	}
	
	// 定期預金を解約して全額を普通預金に移す
	void cancel() {	
		deposit(timeBalance);
		timeBalance = 0;
	}
	
	// a, bの普通預金と定期預金残高の合計額を比較した結果を返す
	// aのほうが多ければ1、等しければ0、bのほうが多ければ-1を返す
	static int compBalance(Account a, Account b) {
		// aの合計額
		long totalA = totalBalance(a);
		// bの合計額
		long totalB = totalBalance(b);
		// aのほうが多ければ
		if (totalA > totalB)
			// 1を返す
			return 1;
		// bのほうが多ければ
		else if (totalA < totalB)
			// -1を返す
			return -1;
		// 合計が等しければ
		else
			// 0を返す
			return 0;
	}
	
	// 引数のAccountの普通預金と定期預金残高の合計額を返す
	// 定期預金を持たないAccount型のインスタンスであれば、普通預金の金額を比較の対象とする
	private static long totalBalance(Account a) {
		// TimeAccountの下位クラスであれば
		if (a instanceof TimeAccount)
			// 引数aをTimeAccountにダウンキャストして普通預金と定期預金残高の合計額を返す
			return a.getBalance() + ((TimeAccount)a).getTimeBalance();
		// 下位クラスでないならば
		else
			// 普通預金の金額を返す
			return a.getBalance();
	}
}
