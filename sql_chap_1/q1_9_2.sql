-- アンケート回答テーブル(quest)から都道府県、性別ごとに本書の評価の平均を取り出せ

SELECT prefecture, sex, AVG(answer1) FROM quest GROUP BY prefecture, sex;