package ensyu_8_1;

// Humanクラスのテスト
public class HumanTest {

	public static void main(String[] args) {
		Human tks = new Human("たかし", 160, 50, 17, 0);
		Human hnk = new Human("はなこ", 140, 30, 8, 1);
		
		System.out.println(tks.getName());
		System.out.println(tks.getHeight());
		System.out.println(tks.getWeight());
		System.out.println(tks.getAge());
		System.out.println(tks.getSex());
		System.out.println(hnk.getName());
		System.out.println(hnk.getHeight());
		System.out.println(hnk.getWeight());
		System.out.println(hnk.getAge());
		System.out.println(hnk.getSex());

	}

}
