-- アンケート回答テーブル(quest)から回答日時が新しい順にname, answer1, answer2列を取得せよ
-- その際、answer1列の値は3~1に対応して、それぞれ「ためになった」「普通」「役に立たない」という文字列に置き換えよ
-- 別名は、先頭から順に「氏名」「評価」「感想」とする

SELECT name AS 氏名,
CASE
    answer1
    WHEN 3 THEN 'ためになった'
    WHEN 2 THEN '普通'
    WHEN 1 THEN '役に立たない'
END AS 評価,
answer2 AS 感想 FROM quest ORDER BY answered DESC;