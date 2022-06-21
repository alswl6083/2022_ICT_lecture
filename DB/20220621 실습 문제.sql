--  실습1
SELECT * FROM customer
WHERE age >= 20 
AND LEVEL = 'GREEN' 
AND c_mobile LIKE '%3%'
ORDER BY c_name DESC;

-- 실습2
SELECT * FROM customer
WHERE LEVEL IN('GREEN', 'BLACK','TOP');

-- 실습3
SELECT sale_store AS '소매점', sum(quantity) AS '판매 수량 합계' 
FROM sales 
GROUP BY sale_store;