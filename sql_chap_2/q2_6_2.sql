-- ユーザテーブル(usr)とアンケート回答テーブル(quest)、それぞれに登録されているユーザ氏名を比較し、
-- ユーザテーブル(usr)にしか登録されていないもののみを取り出せ

SELECT CONCAT(u.l_name, u.f_name) FROM usr AS u WHERE NOT EXISTS
(SELECT q.name FROM quest AS q WHERE CONCAT(u.l_name, u.f_name) = q.name);