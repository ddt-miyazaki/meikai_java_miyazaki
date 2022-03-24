package ensyu15_6;
/*
	コマンドライン引数で与えられた半径を持つ円の円周の長さと面積を求めて表示するプログラムを作成せよ
*/
public class ensyu15_6 {

	public static void main(String[] args) {
		// 引数から半径を取り出す
		double r = Double.parseDouble(args[0]);
		// 円周の長さを表示
		System.out.println("円周の長さ：" + r * 2 * Math.PI);
		// 面積を表示
		System.out.println("円の面積：" + r * r * Math.PI);
	}

}
