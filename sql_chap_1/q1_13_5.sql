-- 以下は、社員テーブル(employee)から社員名（氏+名を連結したもの）、
-- 役職クラス（部長、課長は管理職、主任、担当は総合職、アシスタントは一般職とする）を出力するためのSQL命令である
-- 2つ誤りがある。誤りを指摘せよ
-- SELECT CONCAT(l_name, f_name), 
-- CASE
--  WHERE class IN ('部長', '課長') THEN '管理職'
--  WHERE class IN ('主任', '担当') THEN '総合職'
--  ELSE THEN '一般職'
-- END AS 役職クラス FROM employee;

-- WHERE → WHEN, ELSE THEN → ELSE
SELECT CONCAT(l_name, f_name),
CASE
    WHEN class IN ('部長', '課長') THEN '管理職'
    WHEN class IN ('主任', '担当') THEN '総合職'
    ELSE '一般職'
END AS 役職クラス FROM employee;
