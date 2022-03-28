-- 以下は、書籍目次テーブル(contents)から現在のコンテンツコードと前のコンテンツコードを
-- 現在のコンテンツコードについて昇順で取り出すSQLである
-- 誤りが2点ある。誤りを指摘せよ
-- SELECT cp.c_id AS 前のページ, cn.c_id AS 現在のページ
-- FROM contents AS cp OUTER JOIN contents AS cn ON cp.next_id <> cn.c_id
-- ORDER BY cn.c_id ASC;

-- OUTER → INNER, <> → =
SELECT cp.c_id AS 前のページ, cn.c_id AS 現在のページ
FROM contents AS cp INNER JOIN contents AS cn ON cp.next_id = cn.c_id
ORDER BY cn.c_id ASC;
