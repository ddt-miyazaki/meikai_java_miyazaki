-- 以下は、社員テーブル(employee)から所属部署ごとの女性の人数を求め、
-- 3人以上の部署だけを出力するためのSQL命令です
-- 2点誤りがあります。誤りを指摘してください。
-- SELECT depart_id, COUNT(*) FROM employee
-- WHERE sex=2 ORDER BY depart_id WHERE COUNT(*) >= 3;

-- ORDER → GROUP、WHERE → HAVING
SELECT depart_id, COUNT(*) FROM employee
WHERE sex = 2 GROUP BY depart_id HAVING COUNT(*) >= 3;