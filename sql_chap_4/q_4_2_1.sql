-- 貸出記録テーブル(rental)上に貸出日をキーにしたインデックスを作成せよ

CREATE INDEX ind_rental ON rental(rental_date);