-- アンケート回答テーブルから回答者の平均年齢を超えている人の回答(answer1, answer2列)を
-- 評価の低い順に取り出せ

SELECT answer1, answer2 FROM quest
WHERE age > ( SELECT AVG(age) FROM quest )
ORDER BY answer1 ASC;