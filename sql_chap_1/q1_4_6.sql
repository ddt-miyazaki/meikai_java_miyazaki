-- 貸し出し記録テーブル(rental)から貸出中の情報だけを取り出せ
-- なお、取り出すのはuser_id, isbn列だけとする

SELECT user_id, isbn FROM rental WHERE returned = 0;
SELECT user_id, isbn FROM rental WHERE returned = false;