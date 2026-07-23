-- Use Case 28: Analyze Query Execution Plans
EXPLAIN 
SELECT cc.Country, cc.Confirmed_Cases, c.continent 
FROM covid_cases cc 
JOIN countries c ON cc.Country = c.country_name 
WHERE cc.Date = '2023-01-01';
