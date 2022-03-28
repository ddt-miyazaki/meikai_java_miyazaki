-- 以下は、アクセス記録テーブル(access_log)からアクセス日時の新しい順に10件のログデータを取得するためのSQL命令です
-- 2点誤りがあります。誤りを指摘してください。
-- SELECT page_id, referer, ip_address FROM access_log ORDER BY access_date ASC LIMIT 10, 0;

-- ASC → DESC、LIMITを10に
SELECT page_id, referer, ip_address FROM access_log ORDER BY access_date DESC LIMIT 10;