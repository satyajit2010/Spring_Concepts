create schema TEST;

create TABLE TEST.DEPARTMENT (DEPT_ID VARCHAR(10) PRIMARY KEY, DEPT_NAME VARCHAR(15));
INSERT INTO TEST.DEPARTMENT VALUES('d1','IT');
INSERT INTO TEST.DEPARTMENT VALUES('d2','Engineering');
INSERT INTO TEST.DEPARTMENT VALUES('d3','QA');

create TABLE TEST.EMPLOYEE (EID VARCHAR(10) PRIMARY KEY, FNAME VARCHAR(15) NOT NULL, LNAME VARCHAR(15) NOT NULL, SALARY DECIMAL(10,2) NOT NULL, DEPT_ID VARCHAR(10) NULL);
INSERT INTO TEST.EMPLOYEE VALUES('e1', 'Satyajit', 'Chakraborty', 100, 'd2');
INSERT INTO TEST.EMPLOYEE VALUES('e2', 'Chanchal', 'Chandani', 150, 'd1');
INSERT INTO TEST.EMPLOYEE VALUES('e3', 'Sanjay', 'Singh', 175, 'd3');

create TABLE TEST.PHONE (COUNTRY_CODE VARCHAR(3), PHONE_NUMBER VARCHAR(10), PHONE_TYPE VARCHAR(20), EID VARCHAR(10), PRIMARY KEY(COUNTRY_CODE, PHONE_NUMBER));
INSERT INTO TEST.PHONE VALUES('+91','3216227111', 'LANDLINE_HOME', 'e1');
INSERT INTO TEST.PHONE VALUES('+91','3216227112', 'LANDLINE_WORK', 'e1');
INSERT INTO TEST.PHONE VALUES('+91','8007012345', 'MOBILE_WORK', 'e1');
INSERT INTO TEST.PHONE VALUES('+91','8007012346', 'MOBILE_HOME', 'e1');


