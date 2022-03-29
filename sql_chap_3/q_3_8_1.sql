-- 所属部署テーブル(depart)にない所属部署に属する社員を社員テーブル(employee)から削除せよ

DELETE FROM employee WHERE depart_id NOT IN (
	SELECT depart_id FROM depart
);
