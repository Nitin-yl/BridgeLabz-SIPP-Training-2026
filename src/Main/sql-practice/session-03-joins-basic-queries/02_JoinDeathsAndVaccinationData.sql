-- Use Case 2: Join COVID Deaths and Vaccination Data
SELECT 
    d.Country, 
    d.Deaths, 
    v.vaccination_status
FROM covid_deaths d
LEFT JOIN covid_vaccines v ON d.Country = v.Country AND d.Date = v.Date;
