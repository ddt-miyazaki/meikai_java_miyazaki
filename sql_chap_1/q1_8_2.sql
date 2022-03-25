-- アンケート回答テーブル(quest)から回答日時が新しいものを先頭から10件分取り出せ
-- 取り出す列はname, answer1, answer2列

SELECT name, answer1, answer2 FROM quest ORDER BY answered DESC LIMIT 0, 10;
SELECT name, answer1, answer2 FROM quest ORDER BY answered DESC LIMIT 10;