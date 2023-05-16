CREATE TABLE IF NOT EXISTS posts (
    identification UUID PRIMARY KEY NOT NULL,
    title VARCHAR(32),
    sub_title VARCHAR(64),
    body VARCHAR(MAX),
    link VARCHAR(MAX),
    image VARCHAR(MAX)
);
