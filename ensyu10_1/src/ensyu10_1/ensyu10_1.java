package ensyu10_1;

// Idクラスのテスト
public class ensyu10_1 {
	public static void main(String[] args) {
		//getMaxIdが0であることの確認
		System.out.println(Id.getMaxId());
		
		Id i1 = new Id();
		
		// i1のidを確認
		System.out.println(i1.getId());
		//getMaxIdが最後に与えた識別番号の1であることの確認
		System.out.println(Id.getMaxId());
		
		Id i2 = new Id();
		Id i3 = new Id();
		
		// i3のidを確認
		System.out.println(i3.getId());
		//getMaxIdが最後に与えた識別番号の3であることの確認
		System.out.println(Id.getMaxId());
	}

}
