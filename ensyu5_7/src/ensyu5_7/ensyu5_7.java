package ensyu5_7;

/*
	0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ
*/
public class ensyu5_7 {

	public static void main(String[] args) {
		// 1.0まで繰り返し
		for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
			// 現在の値と2乗した値を表示
			System.out.println("現在の値は"+ x + "で、2乗した値は" + x * x + "です。");
		}
	}

}
