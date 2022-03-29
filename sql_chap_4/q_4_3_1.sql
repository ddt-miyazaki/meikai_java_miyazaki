-- 書籍情報テーブル(books)に対して、pages列（INT型、デフォルト値は0）、
-- rating列（CHAR(1)型、デフォルトは'B')を新たに追加せよ
-- 追加先は、テーブル定義の一番最後とする

ALTER TABLE books
ADD pages INT DEFAULT 0,
ADD rating CHAR(1) DEFAULT 'B' NOT NULL
AFTER category_id;