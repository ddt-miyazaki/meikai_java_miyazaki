-- 以下は、商品テーブル(product)に対して、新規データを挿入するためのSQLである
-- 2点誤りがある。誤りを指摘せよ
-- INSERT product VALUES (
--  SB00000001,
--  黒スタンプ,
--  1250
-- );

-- INSERT → INSERT INTO, 文字列をシングルクォートで囲うよう修正
INSERT INTO product VALUES (
    'SB00000001',
    '黒スタンプ',
    1250
);