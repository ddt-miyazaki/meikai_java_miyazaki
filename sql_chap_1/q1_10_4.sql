-- 書籍情報テーブル(books)で、出版社ごとの書籍価格の平均値を求めよ
-- なお、取り出す列の別名はそれぞれ「出版社」「価格平均」とする

SELECT publish AS 出版社, AVG(price) AS 価格平均 FROM books GROUP BY publish;