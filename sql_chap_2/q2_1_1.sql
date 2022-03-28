-- 社員テーブル(employee)とタイムカードテーブル(time_card)から氏名と2012年12月の勤務時間を、社員コード、日付について昇順で出力せよ

SELECT CONCAT(e.l_name, e.f_name) AS 氏名, t.r_date AS 日付, t.work_time AS 勤務時間
FROM employee AS e INNER JOIN time_card AS t ON e.s_id=t.s_id
WHERE t.r_date BETWEEN '2012-12-01' AND '2012-12-31'
ORDER BY e.s_id ASC, t.r_date ASC;
