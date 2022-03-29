-- 書籍情報テーブル(books)上、書名の後方に分類名を付加せよ

UPDATE books AS b SET b.title = CONCAT(b.title, (
    IFNULL(
        (SELECT category_name FROM category AS c WHERE b.category_id = c.category_id), ''
    )
));
