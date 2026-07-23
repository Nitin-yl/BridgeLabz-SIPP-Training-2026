-- Use Case 16: Find Countries with Above-Average Death Counts
SELECT Country, Deaths
FROM covid_cases
WHERE Deaths > (SELECT AVG(Deaths) FROM covid_cases);
