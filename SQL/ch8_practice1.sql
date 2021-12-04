-- 2.2 FROM 절 조인
-- ​
-- Q1 (10점) :
-- 각 지점(soffices.city) 별로, 소속 직원이 담당하는 고객수를 고객의 국가별로 검색하세요.
-- 출력 컬럼은 city (soffices.city), country (s_customers.country), 고객수 순으로 합니다.
-- 결과는 city의 오름차순, country의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.

SELECT * 
FROM offices;

SELECT O.city, C.country, COUNT(C.customerId) 고객수
FROM offices O JOIN employees E USING (officeCode)
	JOIN customers C ON E.employeeId = C.salesRepId
GROUP BY C.country
ORDER BY 1, 2 DESC;
-- 에러는 아니지만, 원하는 데이터 출력 X


WITH temp1 AS
(
	SELECT O.city, O.officeCode
    FROM offices O JOIN employees E USING (officeCode)
    GROUP BY O.city
),
temp2 AS
(
	SELECT E.officeCode, E.employeeId, C.country, COUNT(C.customerId) 직원별고객수
    FROM employees E JOIN customers C ON E.employeeId = C.salesRepId
    GROUP BY C.salesRepId
)
SELECT  T1.city, T2.country, COUNT(직원별고객수) 고객수
FROM temp1 T1 JOIN temp2 T2 USING (officeCode)
GROUP BY T2.country
ORDER BY 1, 2 DESC;
-- 이것도 원하는 데이터 X

SELECT O.city, C.country, COUNT(C.customerId) 고객수
FROM offices O JOIN employees E USING (officeCode)
	JOIN customers C ON E.employeeId = C.salesRepId
GROUP BY O.city AND C.country;
SELECT O.city, O.officeCode
FROM offices O JOIN employees E USING (officeCode);

	SELECT E.officeCode, E.employeeId, C.country, COUNT(*) 직원별고객수
    FROM employees E JOIN customers C ON E.employeeId = C.salesRepId
    GROUP BY C.salesRepId;