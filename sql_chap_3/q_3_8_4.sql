-- 貸出記録テーブル(rental)上、returned列が9（紛失）であるレコードについて、
-- 対応する書籍情報テーブル(books)上の書籍情報を削除せよ

DELETE FROM books WHERE isbn IN (
	SELECT isbn FROM rental WHERE returned = 9
);
