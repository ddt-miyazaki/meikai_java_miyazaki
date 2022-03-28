-- アクセス記録テーブル(access_log)からアクセス日付が2013/01/01以降のものについて、
-- リンク元URLごとにアクセス数を算出せよ
-- その際、アクセス数が5件未満のもののみをアクセス数降順で出力せよ

SELECT referer, COUNT(*) FROM access_log WHERE access_date >= '2013-01-01'
GROUP BY referer HAVING COUNT(*) < 5 ORDER BY COUNT(*) DESC;