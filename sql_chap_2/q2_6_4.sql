-- 以下は、著者情報テーブル(author)とユーザテーブル(usr)からそれぞれ氏名の情報を取り出すためのSQLである
-- 2点誤りがある。誤りを指摘せよ
-- なお、統合したデータは重複を含まないものとし、結果は氏名（カナ）について降順で並べ替える
-- SELECT a.name_kana FROM author AS a UNION ALL
-- SELECT u.l_name_kana, u.f_name_kana FROM usr AS u ORDER BY 1 DESC;

-- UNION ALL → UNION, usrの氏名を結合するように修正
SELECT a.name_kana FROM author AS a UNION
SELECT CONCAT(u.l_name_kana, u.f_name_kana) FROM usr AS u ORDER BY 1 DESC;