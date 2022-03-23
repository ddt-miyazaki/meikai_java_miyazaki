package ensyu14_2;

// RobotPetのテスト
public class ensyu14_2 {
	public static void main(String[] args) {
		// RobotPetのインスタンス化
		RobotPet rp = new RobotPet("ロボ", "たかし");
		// スキンをBLACKに変更
		rp.changeSkin(Skinnable.BLACK);
		// スキンをREDに変更
		rp.changeSkin(Skinnable.RED);
		// スキンをGREENに変更
		rp.changeSkin(Skinnable.GREEN);
		// スキンをBLUEに変更
		rp.changeSkin(Skinnable.BLUE);
		// スキンをLEOPARDに変更
		rp.changeSkin(Skinnable.LEOPARD);
		// スキンを無地に変更
		rp.changeSkin(100);
	}
}
