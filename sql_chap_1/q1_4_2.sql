-- 書籍情報テーブル(books)から出版社が「日経BP」「翔泳社」である書籍情報だけを取り出せ
-- なお、取り出すのはisbn, title, publish列だけとする

SELECT isbn, title, publish FROM books WHERE publish = '日経BP' OR publish = '翔泳社';