-- Q3 (10점) :
-- 고객명(name)이 30자 이상인 고객을 검색하세요.
-- 출력 컬럼은 고객의 name, city, country 순으로 합니다.
SELECT name, city, country
FROM s_customers
WHERE LENGTH(name) >= 30;