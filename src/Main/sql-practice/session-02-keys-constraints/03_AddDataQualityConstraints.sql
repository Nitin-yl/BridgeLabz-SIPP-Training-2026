-- Use Case 3: Add Constraints to Ensure Data Quality
ALTER TABLE covid_cases
MODIFY Country VARCHAR(100) NOT NULL,
MODIFY Date DATE NOT NULL,
MODIFY Confirmed_Cases INT NOT NULL;

ALTER TABLE covid_cases
ADD CONSTRAINT chk_deaths_less_than_confirmed
CHECK (Deaths <= Confirmed_Cases);
