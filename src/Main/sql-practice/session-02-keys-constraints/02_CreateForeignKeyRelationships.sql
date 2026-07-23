-- Use Case 2: Create Foreign Key Relationships
CREATE TABLE countries (
    country_name VARCHAR(100) PRIMARY KEY,
    population INT,
    continent VARCHAR(50)
);

ALTER TABLE covid_cases
ADD CONSTRAINT fk_country
FOREIGN KEY (Country) REFERENCES countries(country_name);
