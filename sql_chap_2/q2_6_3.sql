-- ユーザテーブル(usr)とアンケート回答テーブル(quest)からそれぞれ千葉県に住んでいる人間だけを取り出し、結果を統合せよ
-- その際、重複データを取り除くものとし、かつ、氏名（カナ）について降順で並び替えるものとする

SELECT CONCAT(u.l_name_kana, u.f_name_kana) FROM usr AS u WHERE u.prefecture = '千葉県' UNION
SELECT q.name_kana FROM quest AS q WHERE q.prefecture = '千葉県'
ORDER BY 1 DESC;