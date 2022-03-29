-- 以下は、ユーザテーブル(usr)に対して住所（都道府県、市町村、その他）で複合インデックスを作成するためのSQLである
-- 2点誤りがある、誤りを指摘せよ
-- CREATE INDEX ind_usr IN usr(
--     prefecture
--     city
--     o_address
-- );

-- IN → ON、キーの指定をカンマ区切りに修正
CREATE INDEX ind_usr ON usr(
    prefecture,
    city,
    o_address
);
