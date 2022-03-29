-- アクセス記録テーブル(access_log)からアクセス日時が2012年06月01日より前か、
-- リンク元のURLが空である情報を削除せよ

DELETE FROM access_log WHERE access_date < '2012-06-01' OR referer IS NULL OR referer = ''; 