-- Challenge 1: Create COVID Database Schema (DDL)
CREATE DATABASE IF NOT EXISTS covid_db;
USE covid_db;

CREATE TABLE covid_cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    date DATE,
    time VARCHAR(20),
    state VARCHAR(100),
    confirmed_indian_national INT,
    confirmed_foreign_national INT,
    recoveries INT,
    deaths INT,
    confirmed_cases INT
);
