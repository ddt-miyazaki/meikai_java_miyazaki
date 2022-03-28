-- 店舗テーブル(shop)と月間売上テーブル(sales)から2012年の全売上高を売上高の低い順に出力せよ

SELECT sh.s_name, SUM(sl.s_value)
FROM shop AS sh INNER JOIN sales AS sl ON sh.s_id=sl.s_id
WHERE sl.s_date BETWEEN '2012-1' AND'2012-12' GROUP BY sh.s_id ORDER BY SUM(sl.s_value) ASC;
