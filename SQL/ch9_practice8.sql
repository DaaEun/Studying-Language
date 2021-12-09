-- Q8 (30점) :
-- 지점(s_offices.city) 별로, 고객이 있는 국가(customers.country) 별 고객수의 평균을 구하여, 국가별 고객수와 함께 출력하세요.
-- 출력 컬럼은 city, country, 고객수, 고객수평균 순으로 합니다.
-- 결과는 city의 오름차순, country의 오름차순으로 정렬합니다.

SELECT officeCode, city
FROM offices
GROUP BY city;

SELECT E.officeCode, E.employeeId, C.customerId, country
FROM customers C JOIN employees E ON C.salesRepId = E.employeeId;

WITH temp AS
(
	SELECT E.officeCode, E.employeeId, C.customerId, C.country
	FROM customers C JOIN employees E ON C.salesRepId = E.employeeId
)
SELECT O.city, T.country, COUNT(T.customerId)고객수
FROM offices O RIGHT JOIN temp T USING (officeCode)
GROUP BY T.country
ORDER BY 1, 2;
-- customers과 employees 먼저 조인 말고, offices와 employees 도 조인 후에 교집합을 해야겠다.

SELECT customerId, country, city
FROM customers;

WITH temp AS
(
	SELECT O.city, E.employeeId
	FROM offices O JOIN employees E USING (officeCode)
),
temp2 AS
(
	SELECT E.officeCode, E.employeeId, C.customerId, C.country
	FROM customers C JOIN employees E ON C.salesRepId = E.employeeId
)
SELECT T.city, T2.country
FROM temp T JOIN temp2 T2 USING (employeeId)
ORDER BY 1, 2;


-- 제출, 정답아님
WITH temp AS
(
	SELECT O.city, C.country, C.customerId
	FROM customers C JOIN employees E ON C.salesRepId = E.employeeId
		JOIN offices O USING (officeCode)
)
SELECT city, country, COUNT(customerId) 고객수
FROM temp
GROUP BY city, country
ORDER BY 1, 2;