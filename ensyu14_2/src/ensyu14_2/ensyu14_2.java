package ensyu14_2;

// RobotPetのテスト
public class ensyu14_2 {
	public static void main(String[] args) {
		// RobotPetのインスタンス化
		RobotPet rp = new RobotPet("ロボ", "たかし");
		// スキンをBLACKに変更
		rp.changeSkin(0);
		// スキンをREDに変更
		rp.changeSkin(1);
		// スキンをGREENに変更
		rp.changeSkin(2);
		// スキンをBLUEに変更
		rp.changeSkin(3);
		// スキンをLEOPARDに変更
		rp.changeSkin(4);
		// スキンを無地に変更
		rp.changeSkin(5);
	}
}
