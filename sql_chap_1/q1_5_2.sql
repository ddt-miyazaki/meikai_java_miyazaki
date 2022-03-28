-- アンケート回答テーブルから名前が「子」で終わらない人の情報を取り出せ
-- 取り出す列は、name列のみ

SELECT name FROM quest WHERE name NOT LIKE '%子';