-- Use Case 26: Create Indexes on Frequently Searched Columns
CREATE INDEX idx_country_date ON covid_cases (Country, Date);
CREATE INDEX idx_date ON covid_cases (Date);
