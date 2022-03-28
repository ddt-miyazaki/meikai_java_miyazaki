-- 貸し出し記録テーブル(rental)から未返却で貸出日が2012年12月1日より前の貸出情報を、貸出日が新しい順に抽出せよ
-- 取り出す列は全列

SELECT * FROM rental WHERE returned = false AND rental_date < '2012-12-1' ORDER BY rental_date DESC;