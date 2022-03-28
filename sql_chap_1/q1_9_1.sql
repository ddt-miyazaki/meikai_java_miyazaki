-- アンケート回答テーブル(quest)から性別ごとにそれぞれ年齢の最大／最小値を取り出せ

SELECT sex, MAX(age), MIN(age) FROM quest GROUP BY sex;