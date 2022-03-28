-- 社員テーブル(employee)とタイムカードテーブル(time_card)を結合し、社員ごとの勤務時間平均を、平均時間の多い順に出力せよ
-- その際、タイムカードへの記録がない社員の情報についても出力せよ
-- 出力列は、社員氏名、勤務時間平均とする

SELECT CONCAT(e.l_name, e.f_name) AS 社員氏名, AVG(t.work_time) AS 勤務時間平均
FROM employee AS e LEFT JOIN time_card AS t ON e.s_id = t.s_id
GROUP BY t.s_id ORDER BY AVG(t.work_time) DESC;
