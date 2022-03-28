-- 書籍情報テーブル(books)と貸出記録テーブル(rental)とを結合し、書籍ごとの貸出数累計を、累計数が多い順に出力せよ
-- その際、貸出履歴が1回もない書籍についても出力せよ

SELECT b.isbn, b.title, COUNT(r.isbn)
FROM books AS b LEFT JOIN rental AS r ON b.isbn = r.isbn
GROUP BY b.isbn, b.title ORDER BY COUNT(r.isbn) DESC;
