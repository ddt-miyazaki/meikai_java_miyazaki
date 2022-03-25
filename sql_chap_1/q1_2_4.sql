-- 以下は、書籍情報テーブル(books)からtitle列とpublish列を取り出すための
-- SQL命令ですが、2点誤りがあります。誤りを指摘してください。
-- SELECTS title publish FROM books;

-- SELECTS → SELECT, title → title,
SELECT title, publish FROM books;