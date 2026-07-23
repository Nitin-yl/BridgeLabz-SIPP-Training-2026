-- Use Case 27: Optimize Top 10 High Infection Rate Queries
CREATE INDEX idx_infection_rate ON covid_cases (infection_rate);
-- (Assuming infection_rate is a stored or materialized column)
