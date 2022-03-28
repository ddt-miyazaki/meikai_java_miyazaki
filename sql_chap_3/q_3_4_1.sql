-- 書籍情報テーブル(books)を以下の要領で一括更新せよ
-- ・ISBNコードの先頭に、固定値で「ISBN」を追加
-- ・消費税込みの価格情報を税抜価格に変更

UPDATE books SET 
    isbn = CONCAT('ISBN', isbn),
    price = price / 1.1;
