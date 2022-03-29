-- 問1のSQLを相関サブクエリを使って書き換えよ

UPDATE employee AS e SET depart_id = 'Z99'
WHERE NOT EXISTS (
    SELECT * FROM depart AS d WHERE e.depart_id = d.depart_id
);
