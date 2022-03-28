-- アンケート回答テーブル(quest)から感想欄が空でないものを取り出せ
-- 取り出す列は answer2列のみ

SELECT answer2 FROM quest WHERE answer2 != '' AND answer2 IS NOT NULL;