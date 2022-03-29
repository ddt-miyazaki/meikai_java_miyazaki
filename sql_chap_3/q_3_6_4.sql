-- 貸出記録テーブル(rental)上、returned列が9（紛失）であるレコードについて、
-- 対応する書籍情報テーブル(books)上の分類IDを「XXXXX」（その他）に更新せよ

UPDATE books SET category_id = 'XXXXX' WHERE isbn IN (
    SELECT isbn FROM rental WHERE returned = 9
);
