-- アンケート回答テーブル(quest)と社員テーブル(employee)から女性の氏名（カナ）だけを、
-- 氏（カナ）・名（カナ）昇順で取り出せ
-- なお、重複データがあっても、そのまま出力するものとする

SELECT q.name_kana FROM quest AS q WHERE q.sex = '女' UNION ALL
SELECT CONCAT(e.l_name_kana, e.f_name_kana) FROM employee AS e WHERE e.sex = 2
ORDER BY 1;