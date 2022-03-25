-- 貸し出し記録テーブル(rental)から未返却の書籍情報を貸出日について昇順で抽出せよ
-- 取得列は、ISBNコードと貸出日(YY/MM/DDの形式)
-- 別名はそれぞれ「ISBNコード」「貸出日」とする

SELECT isbn AS ISBNコード, DATE_FORMAT(rental_date, '%y/%m/%d') AS 貸出日 FROM rental
WHERE returned = false ORDER BY rental_date ASC;