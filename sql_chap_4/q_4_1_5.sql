-- 以下は、貸出記録テーブル(rental)を新規に作成するためのSQL命令である
-- 2点誤りがある、誤りを指摘せよ
-- CREATE TABLE INTO rental (
-- 	id INT AUTO_INCREMENT, PRIMARY KEY,
-- 	user_id CHAR(7),
-- 	isbn CHAR(13),
-- 	rental_date DATE,
-- 	returned SMALLINT DEFAULT 0
-- );

-- 不要なINTOの削除、AUTO_INCREMENT後の不要なカンマの削除
CREATE TABLE rental (
	id INT AUTO_INCREMENT PRIMARY KEY,
	user_id CHAR(7),
	isbn CHAR(13),
	rental_date DATE,
	returned SMALLINT DEFAULT 0
);