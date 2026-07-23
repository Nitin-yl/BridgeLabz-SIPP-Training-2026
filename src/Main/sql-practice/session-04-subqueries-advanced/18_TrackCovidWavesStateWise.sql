-- Use Case 18: Track COVID Waves - State-wise Analysis
SELECT 
    Date,
    Confirmed_Cases,
    CASE 
        WHEN Confirmed_Cases > (
            SELECT AVG(Confirmed_Cases) 
            FROM covid_cases c2 
            WHERE c2.state = 'Mumbai' AND c2.Date < c1.Date
        ) THEN 'Peak'
        ELSE 'Normal'
    END AS Wave_Status
FROM covid_cases c1
WHERE state = 'Mumbai';
