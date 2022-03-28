-- 店舗テーブル(shop)と月間売上テーブル(sales)から2012年12月の売上高が
-- 店舗売上平均(2012年12月の平均)を下回っている店舗名とその売上高を挙げよ

SELECT s.s_name AS 店舗名, sl.s_value AS 売上高 FROM shop AS s INNER JOIN sales AS sl ON s.s_id = sl.s_id
WHERE s_date = '2012-12' AND s_value < ( SELECT AVG(s_value) FROM sales WHERE s_date = '2012-12');