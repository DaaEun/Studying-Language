-- 2. WHERE 절 이외의 서브쿼리
-- Q6 (30점) :
-- jobTitle이 'Sales Rep'인 직원(판매담당 직원)이 2명 이상 있는 지점(s_offices.city), 그 지점의 판매담당 직원수,
-- 그리고 그 지점의 직원수를 검색하세요.
-- 출력 컬럼은 city, 판매담당 직원수, 지점 직원수 순으로 합니다.
-- 결과는 city의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT officeCode, city
FROM offices;

SELECT employeeId, officeCode, jobTitle
FROM employees;

SELECT city, COUNT(*) '지점 직원수'
FROM employees E JOIN offices O USING (officeCode)
GROUP BY city
ORDER BY 1;

SELECT officeCode, COUNT(*) '판매담당 직원수'
FROM employees
WHERE jobTitle LIKE '%Sales Rep%' 
GROUP BY officeCode
HAVING COUNT(*) >= 2;


-- 정답. 제출
WITH temp AS
(
	SELECT officeCode, COUNT(*) Sales_Rep
	FROM employees
	WHERE jobTitle LIKE '%Sales Rep%' 
	GROUP BY officeCode
	HAVING COUNT(*) >= 2
)
SELECT city, (
		SELECT Sales_Rep
		FROM temp T
		WHERE T.officeCode = O.officeCode
			 ) '판매담당 직원수', COUNT(*) '지점 직원수'
FROM employees E JOIN offices O USING (officeCode)
GROUP BY city
ORDER BY 1;