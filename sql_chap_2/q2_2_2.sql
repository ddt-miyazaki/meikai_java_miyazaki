-- 社員テーブル(employee)と所属部署テーブル(depart)を結合し、所属社員が一人もいない「幽霊」部署を洗い出せ、

SELECT d.depart_id, d.depart_name
FROM depart AS d LEFT JOIN employee AS e ON d.depart_id = e.depart_id
WHERE e.depart_id IS NULL;
