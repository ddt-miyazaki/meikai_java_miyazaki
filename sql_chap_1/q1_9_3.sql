-- 月間売上テーブル(sales)で、店舗別の累計売上高を算出するためのSQL命令を記述せよ

SELECT s_id, SUM(s_value) FROM sales GROUP BY s_id;