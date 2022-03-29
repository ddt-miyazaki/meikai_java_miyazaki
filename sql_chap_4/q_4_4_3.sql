-- 著者情報テーブル(author)上、著者名の定義を「VARCHAR(100) デフォルト値は空文字列」に変更せよ

ALTER TABLE author
MODIFY name VARCHAR(100) DEFAULT '';