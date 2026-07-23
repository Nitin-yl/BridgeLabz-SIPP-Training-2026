-- Use Case 23: Create Stored Procedure for Data Updates
DELIMITER //
CREATE PROCEDURE UpdateCovidStats(
    IN p_country VARCHAR(100),
    IN p_date DATE,
    IN p_new_cases INT,
    IN p_new_deaths INT,
    IN p_new_recoveries INT
)
BEGIN
    START TRANSACTION;
    UPDATE covid_cases
    SET Confirmed_Cases = Confirmed_Cases + p_new_cases,
        Deaths = Deaths + p_new_deaths,
        Recoveries = Recoveries + p_new_recoveries
    WHERE Country = p_country AND Date = p_date;
    COMMIT;
END //
DELIMITER ;
