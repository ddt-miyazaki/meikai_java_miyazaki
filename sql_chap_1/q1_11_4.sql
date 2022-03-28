-- 書籍情報テーブル(books)で出版社ごとの書籍価格の平均値を求めよ
-- 平均値が小数点数になった場合、小数点以下を切り捨てよ

SELECT publish, FLOOR(AVG(price)) FROM books GROUP BY publish;