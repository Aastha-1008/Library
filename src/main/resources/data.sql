INSERT INTO author (id, name, biography) VALUES (1, 'Walter Isaacson', 'Biography of Steve Jobs');
INSERT INTO author (id, name, biography) VALUES (2, 'Ron Chernow', 'Biography of Alexander Hamilton');
INSERT INTO author (id, name, biography) VALUES (3, 'Doris Kearns Goodwin', 'Biography of Abraham Lincoln');
INSERT INTO author (id, name, biography) VALUES (4, 'Robert A. Caro', 'Biography of Lyndon B. Johnson');
INSERT INTO author (id, name, biography) VALUES (5, 'Jean Edward Smith', 'Biography of Ulysses S. Grant');
INSERT INTO author (id, name, biography) VALUES (6, 'David McCullough', 'Biography of John Adams');
INSERT INTO author (id, name, biography) VALUES (7, 'Stacy Schiff', 'Biography of Cleopatra');
INSERT INTO author (id, name, biography) VALUES (8, 'Jon Meacham', 'Biography of Thomas Jefferson');
INSERT INTO author (id, name, biography) VALUES (9, 'Drew Gilpin Faust', 'Biography of James Henry Hammond');
INSERT INTO author (id, name, biography) VALUES (10, 'Brian Jay Jones', 'Biography of George Lucas');
INSERT INTO author (id, name, biography) VALUES (11, 'A. Scott Berg', 'Biography of Charles Lindbergh');
INSERT INTO author (id, name, biography) VALUES (12, 'Robert K. Massie', 'Biography of Catherine the Great');
INSERT INTO author (id, name, biography) VALUES (13, 'Andrew Roberts', 'Biography of Winston Churchill');
INSERT INTO author (id, name, biography) VALUES (14, 'David Nasaw', 'Biography of Andrew Carnegie');
INSERT INTO author (id, name, biography) VALUES (15, 'Eleanor Roosevelt', 'Biography of Eleanor Roosevelt');
INSERT INTO author (id, name, biography) VALUES (16, 'Edith Wharton', 'Biography of Edith Wharton');
INSERT INTO author (id, name, biography) VALUES (17, 'Alice Roosevelt Longworth', 'Biography of Alice Roosevelt Longworth');
INSERT INTO author (id, name, biography) VALUES (18, 'Arthur M. Schlesinger Jr.', 'Biography of Robert Kennedy');
INSERT INTO author (id, name, biography) VALUES (19, 'William Manchester', 'Biography of Douglas MacArthur');
INSERT INTO author (id, name, biography) VALUES (20, 'Michael Beschloss', 'Biography of Franklin D. Roosevelt');


INSERT INTO book (id,title, author_id, isbn, publicationYear) VALUES(1,'Steve Jobs: A Biography', 1, '9781451648546', 2011);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (2,'Alexander Hamilton', 2, '9780143034759', 2004);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (3,'Team of Rivals: The Political Genius of Abraham Lincoln', 3, '9780743270755', 2005);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (4,'The Passage of Power: The Years of Lyndon Johnson', 4, '9780679405078', 2012);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (5,'Grant', 5, '9780743200104', 2002);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (6,'John Adams', 6, '9780743223134', 2002);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (7,'Cleopatra: A Life', 7, '9780316050998', 2010);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (8,'Thomas Jefferson: The Art of Power', 8, '9781400067664', 2012);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (9,'James Henry Hammond and the Old South', 9, '9780195053117', 1982);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (10,'George Lucas: A Life', 10, '9780316257442', 2016);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (11,'Lindbergh', 11, '9780394576309', 1998);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (12,'Catherine the Great: Portrait of a Woman', 12, '9780679456728', 2011);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (13,'Churchill: Walking with Destiny', 13, '9780525559037', 2018);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (14,'Andrew Carnegie', 14, '9780143112440', 2007);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (15,'Eleanor Roosevelt', 15, '9780140094602', 1993);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (16,'Edith Wharton: A Biography', 16, '9780060888274', 2007);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (17,'Crowded Hours: Alice Roosevelt Longworth', 17, '9780394494397', 1978);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (18,'Robert Kennedy and His Times', 18, '9780345352075', 1978);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (19,'American Caesar: Douglas MacArthur 1880 - 1964', 19, '9780316544986', 1978);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (20,'Presidential Courage: Brave Leaders and How They Changed America 1789-1989', 20, '9780743257466', 2007);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (21,'Leonardo da Vinci', 1, '9781501139154', 2017);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (22,'Washington: A Life', 1, '9781594202667', 2010);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (23,'Benjamin Franklin: An American Life', 2, '9780743258074', 2003);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (24,'Napoleon: A Life', 3, '9780670025329', 2014);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (25,'Mornings on Horseback: The Story of an Extraordinary Family, a Vanished Way of Life, and the Unique Child Who Became Theodore Roosevelt', 4, '9780671447540', 1981);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (26,'Hamilton: The Revolution', 5, '9781455539741', 2016);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (27,'Theodore Rex', 6, '9780812973404', 2001);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (28,'The Wright Brothers', 2, '9781476728742', 2015);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (29,'Benjamin Franklin: Inventing America', 2, '9780195305062', 2005);
INSERT INTO book (id, title, author_id, isbn, publicationYear) VALUES (30,'The Last Lion: Winston Spencer Churchill: Visions of Glory, 1874-1932', 8, '9780316547703', 1983);



INSERT INTO rental(id, book_id, renter_name, rental_date, return_date)VALUES (1, 2, 'shyam', '2024-04-26', '2024-05-20');