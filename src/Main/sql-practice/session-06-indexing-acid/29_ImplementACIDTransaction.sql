-- Use Case 29: Implement ACID Transaction for Vaccine Data
START TRANSACTION;

INSERT INTO vaccine_distribution (Country, Date, Doses_Administered) 
VALUES ('USA', '2023-10-01', 50000);

INSERT INTO vaccine_inventory (Country, Doses_Remaining) 
VALUES ('USA', -50000) 
ON DUPLICATE KEY UPDATE Doses_Remaining = Doses_Remaining - 50000;

-- If any step fails, roll back. Otherwise, commit.
COMMIT;
-- ROLLBACK;
