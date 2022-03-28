-- 以下は、書籍情報テーブルから出版社(publish列)が「秀和システム」または「日経BP」であり、かつ、
-- 価格(price列)が3000円未満の書籍を取り出すためのSQL命令です
-- 2点誤りがあります。誤りを指摘してください。
-- SELECT isbn, title FROM books WHERE publish = '秀和システム' AND publish = '日経BP' OR price < 3000;

-- publishの指定をINに修正、価格につなぐ条件をANDに修正
SELECT isbn, title FROM books WHERE publish IN ('秀和システム', '日経BP') AND price < 3000;