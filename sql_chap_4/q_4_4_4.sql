-- 以下は、アクセス記録テーブル(access_log)に対して、既存のreferer列の定義を「データ型VARCHAR(200)、NULL値を許可」で置き換えるためのSQLである
-- 2点誤りがある、誤りを指摘せよ
-- ALTER TABLE access_log MODIFY WITH referer, VARCHAR(200), NULL;

-- 不要なWITHの削除、　不要なカンマの削除
ALTER TABLE access_log MODIFY referer VARCHAR(200) NULL;
