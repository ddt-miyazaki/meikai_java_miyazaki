-- 貸出記録テーブル(rental)上、貸出日が2012年3月31日より前で、かつ、現在貸出中であるレコードについて、
-- returned列を9（紛失）で更新せよ

UPDATE rental SET returned = 9
WHERE rental_date < '2012-03-31' AND returned = false;
