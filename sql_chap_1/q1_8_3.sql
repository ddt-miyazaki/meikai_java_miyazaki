-- 貸し出し記録テーブル(rental)から未返却のもので、貸出日が古いものを先頭から5件分取り出せ
-- 取り出す列はuser_id, isbn, rental_date列

SELECT user_id, isbn, rental_date FROM rental WHERE returned = false ORDER BY rental_date ASC LIMIT 5;