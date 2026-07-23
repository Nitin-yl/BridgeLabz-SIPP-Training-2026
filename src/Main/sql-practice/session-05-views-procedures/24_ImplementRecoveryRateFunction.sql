-- Use Case 24: Implement Recovery Rate Function
DELIMITER //
CREATE FUNCTION CalculateRecoveryRate(country_name VARCHAR(100), report_date DATE)
RETURNS DECIMAL(5,2)
DETERMINISTIC
BEGIN
    DECLARE recovery_rate DECIMAL(5,2);
    SELECT (Recoveries / Confirmed_Cases) * 100 INTO recovery_rate
    FROM covid_cases
    WHERE Country = country_name AND Date = report_date;
    RETURN recovery_rate;
END //
DELIMITER ;
