-- 以下は、書籍情報テーブル(books)上で分類IDが「Z9999（未分類）」であるか、NULLである書籍を削除するSQLである
-- 2点誤りがある。誤りを指摘せよ
-- DELETE books WHERE category_id = 'Z9999' AND category_id IS NULL;

-- FROMの抜けを修正, AND → OR
DELETE FROM books WHERE category_id = 'Z9999' OR category_id IS NULL;