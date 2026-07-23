-- Use Case 5: Prevent Duplicate Country-Date Entries
ALTER TABLE covid_cases
ADD CONSTRAINT unique_country_date UNIQUE (Country, Date);
