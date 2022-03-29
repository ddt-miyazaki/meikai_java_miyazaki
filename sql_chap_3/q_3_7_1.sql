-- 貸出記録テーブル(rental)から貸出日が2011年12月31日以前で、かつ、返却済みである情報について削除せよ

DELETE FROM rental WHERE rental_date < '2011-12-31' AND returned = true; 