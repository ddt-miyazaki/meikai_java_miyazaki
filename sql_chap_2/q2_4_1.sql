-- 社員テーブル(employee)と所属部署テーブル(depart)、タイムカードテーブル(time_card)を結合し、
-- 社員コード'DA00001'における2012年12月分の勤務時間を日付について昇順に出力せよ
-- 出力列の別名は、先頭から「所属部署名」「社員氏名」「勤務時間」とする

SELECT d.depart_name AS 所属部署名, CONCAT(e.l_name, e.f_name) AS 社員氏名, t.work_time AS 勤務時間
FROM ( 
    employee AS e INNER JOIN depart AS d ON e.depart_id = d.depart_id
) INNER JOIN time_card AS t ON e.s_id = t.s_id
WHERE e.s_id = 'DA00001' AND t.r_date BETWEEN '2012-12-01' AND '2012-12-31'
ORDER BY t.r_date ASC;
