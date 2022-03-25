-- 以下は、書籍情報テーブル(books)から価格（price列）が5000円未満の書籍情報のみを取り出すためのSQL命令です
-- （取り出す列はtitle, publish, price列とします）
-- 2点誤りがあります。誤りを指摘してください。
-- SELECT title publish price FROM books WHERE price <= 5000;

-- カラム名の区切りにカンマ追加, <= → <
SELECT title, publish, price FROM books WHERE price < 5000;