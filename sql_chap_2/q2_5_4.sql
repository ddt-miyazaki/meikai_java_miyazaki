-- 貸出記録テーブル(rental)上を検索し、これまでに1度も書籍の貸し出しを行ったことのない
-- ユーザの氏名をユーザテーブル(usr)から取り出せ

SELECT CONCAT(u.l_name, u.f_name) AS 氏名 FROM usr AS u
INNER JOIN sales AS sl ON s.s_id = sl.s_id
WHERE NOT EXISTS ( SELECT * FROM rental AS r WHERE u.user_id = r.user_id);