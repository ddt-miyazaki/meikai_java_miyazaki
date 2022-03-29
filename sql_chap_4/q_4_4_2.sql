-- 社員テーブル(employee)上、社員の氏・名定義をいずれも「VARCHAR(50) NULLを許可しない」に変更せよ

ALTER TABLE employee
MODIFY l_name VARCHAR(50) NOT NULL,
MODIFY f_name VARCHAR(50) NOT NULL;