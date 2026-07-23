-- Use Case 4: Set Default Values
ALTER TABLE covid_cases
MODIFY Recoveries INT DEFAULT 0,
MODIFY Last_Updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
