-- 3. Update Case Information
UPDATE covid_cases
SET Confirmed_Cases = 1500
WHERE Country = 'India' AND Date = '2020-04-01';
