-- 注文書テーブル(order_main)上に発注日、納品日をキーにした複合インデックスを作成せよ

CREATE INDEX ind_order ON order_main(order_date, delivery_date);