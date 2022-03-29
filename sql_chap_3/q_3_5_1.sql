-- 書籍情報テーブル(books)上、出版社を「山田出版」から「WINGS出版」に変更せよ

UPDATE books SET publish = 'WINGS出版' WHERE publish = '山田出版';
