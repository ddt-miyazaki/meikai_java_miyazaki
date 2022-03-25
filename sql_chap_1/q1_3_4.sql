-- 以下は、社員テーブル(employee)から重複なしの役職を取り出すためのSQL命令ですが、
-- 2点誤りがあります。誤りを指摘してください。
-- SELECTS ALL class, depart_id FROM employee;

-- ALL → DISTINCT, depart_id → 削除
SELECT DISTINCT class FROM employee;