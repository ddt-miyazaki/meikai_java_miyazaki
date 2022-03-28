-- 以下は、貸出記録テーブル(rental)上、利用者コードがB200405、ISBNコードが4-0010-0000-1のデータについて、
-- 貸出日を今日の日付に更新するためのSQLである
-- 誤りが2点ある。誤りを指摘せよ
-- UPDATE rental SET rental_date CURRENT_DATE
-- WHERE user_id = 'B200405' OR isbn = '4-0010-0000-1';

-- =の抜けを修正, OR → AND
UPDATE rental SET rental_date = CURRENT_DATE
WHERE user_id = 'B200405' AND isbn = '4-0010-0000-1';