-- 月間売上テーブル(sales)を新規に作成せよ

CREATE TABLE sales(
	s_id CHAR(5) NOT NULL,
	s_date CHAR(7) NOT NULL,
	s_value INT,
	PRIMARY KEY(s_id, s_date)
);