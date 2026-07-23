-- Use Case 1: Find Highest Confirmed Cases using INNER JOIN
SELECT 
    c.country_name, 
    cc.Confirmed_Cases
FROM covid_cases cc
INNER JOIN countries c ON cc.Country = c.country_name
WHERE cc.Date = '2023-01-01'
ORDER BY cc.Confirmed_Cases DESC
LIMIT 1;
