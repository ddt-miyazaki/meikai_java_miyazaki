-- 問1のSQLを相関サブクエリを使って書き換えよ

DELETE FROM employee AS e WHERE NOT EXISTS (
	SELECT d.depart_id FROM depart AS d WHERE e.depart_id = d.depart_id
);
