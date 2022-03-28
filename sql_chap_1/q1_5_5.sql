-- 以下は、書籍情報テーブル(books)から名前が「社」で終わる出版社の情報だけを取り出すためのSQL命令です
-- 2点誤りがあります。誤りを指摘してください。
-- 取り出す列は、title列
-- SELECT title, FROM books WHERE publish LIKE '_社';

-- titleの後のカンマを削除、正規表現を%に修正
SELECT title FROM books WHERE publish LIKE '%社';