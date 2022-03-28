-- 書籍情報テーブル(books)から書名が「SQL〇〇」（〇は1文字）である書籍の情報を取り出せ
-- 取り出す列は、isbn, title, price列

SELECT isbn, title, price FROM books WHERE title LIKE 'SQL__';