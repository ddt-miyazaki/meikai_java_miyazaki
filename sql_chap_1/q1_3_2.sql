-- アクセス記録テーブル(access_log)からリンク元URLを重複のない形式で取り出せ
SELECT DISTINCT referer FROM access_log;