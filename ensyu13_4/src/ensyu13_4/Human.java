package ensyu13_4;

/*
	演習9-4で作成した《人間クラス》に対して、javadocコメントを与えるとともに、
	javadocツールによってドキュメントを作成せよ
*/

/**
 *	クラスHumanは、人間を表すクラスです。
 */
public class Human {
	/**
	 * 名前を表すString型のフィールドです。
	 */
	private String name;
	/**
	 * 身長を表すdouble型のフィールドです。
	 */
	private double height;
	/**
	 * 体重を表すdouble型のフィールドです。
	 */
	private double weight;
	/**
	 * 年齢を表すint型のフィールドです。
	 */
	private int age;
	/**
	 * 性別を表すint型のフィールドです。
	 * 0が男で、1が女です。
	 */
	private int sex;
	/**
	 * 誕生日を表すDay型のフィールドです。
	 */
	private Day birthDay;

	/**
	 * 人間を生成するコンストラクタです。
	 * 名前と身長と体重と年齢と性別を引数として受け取ります。
	 * @param name	年齢
	 * @param height	身長
	 * @param weight	体重
	 * @param age		年齢
	 * @param sex		性別
	 */
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
	/**
	 * 	人間を生成するコンストラクタです。
	 * 名前と身長と体重と年齢と性別と誕生日を引数として受け取ります。
	 * @param name	年齢
	 * @param height	身長
	 * @param weight	体重
	 * @param age		年齢
	 * @param sex		性別
	 * @param day		誕生日
	 */
	public Human(String name, double height, double weight, int age, int sex, Day day) {
		// 名前、身長、体重、年齢、性別の初期設定
		this(name, height, weight, age, sex);
		// 誕生日の初期設定
		birthDay = day;
	}

	/**
	 * 名前を取得します。
	 * @return 名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 身長を取得します。
	 * @return 身長
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 体重を取得します。
	 * @return 体重
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * 年齢を取得します。
	 * @return 年齢
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 性別を取得します。
	 * @return 性別
	 */
	public String getSex() {
		return sex == 0 ? "男" : "女";
	}
	/**
	 * 誕生日を取得します。
	 * @return 誕生日
	 */
	public Day getBirthDay() {
		return new Day(birthDay);
	}

	// 文字列表現を返却
	/**
	 * メソッドtoStringは人間に関する情報を表す文字列を返却します。
	 * @return 名前と身長と体重と年齢と性別と誕生日を1項目ごとに改行し、返却します
	 */
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