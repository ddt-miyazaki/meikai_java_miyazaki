-- アクセス記録テーブル(access_log)からリンク元ごとのアクセス数を求め、10件未満を「C」。10件以上50件未満を「B」、50件以上を「A」とする「ランク」列を取得せよ
-- また、データはアクセス数が3件以上のものを多い順に並べるものとする

SELECT referer, COUNT(*),
CASE
    WHEN COUNT(*) >= 50 THEN 'A'
    WHEN COUNT(*) >= 10 THEN 'B'
    ELSE 'C'
END AS ランク FROM access_log GROUP BY referer HAVING COUNT(*) >= 3 ORDER BY COUNT(*) DESC;