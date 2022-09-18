
-- DROP TABLE IF EXISTS author;
-- DROP TABLE IF EXISTS book;
-- DROP TABLE IF EXISTS book_author;

-- CREATE TABLE author
-- (
--     id               INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
--     name             VARCHAR(255)            NOT NULL
--
-- );
--
--
-- CREATE TABLE user
-- (
--     id               INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
--     name             VARCHAR(255)            NOT NULL,
-- );
-- CREATE UNIQUE INDEX users_unique_email_idx
--     ON USERS (email);
--
-- CREATE TABLE user_roles
-- (
--     user_id INTEGER NOT NULL,
--     role    VARCHAR(255) NOT NULL,
--     CONSTRAINT user_roles_idx UNIQUE (user_id, role),
-- --     FOREIGN KEY (user_id) REFERENCES USERS (id) ON DELETE CASCADE
-- );
--
-- CREATE TABLE vote
-- (
--     id          INTEGER GENERATED BY DEFAULT AS SEQUENCE GLOBAL_SEQ PRIMARY KEY,
--     value    INT          NOT NULL,
--     book_id     INTEGER      NOT NULL,
--     username VARCHAR(255)            NOT NULL
-- --     FOREIGN KEY (user_id) REFERENCES USERS (id) ON DELETE CASCADE
-- );
--
-- CREATE UNIQUE INDEX meals_unique_user_datetime_idx
--     ON meals (user_id, date_time)