-- 書籍情報テーブル(books)から出版社、分類IDごとに登録数を求め、
-- 登録数が3冊未満の情報のみ取り出せ

SELECT publish, category_id, COUNT(*) FROM books
GROUP BY publish, category_id HAVING COUNT(*) < 3;