-- Q2 (10점) : 
-- 'USA' 이외의 나라(country)에 있는 고객을 검색하세요.
-- 출력 컬럼은 고객의 name, city, country 순으로 합니다.
SELECT name, city, country
FROM s_customers
WHERE country NOT IN ('USA');

/*
WHERE country <> ('USA');   -- equality check
WHERE country != ('USA');   -- Mysql에서는 허용
WHERE country NOT IN ('USA');   -- LIST 연산자, 비교대상이 하나니까 좋은 답은 아님.
WHERE country NOT LIKE ('USA'); -- pattern matching, 답은 맞으나, 의미는 틀림.
*/