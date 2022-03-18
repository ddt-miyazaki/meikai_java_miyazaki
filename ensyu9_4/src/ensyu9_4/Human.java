package ensyu9_4;

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
	// 誕生日
	private Day birthDay;

	// コンストラクタ
	public Human(String name, double height, double weight, int age, int sex) {
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
	//　すべてのフィールドを引数から設定する	
	public Human(String name, double height, double weight, int age, int sex, Day day) {
		// 名前、身長、体重、年齢、性別の初期設定
		this(name, height, weight, age, sex);
		// 誕生日の初期設定
		birthDay = day;
	}
	
	// 名前の取得
	public String getName() {
		return name;
	}

	// 身長の取得
	public double getHeight() {
		return height;
	}

	// 体重の取得
	public double getWeight() {
		return weight;
	}

	// 年齢の取得
	public int getAge() {
		return age;
	}

	// 性別の取得
	public String getSex() {
		return sex == 0 ? "男" : "女";
	}
	
	// 誕生日の取得
	public Day getBirthDay() {
		return new Day(birthDay);
	}
	
	// 文字列表現を返却
	public String toString() {
		return String.format(
			"名前：%s\n" +
			"身長：%.1f\n" +
			"体重：%.1f\n" +
			"年齢：%s\n" +
			"性別：%s\n" +
			"誕生日：%s", 
			name, height, weight, age, getSex(), birthDay);
	}
}
