-- 社員テーブル(employee)上、名前が「山田 奈美」の役職を「主任」に、
-- 最終更新日を今日の日付にせよ

UPDATE employee SET
    class = '主任',
    last_update = NOW()
WHERE l_name = '山田' AND f_name = '奈美';
