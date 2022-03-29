-- 以下は、社員テーブル(employee)に対して、新規データを挿入するためのSQLである
-- 2点誤りがある。誤りを指摘せよ
-- INSERT INTO employee (
-- s_id
-- l_name
-- depart_id
-- last_update
-- ) VALUE (
--  'WA00001',
--  '和田',
--  'J01',
--  CURRENT_DATE
-- );

-- カラム名の後のカンマ抜けを修正, VALUE → VALUES
INSERT INTO employee (
    s_id,
    l_name,
    depart_id,
    last_update
) VALUES (
    'WA00001',
    '和田',
    'J01',
    CURRENT_DATE
);