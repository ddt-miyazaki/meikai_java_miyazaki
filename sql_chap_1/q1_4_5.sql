-- アンケート集計テーブル(quest)から回答日時が「2013-01-01」以降の情報のみを取り出せ
-- なお、取り出すのはname, answer1, answer2列だけとする

SELECT name, answer1, answer2 FROM quest WHERE answered >= '2013-01-01';