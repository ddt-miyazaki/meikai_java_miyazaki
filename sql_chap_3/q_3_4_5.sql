-- アンケート回答テーブル(quest)に「男性」「女性」「男」「女」と表記の揺らぎがあった
-- これを「男」「女」という表記に統一する
-- 以下のSQLには2点誤りがある。誤りを指摘せよ
-- UPDATE INTO quest VALUES sex=REPLACE(sex, '性', '');

-- UPDATE INTO → UPDATE, VALUES → SET
UPDATE quest SET 
    sex = REPLACE(sex, '性', '');
