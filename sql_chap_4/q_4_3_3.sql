-- 書籍情報テーブル(books)のcategory_idの後方にsales列（INT型）を追加せよ
-- これに対して、後から主キーを追加せよ

ALTER TABLE books ADD sales INT AFTER category_id;