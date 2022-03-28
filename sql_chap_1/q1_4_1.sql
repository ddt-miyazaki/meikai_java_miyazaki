-- アンケートテーブル(quest)から20歳以上の人間による回答だけを取り出せ
-- なお、取り出すのはanswer1, answer2列だけとする

SELECT answer1, answer2 FROM quest WHERE age >= 20;