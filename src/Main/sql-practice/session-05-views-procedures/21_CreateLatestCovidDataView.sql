-- Use Case 21: Create View for Latest COVID Data
CREATE VIEW latest_covid_data AS
SELECT 
    Country, 
    Confirmed_Cases, 
    Deaths, 
    Recoveries
FROM covid_cases
WHERE Date = (SELECT MAX(Date) FROM covid_cases);
