/* Creation of specialized database for questions */
/* CREATE DATABASE stavros_pesvres; */

USE stavros_pesvres;

/* DROP TABLE Choice;
DROP TABLE Question;
DROP TABLE Category; */


CREATE TABLE Category(
CategoryName VARCHAR(50) PRIMARY KEY);

CREATE TABLE Question(
QuestionID VARCHAR(3) PRIMARY KEY,
QuizQuestion VARCHAR(255) NOT NULL,
CategoryName VARCHAR(50),
FOREIGN KEY(CategoryName) REFERENCES Category(CategoryName));

CREATE TABLE Choice(
ChoiceID INT PRIMARY KEY AUTO_INCREMENT,
Answer VARCHAR(255) NOT NULL,
Points INT(1),
QuestionID VARCHAR(3),
FOREIGN KEY(QuestionID) REFERENCES Question(QuestionID));

/* Initialise categories */
INSERT INTO Category (CategoryName) VALUES ('Μυθολογία');
INSERT INTO Category (CategoryName) VALUES ('Πολιτισμός');
INSERT INTO Category (CategoryName) VALUES ('Γεωγραφία');
INSERT INTO Category (CategoryName) VALUES ('Ιστορία');