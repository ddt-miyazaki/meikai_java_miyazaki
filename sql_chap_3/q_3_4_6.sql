-- 社員テーブル(employee)において、役職列が部長である場合は「リーダ」に、課長である場合には「マネージャ」に名称変更せよ

UPDATE employee SET 
    class = (
        CASE
            class
            WHEN '部長' THEN 'リーダ'
            WHEN '課長' THEN 'マネージャ'
            ELSE class
        END
    );
