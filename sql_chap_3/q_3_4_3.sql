-- 価格改定に伴い、商品テーブル(product)に登録されている全商品を10%値上げすることになった
-- 対応するためのSQLを記述せよ

UPDATE product SET 
    price = price * 1.1;
