-- 店舗テーブル(shop)に登録されていない店舗に関する情報を、月間売上テーブル(sales)から削除せよ

DELETE FROM sales WHERE s_id NOT IN (
	SELECT s_id FROM shop
);
