import id.DateId;

// DateIdのテスト
// DateIdtesterは無名パッケージに所属させること
public class DateIdTester {
	public static void main(String[] args) {
		// インスタンス作成
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		// id確認
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
	}
}
