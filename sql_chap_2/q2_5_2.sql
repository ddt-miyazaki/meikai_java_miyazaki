-- 所属部署テーブル(depart)から社員テーブル(employee)で使われていない部署コード、部署名を取り出せ

SELECT depart_id, depart_name FROM depart AS d
WHERE NOT EXISTS ( SELECT * FROM employee AS e WHERE d.depart_id = e.depart_id);