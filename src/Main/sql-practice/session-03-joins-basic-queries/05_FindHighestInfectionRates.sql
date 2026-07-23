-- Use Case 5: Find Countries with Highest Infection Rates
SELECT 
    cc.Country, 
    (cc.Confirmed_Cases / c.population) * 100 AS infection_rate
FROM covid_cases cc
INNER JOIN countries c ON cc.Country = c.country_name
ORDER BY infection_rate DESC;
