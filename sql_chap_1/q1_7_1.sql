-- 書籍情報テーブル(books)から価格が2500~3500円の範囲の書籍を価格が安い順に取り出せ
-- 取り出す列はtitle, price列

SELECT title, price FROM books WHERE price BETWEEN 2500 AND 3500 ORDER BY price ASC;