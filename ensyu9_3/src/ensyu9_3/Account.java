package ensyu9_3;

// 銀行口座クラス【第2版】
class Account {
	// 口座名義
	private String name;
	// 口座番号
	private String no;
	// 預金残高
	private long balance;
	// 口座開設日
	private Day openDay;

	// コンストラクタ
	Account(String n, String num, long z) {
		// 口座名義
		name = n;
		// 口座番号
		no = num;
		// 預金残高
		balance = z;
	}
	// インスタンス生成時、すべてのフィールドを引数から設定
	Account (String n, String num, long z, Day d) {
		this(n, num, z);
		openDay = d; 
	}

	// 口座名義を調べる
	String getName() {
		return name;
	}

	// 口座番号を調べる
	String getNo() {
		return no;
	}

	// 預金残高を調べる
	long getBalance() {
		return balance;
	}
	
	// 口座開設日を調べる
	Day getOpenDay() {
		return new Day(openDay);
	}
	
	// k円預ける
	void deposit(long k) {
		balance += k;
	}

	// k円おろす
	void withdraw(long k) {
		balance -= k;
	}

	// 文字列表現を返却
	public String toString() {
		return String.format(
				"口座名義：%s\n" +
				"口座番号：%s\n" +
				"預金残高：%d\n" +
				"口座開設日：%s", 
				name, no, balance, openDay);
	}
}