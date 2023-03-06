-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-1');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-2');
-- insert into myentity (id, field) values(nextval('hibernate_sequence'), 'field-3');


INSERT INTO company(`id`,`name`) VALUES(1,'MicroStream');
INSERT INTO company(`id`,`name`) VALUES(2,'ACME');

INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (100, 'Leslie','Andrews', '2018-09-01', 'FEMALE', 2 );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (101, 'Emma','Baumgarten', '2016-06-15', 'FEMALE', 2 );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (102, 'Avani','Gupta', '2020-04-01', 'MALE', 2 );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (103, 'Yuri','Petrov', '2019-11-01', 'MALE', 2 );
INSERT INTO Employee(`EMPLOYEE_ID`,`FIRST_NAME`, `LAST_NAME`, `HIRE_DATE`, `GENDER`, `COMPANY_ID`) VALUES (104, 'Juan','Vega', '2021-01-01', 'MALE', 2 );