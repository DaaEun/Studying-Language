-- Q7 (20점) :
-- 국가(customers.country) 별 고객수의 평균 보다 고객수가 많은 국가를 검색하세요.
-- 출력 컬럼은 country, 고객수, 평균고객수 순으로 합니다.
-- 결과는 고객수의 내림차순, 국가의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT COUNT(customerId), country
FROM customers
GROUP BY country;

SELECT COUNT(DISTINCT country)
FROM customers;


-- 제출, 정답
WITH temp AS
(
	SELECT COUNT(customerId) 고객수, country
	FROM customers
	GROUP BY country
),
temp2 AS
(
	SELECT AVG(고객수) 평균고객수
	FROM temp
)
SELECT country, 고객수, 평균고객수 
FROM temp, temp2
WHERE 고객수 > 평균고객수
ORDER BY 2 DESC, 1;