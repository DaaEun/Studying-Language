-- Q3 (30점) :
-- 직원의 관리라인을 검색하세요.
-- 관리라인에는 직원의 성명이 상급자에서 하급자 순으로 나타나며, 성명과 성명 사이는 하이픈(-)으로 연결합니다.
-- 예를 들어, A가 B를 관리하고, B는 C를 관리하는 경우, 관리라인에는 ‘A-B-C’를 출력합니다.
-- 상급자와 하급자의 판단은 직원의 managerId에 나타나는 사람이 그 직원의 상급자입니다.
-- 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 출력 컬럼은 성명, jobTitle, 관리라인 순으로 합니다.


WITH RECURSIVE employeeAnchor(id, 성명, jobtitle, 관리라인) AS
(
	SELECT employeeId, CONCAT(firstName, ' ', lastName), jobTitle, CAST(CONCAT(firstName, ' ', lastName) AS CHAR(200))
	FROM employees
	WHERE managerId IS NULL 
		UNION ALL
	SELECT employeeId, CONCAT(E.firstName, ' ', E.lastName), E.jobTitle, CONCAT(A.관리라인, '-', CONCAT(E.firstName, ' ', E.lastName))
	FROM employeeAnchor A JOIN employees E ON A.id = E.managerId
)
SELECT 성명, jobtitle, 관리라인
FROM employeeAnchor;
