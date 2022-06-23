-- 1번 --
SELECT 'customer', a.c_name,a.age
FROM customer AS a
UNION ALL 
SELECT 'emp', b.e_nm, b.age
FROM emp AS b;

-- 2번--
CREATE VIEW v_cname as
SELECT 'customer', a.c_name,a.age
FROM customer AS a
UNION ALL 
SELECT 'emp', b.e_nm, b.age
FROM emp AS b;

-- 3번 --
CREATE TABLE member AS
SELECT 1 AS mbr_no, a.c_name, a.age
FROM customer AS a
UNION ALL
SELECT 1 AS mbr_no, b.e_nm, b.age
FROM emp AS b;



-- 4번 --
delimiter //
CREATE PROCEDURE add_youth()
BEGIN
ALTER TABLE member ADD COLUMN youth VARCHAR(20);
UPDATE member 
SET youth = '청년'
WHERE age BETWEEN 19 AND 30;
UPDATE member 
SET youth = '중년'
WHERE age BETWEEN 30 AND 50;
UPDATE member 
SET youth = '장년'
WHERE age BETWEEN 50 AND 65;
UPDATE member 
SET youth = '노인'
WHERE age >= 65;
END //
delimiter ;



-- 5번 괜히어렵게품--
CREATE TABLE age_group AS
SELECT * FROM member;

ALTER TABLE age_group MODIFY COLUMN mbr_no TO idx INT;






UPDATE age_group
SET idx = 1
WHERE youth = '청년';

UPDATE age_group
SET idx = 2
WHERE youth = '중년';

UPDATE age_group
SET idx = 3
WHERE youth = '장년';

UPDATE age_group
SET idx = 4
WHERE youth = '노인';

--안됨--
ALTER TABLE age_group ADD constraint PRIMARY KEY(idx);

 
ALTER TABLE age_group ADD COLUMN start_age INT;

 

UPDATE age_group
SET start_age = 19
WHERE idx = 1;

UPDATE age_group
SET start_age = 30
WHERE idx = 2;

UPDATE age_group
SET start_age = 50
WHERE idx = 3;

UPDATE age_group
SET start_age = 65
WHERE idx = 4;

 
 -- 5번 정답 --
 CREATE TABLE age_group2(
 idx INT,
 TYPE VARCHAR(20),
 start_age INT,
 constraint PRIMARY KEY(idx)
 );

 
 INSERT INTO age_group2
 VALUES(1,'청년',19),
 (2,'중년',30),
 (3,'장년',50),
 (4,'노인',65);
  
  -- member 테이블의 youth에 idx 넣기 --
 UPDATE member AS a
 SET a.youth = (SELECT b.idx FROM age_group AS b WHERE a.youth = b.`type`)
 WHERE a.youth IN NO NULL;

