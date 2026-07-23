-- Challenge 3: Update Case Information (DML)
UPDATE covid_cases
SET confirmed_cases = 120
WHERE state = 'India' AND date = '2020-03-15';
