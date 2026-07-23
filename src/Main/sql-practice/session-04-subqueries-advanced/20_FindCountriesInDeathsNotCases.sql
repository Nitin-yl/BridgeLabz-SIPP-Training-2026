-- Use Case 20: Find Countries Present in Deaths but Not Cases
SELECT DISTINCT Country 
FROM covid_deaths 
WHERE Country NOT IN (
    SELECT Country 
    FROM covid_cases
);
