-- 以下は、社員テーブル(employee)から部署、役職ごとに降順ソートした結果を出力するためのSQL命令です
-- 2点誤りがあります。誤りを指摘してください。
-- SELECT depart_id, class, CONCAT('l_name', 'f_name') AS 氏名 FROM employee ORDER BY depart_id, class DESC;

-- CONCATの引数が文字列になっていたのを修正、部署のソート順を降順に修正
SELECT depart_id, class, CONCAT(l_name, f_name) AS 氏名 FROM employee ORDER BY depart_id DESC, class DESC;