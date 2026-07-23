-- Use Case 30: Demonstrate Isolation Levels
-- To prevent dirty reads, non-repeatable reads, and phantom reads:
SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;

START TRANSACTION;
SELECT SUM(Confirmed_Cases) FROM covid_cases WHERE Country = 'USA';
-- Perform operations
COMMIT;
