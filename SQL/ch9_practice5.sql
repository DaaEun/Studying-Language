-- Q5 (30점) :
-- 지점(s_offices.city)의 직원수와 고객수를 검색하세요.
-- 지점의 고객수는 지점 소속 직원의 담당고객수의 합계를 의미합니다.
-- 출력 컬럼은 city, 직원수, 고객수 순으로 합니다.
-- 결과는 city의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM offices;

SELECT *
FROM employees;

-- 정답과 다른 데이터 출력
SELECT O.city, COUNT(E.employeeId) 직원수, 
	(
	SELECT COUNT(C.customerId)
	FROM customers C
	WHERE C.salesRepId = E.employeeId
    GROUP BY E.officeCode
	) 고객수
FROM offices O JOIN employees E USING (officeCode)
GROUP BY O.city
ORDER BY 1;

-- 서브쿼리
SELECT E.officeCode, COUNT(C.customerId)
FROM customers C, employees E
WHERE C.salesRepId = E.employeeId
GROUP BY E.officeCode;


-- 정답, 제출
-- 이제 좀 테이블이 머릿속에 그려진다..
WITH temp AS
(
	SELECT E.officeCode, E.employeeId, COUNT(C.customerId) 직원별고객수
	FROM customers C RIGHT JOIN employees E ON C.salesRepId = E.employeeId
	GROUP BY E.employeeId
)
SELECT O.city, COUNT(*) 직원수, SUM(직원별고객수) 고객수
FROM offices O JOIN temp T USING (officeCode)
GROUP BY O.officeCode
ORDER BY 1;