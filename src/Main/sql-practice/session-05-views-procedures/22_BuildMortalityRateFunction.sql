-- Use Case 22: Build Mortality Rate Function
DELIMITER //
CREATE FUNCTION CalculateMortalityRate(country_name VARCHAR(100), report_date DATE)
RETURNS DECIMAL(5,2)
DETERMINISTIC
BEGIN
    DECLARE mortality_rate DECIMAL(5,2);
    SELECT (Deaths / Confirmed_Cases) * 100 INTO mortality_rate
    FROM covid_cases
    WHERE Country = country_name AND Date = report_date;
    RETURN mortality_rate;
END //
DELIMITER ;
