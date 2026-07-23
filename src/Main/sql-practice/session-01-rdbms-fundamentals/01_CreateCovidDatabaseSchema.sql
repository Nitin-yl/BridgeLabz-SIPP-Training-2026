-- 1. Create COVID Database Schema
CREATE TABLE covid_cases (
    Country VARCHAR(100),
    Date DATE,
    Confirmed_Cases INT,
    Deaths INT,
    Recoveries INT,
    Population INT
);

CREATE TABLE covid_deaths (
    Country VARCHAR(100),
    Date DATE,
    Deaths INT
);

CREATE TABLE covid_vaccines (
    Country VARCHAR(100),
    Date DATE,
    Vaccines_Administered INT
);
