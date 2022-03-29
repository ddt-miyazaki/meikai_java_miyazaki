-- 所属部署テーブル(depart)にない所属部署に属する社員を社員テーブル(employee)から抽出し、
-- 所属部署コードを「Z99（未登録）」に変更せよ

UPDATE employee SET depart_id = 'Z99'
WHERE depart_id NOT IN (
    SELECT depart_id FROM depart
);
