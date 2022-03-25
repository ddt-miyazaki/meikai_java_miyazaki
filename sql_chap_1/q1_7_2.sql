-- ユーザテーブル(usr)から東京都、千葉県、神奈川県に住んでいる人のリストを姓（カナ）、名（カナ）について昇順でリストせよ
-- 取り出す列はl_name, f_name, prefecture列

SELECT l_name, f_name, prefecture FROM usr
WHERE prefecture IN ('東京都', '千葉県', '神奈川県') ORDER BY l_name_kana ASC, f_name_kana ASC;