-- ユーザテーブル(usr)から都道府県別のユーザ数を求めよ
-- なお、取り出す列の別名はそれぞれ「都道府県名」「ユーザ数」とする

SELECT prefecture AS 都道府県名, COUNT(*) AS ユーザ数 FROM usr GROUP BY prefecture;