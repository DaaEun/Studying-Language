-- Q7 (10점) :
-- 'Paris', 'London', 'Berlin'에 있는 고객을 검색하세요.
-- 출력 컬럼은 고객의 name, city 순으로 합니다.
SELECT name, city
FROM s_customers
WHERE city IN ('Paris', 'London', 'Berlin');