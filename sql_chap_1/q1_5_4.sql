-- 社員テーブル(employee)から氏（カナ）が「ア」で始まる社員の情報だけを取り出せ
-- 取り出す列は、l_name, f_name列

SELECT l_name, f_name FROM employee WHERE l_name_kana LIKE 'ア%';