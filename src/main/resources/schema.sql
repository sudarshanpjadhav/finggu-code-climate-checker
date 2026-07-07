CREATE TABLE finggu_codeclimatechecker (
    id SERIAL PRIMARY KEY,
    project_name VARCHAR(255) NOT NULL,
    result VARCHAR(255) NOT NULL,
    message VARCHAR(255) NOT NULL
);
