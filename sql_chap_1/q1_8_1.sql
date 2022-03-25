-- 書籍情報テーブル(books)から刊行日が新しいものを3件目から5件分だけ取り出せ
-- 取り出す列はtitle, publish_date列

SELECT title, publish_date FROM books ORDER BY publish_date DESC LIMIT 3, 5;