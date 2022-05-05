CREATE TABLE sangeetha_activities (
salesman_id int,
    salesman_name varchar2(32),
    salesman_city varchar2(32),
    commission int
);

INSERT INTO sangeetha_activities
VALUES (5001,'James Hoog','New York',15); 

select * from sangeetha_activities;


INSERT ALL
INTO sangeetha_activities VALUES(5002, 'Nail Knite', 'Paris', 13)
    INTO sangeetha_activities VALUES(5005, 'Pit Alex', 'London', 11)
    INTO sangeetha_activities VALUES(5006, 'McLyon', 'Paris', 14)
    INTO sangeetha_activities VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO sangeetha_activities VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;

select * from sangeetha_activities;

-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM sangeetha_activities;

-- Show data of salesman from Paris
SELECT * FROM sangeetha_activities WHERE salesman_city='Paris';

-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM sangeetha_activities WHERE salesman_name='Paul Adam';


