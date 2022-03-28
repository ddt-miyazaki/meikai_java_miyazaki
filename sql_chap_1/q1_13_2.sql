-- 貸し出し記録テーブル(rental)をISBNコードでグループ化し、それぞれの「貸出数」列を出力する
-- その際、カウント数が10以上ならば「好評」、5以上10未満ならば「普通」、5未満ならば「不評」とする評価列も合わせて出力せよ

SELECT isbn, COUNT(*) AS 貸出数,
CASE
    WHEN COUNT(*) >= 10 THEN '好評'
    WHEN COUNT(*) >= 5 THEN '普通'
    ELSE '不評'
END AS 評価 FROM rental GROUP BY isbn;