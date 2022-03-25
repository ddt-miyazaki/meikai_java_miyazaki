-- ユーザテーブル(usr)からユーザ氏名を取り出せ
-- その際、同姓同名のユーザは取り除くこと
SELECT DISTINCT l_name, f_name FROM usr;