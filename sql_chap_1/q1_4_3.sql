-- ユーザテーブル(usr)から「東京都」に住んでいない人の情報だけを取り出せ
-- なお、取り出すのはl_name, f_name, email列だけとする

SELECT l_name, f_name, email FROM usr WHERE prefecture != '東京都';
SELECT l_name, f_name, email FROM usr WHERE prefecture <> '東京都';