-- 著者情報テーブル(author)から名前が「山田」で始まる著者の情報を取り出せ
-- 取り出す対象は全列

SELECT * FROM author WHERE name LIKE '山田%';