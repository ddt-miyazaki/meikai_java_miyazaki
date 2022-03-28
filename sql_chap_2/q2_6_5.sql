-- ユーザテーブル(usr)、アンケート回答テーブル(quest)それぞれに含まれるユーザ氏名を比較し、
-- 双方に含まれるデータのみを取り出せ

SELECT CONCAT(u.l_name_kana, u.f_name_kana) FROM usr AS u
INNER JOIN quest AS q ON CONCAT(u.l_name_kana, u.f_name_kana) = q.name_kana;