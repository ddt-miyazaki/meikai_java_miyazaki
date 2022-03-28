-- 出版社「日経BP」が既存の書籍に対して、一律の価格改定（10%オフ）をした
-- 書籍情報テーブル(books)上のデータを更新せよ

UPDATE books SET price = price * 0.9 WHERE publish = '日経BP';
