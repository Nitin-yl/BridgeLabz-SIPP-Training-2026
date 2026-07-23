-- Use Case 25: Create Audit Trigger for Data Changes
CREATE TABLE covid_cases_audit (
    audit_id INT AUTO_INCREMENT PRIMARY KEY,
    country VARCHAR(100),
    report_date DATE,
    old_confirmed INT,
    new_confirmed INT,
    change_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER //
CREATE TRIGGER before_covid_update
BEFORE UPDATE ON covid_cases
FOR EACH ROW
BEGIN
    INSERT INTO covid_cases_audit (country, report_date, old_confirmed, new_confirmed)
    VALUES (OLD.Country, OLD.Date, OLD.Confirmed_Cases, NEW.Confirmed_Cases);
END //
DELIMITER ;
