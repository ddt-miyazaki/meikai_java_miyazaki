-- 社員テーブル(employee)上、退職済みで、最終更新日が2007-03-31以前のデータを削除せよ

DELETE FROM employee WHERE last_update < '2007-03-31' AND retired = true; 