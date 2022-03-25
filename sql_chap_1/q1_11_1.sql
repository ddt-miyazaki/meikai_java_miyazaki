-- アンケート回答テーブル(quest)から都道府県別の評価の平均値を求めよ
-- その際平均値は小数点以下を四捨五入せよ

SELECT prefecture, ROUND(AVG(answer1)) AS 評価平均 FROM quest GROUP BY prefecture;
SELECT prefecture, ROUND(AVG(answer1), 0) AS 評価平均 FROM quest GROUP BY prefecture;