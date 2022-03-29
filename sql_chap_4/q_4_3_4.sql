-- ユーザテーブル(usr)のf_name_kanaの後方に以下の２列を追加せよ
-- ・sex列（VARCHAR(5)型、デフォルト値は男）
-- ・job列（VARCHAR(30)型）

ALTER TABLE usr
ADD job VARCHAR(30) AFTER f_name_kana,
ADD sex VARCHAR(5) DEFAULT '男' AFTER f_name_kana;
