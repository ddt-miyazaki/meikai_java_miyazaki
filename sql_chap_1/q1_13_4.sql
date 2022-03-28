-- 著者-書籍情報テーブル(author_books)で、著者ごとの書籍数を求めよ
-- その際、書籍数が4冊以上の著者は「多い」、2冊以上4冊未満の著者は「普通」、2冊未満の著者は「少ない」と出力せよ
-- また、出力列の名前は先頭から「著者ID」「カウント数」「評価」とする

SELECT author_id AS 著者ID, COUNT(*) AS カウント数,
CASE
    WHEN COUNT(*) >= 4 THEN '多い'
    WHEN COUNT(*) >= 2 THEN '普通'
    ELSE '少ない'
END AS 評価 FROM author_books GROUP BY author_id;