drop table if exists rental;
drop table if exists book;
drop table if exists author;


CREATE TABLE IF NOT EXISTS author (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    biography VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author_id BIGINT,
    isbn VARCHAR(255) unique,
    publicationYear BIGINT,
    FOREIGN KEY (author_id) REFERENCES author (id)
);

CREATE TABLE IF NOT EXISTS rental (
    id BIGINT NOT NULL AUTO_INCREMENT,
    book_id BIGINT,
    renter_name VARCHAR(255),
    rental_date DATE,
    return_date DATE,
    PRIMARY KEY (id),
    FOREIGN KEY (book_id) REFERENCES book (id)
);

