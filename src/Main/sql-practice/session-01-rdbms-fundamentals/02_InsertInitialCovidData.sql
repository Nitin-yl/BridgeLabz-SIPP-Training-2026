-- 2. Insert Initial COVID Data
INSERT INTO covid_cases (Country, Date, Confirmed_Cases, Deaths, Recoveries, Population)
VALUES 
    ('India', '2020-04-01', 1000, 20, 100, 1380000000),
    ('India', '2020-04-02', 1200, 25, 120, 1380000000),
    ('USA', '2020-04-01', 5000, 100, 500, 331000000),
    ('USA', '2020-04-02', 6000, 150, 600, 331000000),
    ('UK', '2020-04-01', 2000, 50, 200, 67000000),
    ('UK', '2020-04-02', 2500, 70, 250, 67000000);
