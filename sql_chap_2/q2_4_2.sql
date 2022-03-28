-- 書籍目次テーブル(contents)から前後のコンテンツを取り出せ
-- なお、取り出す列は別名として「前コンテンツ名」「現コンテンツ名」「次コンテンツ名」とし、
-- 現ページのコンテンツコードについて昇順に並べる

SELECT cp.c_title AS 前コンテンツ名, cc.c_title AS 現コンテンツ名, cn.c_title AS 次コンテンツ名
FROM ( 
    contents AS cp RIGHT JOIN contents AS cc ON cp.next_id = cc.c_id
) LEFT JOIN contents AS cn ON cc.next_id = cn.c_id
ORDER BY cc.c_id ASC;
