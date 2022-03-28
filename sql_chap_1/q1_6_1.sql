-- アンケート回答テーブル(quest)から性別が女であり、かつ、年齢が20歳代である回答者の情報のみを取り出せ
-- 取り出す列は全列

SELECT * FROM quest WHERE sex = '女' AND age BETWEEN 20 AND 29;