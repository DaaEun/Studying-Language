-- 2.3 SELF JOIN
-- Q8 (20점) :
-- 자신의 매니저와 다른 지점(s_offices.city)에서 근무하는 직원을 검색하세요.
-- 출력 컬럼은 직원의 성명, jobTitle, 근무 지점, 매니저 성명, jobTitle, 매니저 근무지점 순으로 합니다.
-- 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 결과는 직원 성명의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.



-- 정답.
WITH emp AS
(
		SELECT	employeeId, CONCAT(firstName, ' ', lastName) name, jobTitle, managerId, city
        FROM	s_employees JOIN s_offices USING (officeCode)
),
mgr AS
(
		SELECT	employeeId, CONCAT(firstName, ' ', lastName) name, jobTitle, city
        FROM	s_employees JOIN s_offices USING (officeCode)
)
SELECT	emp.name 직원, emp.jobTitle, emp.city,
		mgr.name 메니저, mgr.jobTitle, mgr.city
FROM  	emp JOIN mgr ON emp.managerId = mgr.employeeId
WHERE	emp.city <> mgr.city
ORDER 	BY emp.name;