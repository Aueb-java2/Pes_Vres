/* Creation of specialized database for questions */

GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost';

CREATE DATABASE Inquiries;

USE Inquiries;

/* DROP TABLE Choice;
DROP TABLE Question;
DROP TABLE Category; */


CREATE TABLE Category(
CategoryName VARCHAR(50) PRIMARY KEY);

CREATE TABLE Question(
QuestionID INT PRIMARY KEY AUTO_INCREMENT,
QuizQuestion VARCHAR(255) NOT NULL,
CategoryName VARCHAR(50),
FOREIGN KEY(CategoryName) REFERENCES Category(CategoryName));

CREATE TABLE Choice(
ChoiceID INT PRIMARY KEY AUTO_INCREMENT,
Answer VARCHAR(255) NOT NULL,
Points INT(1),
QuestionID INT,
FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID));

/* Initialise categories */
INSERT INTO Category (CategoryName) VALUES ('Μυθολογία');
INSERT INTO Category (CategoryName) VALUES ('Πολιτισμός');
INSERT INTO Category (CategoryName) VALUES ('Γεωγραφία');
INSERT INTO Category (CategoryName) VALUES ('Ιστορία');

/* Initialise questions */
/* INSERT INTO Question (QuizQuestion, CategoryName) VALUES ('question_1', 'Μυθολογία'); */

/* Initialise choices */
/* INSERT INTO Choice (Answer, Points, QuestionID) VALUES ('answer_1', 2, 1); */