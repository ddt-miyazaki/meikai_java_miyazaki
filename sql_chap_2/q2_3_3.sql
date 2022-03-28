-- 社員テーブル(employee)からそれぞれの社員氏名と上司氏名を、社員コードについて昇順に取り出せ
-- なお、取り出す列には別名として「社員氏名」「上司氏名」とし、上司がいない社員についても情報は取り出すこと

SELECT CONCAT(e.l_name, e.f_name) AS 社員氏名, CONCAT(eb.l_name, eb.f_name) AS 上司氏名
FROM employee AS e LEFT JOIN employee AS eb ON e.b_id = eb.s_id
ORDER BY e.s_id ASC;
