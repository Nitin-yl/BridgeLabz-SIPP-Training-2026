-- Use Case 3: Analyze Deaths by Continent
SELECT 
    c.continent, 
    SUM(cc.Deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN continents c ON cc.Country = c.country_name
GROUP BY c.continent;
