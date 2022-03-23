package ensyu14_2;

// 着せかえインタフェース
public interface Skinnable {
	// 黒
	int BLACK = 0;
	// 赤
	int RED = 1;
	// 緑
	int GREEN = 2;
	// 青
	int BLUE = 3;
	// 豹柄
	int LEOPARD = 4;
	// スキン変更
	void changeSkin(int skin);
}
