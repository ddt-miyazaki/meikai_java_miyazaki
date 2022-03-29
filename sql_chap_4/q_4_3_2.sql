-- 月間売上テーブル(sales)を主キーのない状態でまず新規作成せよ
-- これに対して、後から主キーを追加せよ

CREATE TABLE sales(
    s_id CHAR(5) NOT NULL,
    s_date DATE NOT NULL,
    s_value INT DEFAULT 0
);

ALTER TABLE sales
ADD PRIMARY KEY(s_id, s_date);