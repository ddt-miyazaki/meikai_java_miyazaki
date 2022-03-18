package ensyu10_2;
/*
	前問で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ
	インスタンスを生成するたびに識別番号をnずつ増やして与える（nは正の数）。
	nの値は、指定されない限り1とするが、メソッドを通じて取得・変更できるようにする。
	例えばインスタンスを3個生成したあとにnを4に変更した場合、インスタンスに与える識別番号は生成順に
	1,2,3,7,11,15...となる
	上記クラスのテスト
*/
public class ensyu10_2 {
	public static void main(String[] args) {
		//getMaxIdが0であることの確認
		System.out.println(ExId.getMaxId());

		ExId i1 = new ExId();

		// i1のidを確認
		System.out.println(i1.getId());
		//getMaxIdが最後に与えた識別番号の1であることの確認
		System.out.println(ExId.getMaxId());
		
		// 加算値を書き換え
		ExId.setN(3);
		// 加算値が3になっていることを確認
		System.out.println(ExId.getN());

		ExId i2 = new ExId();
		
		// i2のidが前回から3増えた4になっていることを確認
		System.out.println(i2.getId());
		//getMaxIdが最後に与えた識別番号の4であることの確認
		System.out.println(ExId.getMaxId());
		
		ExId i3 = new ExId();

		// i3のidが前回から3増えた7になっていることを確認
		System.out.println(i3.getId());
		//getMaxIdが最後に与えた識別番号の7であることの確認
		System.out.println(ExId.getMaxId());

	}

}
