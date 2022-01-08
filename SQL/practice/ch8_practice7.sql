-- Q7 (10점) :
-- 직원 자신이 직접 관리하는 부하 직원수를 검색하세요.
-- 예를 들어, 사장이 직접 관리하는 부하 직원은 부사장만 해당됩니다.
-- 부하 직원이 없는 말단 직원도 모두 출력에 포함하며, 이때 부하 직원수는 0으로 출력합니다.
-- 출력 컬럼은 직원의 성명, jobTitle, 부하직원수 순으로 합니다.
-- 성명은 firstName과 lastName으로 구성되며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 결과는 성명의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT CONCAT(emp.firstName, ' ', emp.lastName) AS 직원성명, emp.jobTitle, COUNT(mgr.employeeId) 부하직원수
FROM employees emp LEFT JOIN employees mgr ON emp.managerId = mgr.employeeId
GROUP BY emp.employeeId
ORDER BY 1;

-- 정답.
SELECT	CONCAT(mgr.firstName, ' ', mgr.lastName) AS 성명, mgr.jobTitle, COUNT(emp.employeeId) AS 부하직원수
FROM 	employees mgr LEFT JOIN employees emp ON mgr.employeeId = emp.managerId
GROUP 	BY mgr.employeeId;