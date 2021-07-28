DROP TABLE IF EXISTS fale_mais_plan;
CREATE TABLE fale_mais_plan(
    id long AUTO_INCREMENT PRIMARY KEY,
    origin integer not null,
    destination integer not null,
    tariff DECIMAL not null
);