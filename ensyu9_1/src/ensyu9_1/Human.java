package ensyu9_1;

// 人間クラス
public class Human {
	// 名前
	private String name;
	// 身長
	private double height;
	// 体重
	private double weight;
	// 年齢
	private int age;
	// 性別 0：男、1：女
	private int sex;

	// コンストラクタ
	Human(String name, double height, double weight, int age, int sex) {
	// 名前の初期設定
	this.name = name;
	// 身長の初期設定
	this.height = height;
	// 体重の初期設定
	this.weight = weight;
	// 年齢の初期設定
	this.age = age;
	// 性別の初期設定 0：男、1：女
	this.sex = sex;

	}

	// 名前の取得
	String getName() {
		return name;
	}

	// 身長の取得
	double getHeight() {
		return height;
	}

	// 体重の取得
	double getWeight() {
		return weight;
	}

	// 年齢の取得
	int getAge() {
		return age;
	}

	// 性別の取得
	String getSex() {
		return sex == 0 ? "男" : "女";
	}
	
	// フィールドの一括設定
	void set(String name, double height, double weight, int age, int sex) {
		// 名前の設定
		this.name = name;
		// 身長の設定
		this.height = height;
		// 体重の設定
		this.weight = weight;
		// 年齢の設定
		this.age = age;
		// 性別の設定 0：男、1：女
		this.sex = sex;
	}
	
	// 名前の設定
	void setName(String name) {
		this.name = name;
	}
	
		// 身長の設定
	void setHeight(double height) {
		this.height = height;
	}
	
		// 体重の設定
	void setWeight(double weight) {
		this.weight = weight;
	}
	
		// 年齢の設定
	void setAge(int age) {
		this.age = age;
	}
	
		// 性別の設定 0：男、1：女
	void setSex(int sex) {
		this.sex = sex;
	}
	
}