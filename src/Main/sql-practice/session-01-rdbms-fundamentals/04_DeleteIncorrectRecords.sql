-- 4. Delete Incorrect Records
-- Delete where country was entered incorrectly
DELETE FROM covid_cases
WHERE Country = 'IN';

-- Delete duplicate records (assuming we keep one using a hypothetical unique ID, or we delete exact duplicates using a CTE if supported, but here is a standard approach using rowid/ctid or self-join)
-- For a standard SQL query to delete duplicates where there's no primary key:
DELETE c1 FROM covid_cases c1
INNER JOIN covid_cases c2 
WHERE c1.Country = c2.Country 
  AND c1.Date = c2.Date 
  AND c1.rowid > c2.rowid; -- Note: rowid is specific to DBs like SQLite/Oracle. In MySQL, you might need an auto-increment ID to do this easily.
