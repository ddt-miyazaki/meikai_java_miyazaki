-- ユーザ回答テーブル(usr)から東京都在住で、かつ、Emailアドレスのドメインが「examples.com」のユーザ情報のみを取り出せ

SELECT l_name, f_name, email FROM usr WHERE prefecture = '東京都' AND email LIKE '%examples.com';