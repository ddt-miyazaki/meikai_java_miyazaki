-- 貸し出し記録テーブル(rental)とユーザテーブル(usr)からそれぞれのユーザについて、
-- 現在何冊を貸し出しているかを、貸出数の多い順に取得せよ
-- 取得列は、ユーザの氏名、貸出数とする
-- また、貸出数0のユーザは出力する必要はない

SELECT CONCAT(u.l_name, u.f_name) AS 氏名, COUNT(*) AS 貸出数
FROM rental AS r INNER JOIN usr AS u ON r.user_id = u.user_id
WHERE r.returned = false GROUP BY r.user_id HAVING COUNT(*) != 0 ORDER BY COUNT(*) DESC;
