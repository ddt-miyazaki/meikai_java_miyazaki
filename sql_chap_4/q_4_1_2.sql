-- 注文明細テーブル(order_desc)を新規に作成せよ

CREATE TABLE order_desc(
	po_id INT NOT NULL,
	p_id CHAR(10) NOT NULL,
	quantity INT,
	PRIMARY KEY(po_id, p_id)
);