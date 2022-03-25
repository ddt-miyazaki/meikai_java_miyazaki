-- 著者-書籍情報テーブル(author_books)で、著者ごとの書籍数を求め、
-- 登録数が3冊以上の情報のみ取り出せ

SELECT author_id, COUNT(*) FROM author_books GROUP BY author_id HAVING COUNT(*) >= 3;