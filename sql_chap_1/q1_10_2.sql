-- アンケート回答テーブル(quest)から都道府県ごとの回答者の平均年齢を求めよ
-- なお、取り出す列の別名はそれぞれ「都道府県名」「平均年齢」とする

SELECT prefecture AS 都道府県名, AVG(age) AS 平均年齢 FROM quest GROUP BY prefecture;