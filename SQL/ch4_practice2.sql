-- Q2 : 
-- 'USA' 이외의 나라(country)에 있는 고객을 검색하세요.
-- 출력 컬럼은 고객의 name, city, country 순으로 합니다.
SELECT name, city, country
FROM s_customers
WHERE country NOT IN ('USA');