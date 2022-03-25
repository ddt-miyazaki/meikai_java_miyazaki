-- 以下は、アンケート回答テーブル(quest)から都道府県、性別ごとの評価平均を求めるためのSQL命令です
-- 2点誤りがあります。誤りを指摘してください。
-- SELECT prefecture, sex, age, AVG(answer1) IS 評価平均 FROM quest GROUP BY prefecture, sex;

-- ageはグルーピングされていないので出力しないよう修正、IS → AS
SELECT prefecture, sex, AVG(answer1) AS 評価平均 FROM quest GROUP BY prefecture, sex;