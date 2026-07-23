-- Use Case 19: Compare Vaccination Coverage
SELECT Country, 'Vaccinated' AS Status, Vaccines_Administered AS Population_Count
FROM covid_vaccines
UNION
SELECT c.Country, 'Unvaccinated' AS Status, (c.Population - v.Vaccines_Administered) AS Population_Count
FROM covid_cases c
JOIN covid_vaccines v ON c.Country = v.Country AND c.Date = v.Date;
