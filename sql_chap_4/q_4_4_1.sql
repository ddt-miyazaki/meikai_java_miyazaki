-- 書籍テーブル(books)上、publish列の定義を「VARCHAR(100) NULLを許可」で変更せよ

ALTER TABLE books MODIFY publish VARCHAR(100) NULL;
