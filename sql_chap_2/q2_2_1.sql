-- ユーザテーブル(usr)と貸し出し記録テーブル(rental)から、
-- ユーザごとの貸出数を、貸出数が多い順に取得せよ
-- 取得列は、ユーザの氏名と貸し出し件数とし、貸し出し件数が0のユーザも出力する

SELECT u.l_name, u.f_name, COUNT(r.id)
FROM rental AS r RIGHT JOIN usr AS u ON r.user_id = u.user_id
GROUP BY u.user_id, u.l_name, u.f_name
ORDER BY COUNT(r.id) DESC;
