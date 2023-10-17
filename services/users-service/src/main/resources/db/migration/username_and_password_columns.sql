-- Create columns for username and password in the User table
ALTER TABLE User
ADD Username VARCHAR(255);

ALTER TABLE User
ADD Password VARCHAR(255);
