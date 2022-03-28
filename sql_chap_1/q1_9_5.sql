-- 以下は、アクセス記録テーブル(access_log)からメニューコード別のアクセス数を取得するためのSQL命令です
-- 2点誤りがあります。誤りを指摘してください。
-- SELECT page_id, SUM(*) FROM access_log ORDER BY page_id;

-- SUM → COUNT、ORDER → GROUP
SELECT page_id, COUNT(*) FROM access_log GROUP BY page_id;