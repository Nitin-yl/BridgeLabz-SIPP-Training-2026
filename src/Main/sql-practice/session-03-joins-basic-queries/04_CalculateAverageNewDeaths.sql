-- Use Case 4: Calculate Average New Deaths Per Day
SELECT 
    Date, 
    AVG(Deaths) AS avg_daily_deaths
FROM covid_cases
GROUP BY Date
ORDER BY Date ASC;
