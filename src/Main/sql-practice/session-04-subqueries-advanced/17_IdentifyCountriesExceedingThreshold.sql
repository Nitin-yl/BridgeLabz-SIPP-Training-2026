-- Use Case 17: Identify Countries Exceeding Case Threshold
SELECT Country 
FROM covid_cases 
WHERE Country IN (
    SELECT Country 
    FROM covid_cases 
    GROUP BY Country 
    HAVING MAX(Confirmed_Cases) > 1000000
);
