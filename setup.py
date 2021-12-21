import mysql.connector

HOST = "" #admin in most machines
USER = "" # DB Name = test
PASSWORD = "" # password = 1234

mydb = mysql.connector.connect(
	host = HOST,
	user = USER,
	password = PASSWORD,
)

mycursor = mydb.cursor()

mycursor.execute(```
	create table student
	fname varchar(255),
	lname varchar(255),
	uiddb varchar(255),
	Contact varchar(255),
	adddb varchar(255),
	password varchar(255),
	eiddb varchar(255),
	dateofdb varchar(255),
	sex varchar(255)
```)

mycursor.execute(```
	create table faculty
	fname varchar(255),
	lname varchar(255),
	uiddb varchar(255),
	Contact varchar(255),
	password varchar(255),
	eiddb varchar(255),
	sex varchar(255)
```)

mycursor.execute(```
	create table courses
	coursename varchar(255),
	coursecode varchar(255),
	description varchar(255),
	profteach varchar(255)
```)

mycursor.execute(```
	create table facpub
	name varchar(255),
	prof varchar(255),
	`desc` varchar(255)
```)

mycursor.execute(```
	create table grades
	userid varchar(255),
	Subjects varchar(255),
	Midterms varchar(255),
	EndTerms varchar(255),
	Extras varchar(255)
```)

mycursor.execute(```
	create table research
	title varchar(255),
	prof varchar(255),
	`desc` varchar(255)
```)