-- アンケート回答テーブル(quest)に対して、以下の内容で新規データを挿入せよ

INSERT INTO quest (
    name,
    name_kana,
    sex,
    prefecture,
    answer1,
    answer2,
    answered
) VALUES (
    '佐々木三郎',
    'ササキサブロウ',
    '男',
    '東京都',
    3,
    '興味深い内容です。',
    NOW()
);