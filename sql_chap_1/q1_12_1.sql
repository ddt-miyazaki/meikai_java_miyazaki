-- アンケート回答テーブル(quest)から都道府県ごとに年齢の平均値を求め、
-- 35歳以上50歳未満のデータのみを取り出せ

SELECT prefecture, AVG(age) FROM quest
GROUP BY prefecture HAVING AVG(age) BETWEEN 35 AND 49;