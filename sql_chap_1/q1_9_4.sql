-- 書籍情報テーブル(books)で、出版社ごとの書籍価格の最大値を求めよ

SELECT publish, MAX(price) FROM books GROUP BY publish;