-- 3. GROUP BY / HAVING 절
-- Q1 (10점) :
-- 고객의 국가(country) 별 고객수를 검색하세요.
-- 출력 컬럼은 country, 고객수 순으로 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.
SELECT country, COUNT(customerId) 고객수
FROM s_customers
GROUP BY country;