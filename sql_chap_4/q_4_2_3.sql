-- 商品テーブル(product)上に商品名をキーとしたインデックスを作成せよ
-- インデックス名はind_product

CREATE INDEX ind_product ON product(p_name);