-- 以下は、社員テーブル(employee)のdepart_id列の後方に「email列(VARCHAR(255)型)」を追加するSQLである
-- 2点誤りがある、誤りを指摘せよ
-- ALTER TABLE employee ADD TO email VARCHAR(255) NOT NULL BEFORE depart_id;

-- 不要なTOの削除, BEFORE → AFTER
ALTER TABLE employee ADD email VARCHAR(255) NOT NULL AFTER depart_id;
