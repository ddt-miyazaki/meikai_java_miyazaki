package ensyu15_7;
/*
	list15-15のfor文を拡張for文で実現したプログラムを作成せよ
*/
public class ensyu15_7 {

	public static void main(String[] args) {
		// 合計
		double sum = 0.0;
		// 拡張for文で処理を繰り返す
		for (String s : args)
			// argsの値を足していく
			sum += Double.parseDouble(s);
		// 合計の表示
		System.out.println("合計は" + sum + "です。");

	}

}
