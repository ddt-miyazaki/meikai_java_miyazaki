-- 書籍情報テーブル(books)を新規に作成せよ

CREATE TABLE books(
	isbn CHAR(17) NOT NULL PRIMARY KEY,
	title VARCHAR(255),
	price INT,
	publish VARCHAR(30),
	publish_date DATE,
	category_id CHAR(5) REFERENCES category(category_id)
);