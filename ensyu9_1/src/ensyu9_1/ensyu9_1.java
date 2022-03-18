package ensyu9_1;

/*
 	演習8-1で作成した≪人間クラス≫の配列を作成するプログラムを作成せよ
 	生成時に要素を初期化するもの、生成後に値を代入するものなど、
 	複数のパターンを作ること
 */
public class ensyu9_1 {

	public static void main(String[] args) {
		// 生成時に要素を初期化
		Human[] h1 = { new Human("たかし", 160, 50, 17, 0),
								new Human("たけし", 165, 55, 14, 0),
								new Human("たかこ", 150, 40, 18, 1),
		};
		
		// 生成後に要素を初期化
		Human[] h2;
		h2 = new Human[] {	new Human("たろう", 180, 70, 27, 0),
										new Human("じろう", 65, 5, 0, 0),
										new Human("はなこ", 155, 30, 12, 1),
		};
		
		// 生成後に値を挿入
		Human[] h3 = new Human[3];
		for (int i = 0;i < h3.length; i++)
			h3[i] = new Human("ひろし", 190, 120, 21, 0);
			
		
		// 作った配列内の人間の全フィールド確認
		printHuman(h1);
		printHuman(h2);
		printHuman(h3);

	}
	// Humanの全フィールドを出力する
	static void printHuman(Human[] humans) {
		for (Human h : humans) {
			System.out.print(h.getName() + ", ");
			System.out.print(h.getHeight() + ", ");
			System.out.print(h.getWeight() + ", ");
			System.out.print(h.getAge() + ", ");
			System.out.println(h.getSex());
		}
	}

}
