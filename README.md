This project contains 
- ![#c5f015](https://placehold.co/15x15/c5f015/c5f015.png) `#c5f015` Schema.sql
- ![#1589F0](https://placehold.co/15x15/1589F0/1589F0.png) `#1589F0` Data.sql 

Note :- Make sure you have **libarary** database

# Sample Requests for controller functions
```diff
+Author:

1) Get All Author
  Sample Request => GET => localhost:9192/author/


2) Get Author By Id
	Sample Request => GET =>localhost:9192/author/5

3) Add Author
	JSON =>
		{
    			"name": "Walter Isaacson2",
    			"biography": "Biography of Steve Jobs"
		}
	Sample Request => POST => localhost:9192/author/


4) Update Author
	JSON => requestBody=>
		{
    			"name": "Walter Isaacson5",
    			"biography": "Biography of Steve Jobs"
		}		
	Sample Request => PUT =>localhost:9192/author/3


5) Delete Author
	Sample Request => DELETE => localhost:9192/author/3


----------------------------------------------------------------------------------------------------------------------------

+ Book: 

1) Get All Books
	Sample Request => GET => localhost:9192/book/


2) Get Books By Id
	Sample Request => GET => localhost:9192/book/5

3) Add Book
	JSON => 
		{
    			"title": "abcd",
    			"author": {
      				"id" : 3,
        			"name": "Doris Kearns Goodwin",
        			"biography": "Biography of Abraham Lincoln"
    			},
    			"isbn": "23454822012",
    			"publicationYear": 20232
		}
	Sample Request => POST => localhost:9192/book/


4) Update Book
	JSON => 
		{
    			"title": "abcdef",
    			"author": {
      				"id" : 4,
        			"name": "Doris Kearns Goodwin",
        			"biography": "Biography of Abraham Lincoln"
    			},
    			"isbn": "23454822019",
    			"publicationYear": 20232
		}
	Sample Request => PUT => localhost:9192/book/3


5) Delete Book
	Sample Request => DELETE => localhost:9192/book/2



---------------------------------------------------------------------------------------------------------------------------------



+ Rental:

1) CreateRentalRecords : -
	a) BookIsbn and RenterName are provide as pathVariable and RequestBody respectively.
	b) Url : localhost:9192/record/rent/{isbn} and requestBody "renterName"
	c) Sample Request => Post => localhost:9192/record/rent/9780394576309 
	   RequestBody = Aastha


2)ReturnBook:-
	a)BookIsbn are provided as path variable.
	b)Url : localhost:9192/record/return/{isbn}
	c)Sample Request => Post => localhost:9192/record/return/9780394576309

3)Overdue Records  :-
	a) Sample Request => GET => localhost:9192/record/overdue

4)All Records :-
	a)Sample Request => GET => localhost:9192/record/


-----------------------------------------------------------------------------------------------------------------------------------

```
