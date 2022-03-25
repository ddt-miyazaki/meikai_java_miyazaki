-- 商品テーブル(product)からp_name、price列を価格が安い順に取り出せ
-- その際に、p_name列に「商品名」、price列に「価格」という別名をつけよ

SELECT p_name AS 商品名, price AS 価格 FROM product ORDER BY price ASC;