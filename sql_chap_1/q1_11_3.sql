-- ユーザテーブル(usr)から利用者（氏名）と完全な住所を、利用者コードについて降順で取り出せ
-- 別名は「利用者名」「住所」とする

SELECT CONCAT(l_name, f_name) AS 利用者名, CONCAT(prefecture, city, o_address) AS 住所
FROM usr ORDER BY user_id DESC;