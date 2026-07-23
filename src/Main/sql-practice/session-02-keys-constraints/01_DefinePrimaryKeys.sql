-- Use Case 1: Define Primary Keys in COVID Tables
ALTER TABLE covid_cases
ADD PRIMARY KEY (Country, Date);
