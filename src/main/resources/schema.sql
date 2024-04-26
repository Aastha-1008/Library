CREATE TABLE IF NOT EXISTS author (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    biography VARCHAR(255)
);

CREATE TABLE book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    author_id INT,
    isbn VARCHAR(255),
    publicationYear BIGINT,
    FOREIGN KEY (author_id) REFERENCES author (id)
);

CREATE TABLE rental (
    id INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT,
    renterName VARCHAR(255),
    rentalDate DATE,
    returnDate DATE,
    FOREIGN KEY (book_id) REFERENCES book (id)
);
