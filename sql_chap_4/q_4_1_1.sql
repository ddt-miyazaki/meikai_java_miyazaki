-- 著者情報テーブル(author)を新規に作成せよ

CREATE TABLE author(
	author_id CHAR(5) PRIMARY KEY,
	name VARCHAR(30),
	name_kana VARCHAR(100),
	birth DATE
);