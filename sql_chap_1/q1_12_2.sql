-- アンケート回答テーブル(quest)から都道府県ごとに男性回答者のみの年齢の最高値を求め、
-- 60歳より大きい行のみ取り出せ

SELECT prefecture, MAX(age) FROM quest WHERE sex = '男'
GROUP BY prefecture HAVING MAX(age) > 60;