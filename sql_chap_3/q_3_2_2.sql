-- 貸出記録テーブル(rental)に対して、以下の内容で新規データを挿入せよ

INSERT INTO rental (
    user_id,
    isbn,
    rental_date
) VALUES (
    'B200502',
    '4-0010-0000-0',
    CURRENT_DATE
);