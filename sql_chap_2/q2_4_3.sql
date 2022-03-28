-- 注文書テーブル(order_main)と注文明細テーブル(order_desc)、ユーザテーブル(usr)、商品テーブル(product)を結合し、
-- 未納の注文について、発注日、注文コード、商品コード昇順に注文情報を出力してみましょう
-- 出力列の別名は、発注日、注文コード、利用者氏名、商品名、商品単価、購入数とする

SELECT om.order_date AS 発注日, om.po_id AS 注文コード, CONCAT(u.l_name, u.f_name) AS 利用者氏名,
p.p_name AS 商品名, p.price AS 商品単価, od.quantity AS 購入数
FROM (
    (
        order_main AS om INNER JOIN order_desc AS od ON om.po_id = od.po_id
    )
    INNER JOIN usr AS u ON om.user_id = u.user_id
) INNER JOIN product AS p ON p.p_id = od.p_id
WHERE om.delivery_date IS NULL ORDER BY om.order_date ASC, om.po_id ASC, od.p_id ASC;
