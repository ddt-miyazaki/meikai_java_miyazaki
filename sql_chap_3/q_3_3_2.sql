-- 店舗テーブル(shop)からすべての店舗コードを抜き出し、月間売上テーブル(sales)に対して挿入せよ
-- その際、売上対象年月には今日の日付を、売上高には0を固定値でセットするものとする

INSERT INTO sales (
    s_id,
    s_date,
    s_value
) SELECT 
    s_id,
    DATE_FORMAT(NOW(), '%Y-%m'),
    0
FROM shop;
