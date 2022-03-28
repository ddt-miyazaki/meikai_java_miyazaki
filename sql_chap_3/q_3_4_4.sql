-- 問1でISBNコードの先頭に付加した固定文字列「ISBN」を一律取り除け

UPDATE books SET 
    isbn = REPLACE(isbn, 'ISBN', '');
