-- 社員テーブル(employee)から役職が主任、担当、アシスタントである社員のコードを取り出し、
-- タイムカードテーブル(time_card)に挿入せよ
-- その際、日付列には今日の日付を、勤務時間列には固定値で0をセットするものとする

INSERT INTO time_card (
    s_id,
    r_date,
    work_time
) SELECT 
    s_id,
    CURRENT_DATE,
    0
FROM employee WHERE class IN ('主任', '担当', 'アシスタント');