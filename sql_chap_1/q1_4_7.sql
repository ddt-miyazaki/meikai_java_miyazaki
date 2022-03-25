-- アンケート集計テーブル(quest)から感想欄が未定義(NULL値)出ない情報だけを取り出せ
-- なお、取り出すのはanswer2列のみとする

SELECT answer2 FROM quest WHERE answer2 IS NOT NULL;