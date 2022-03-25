-- アンケート集計テーブル(quest)から年齢(age列)が30歳以上40歳未満の人の回答のみを取り出せ
-- なお、取り出すのはname, sex, prefecture列だけとする

SELECT name, sex, prefecture FROM quest WHERE age >= 30 AND age < 40;