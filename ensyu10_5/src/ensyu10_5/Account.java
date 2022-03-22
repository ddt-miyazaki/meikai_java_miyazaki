package ensyu10_5;

/*
	インスタンスが生成されるたびに『明解銀行での口座開設ありがとうございます。』と表示するように、
	銀行口座クラスAccountを変更せよ
	表示はインスタンス初期化子で行うこと
*/
// 銀行口座クラス【第3版】
public class Account {
    // 何番までの識別番号を与えたか
	private static int counter = 0;

    // 口座名義
	private String name;
    // 口座番号
	private String no;
    // 預金残高
	private long balance;
    // 識別番号
	private int id;
	
	// インスタンス初期化子
	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	// コンストラクタ
	public Account(String n, String num, long z) {
		// 口座名義
		name = n;
		// 口座番号
		no = num;
		// 預金残高
		balance = z;
		// 識別番号
		id = ++counter;
	}
	
	// 口座名義を取得
	public String getName() {
		return name;
	}
	
	// 口座番号を取得
	public String getNo() {
		return no;
	}
	
	// 預金残高を取得
	public long getBalance() {
		return balance;
	}
	
	// 識別番号を取得
	public int getId() {
		return id;
	}
	
	// k円預ける
	public void deposit(long k) {
		balance += k;
	}
	
	// k円おろす
	public void withdraw(long k) {
		balance -= k;
	}
}
