CREATE TABLE VIDEOS(ID INT PRIMARY KEY,NAME TEXT, CREATED_AT DATE,PUBLISHED BOOLEAN DEFAULT TRUE);







-- Do not modify below this line --
SELECT table_name, column_name, data_type
FROM information_schema.columns
WHERE table_name = 'videos';
