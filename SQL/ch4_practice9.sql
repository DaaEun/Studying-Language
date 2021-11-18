-- 매니저가 없는 직원의 성명과 jobTitle을 검색하세요.
-- 출력 컬럼은 직원의 성명, jobTitle 순으로 합니다.
-- 단, 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
SELECT CONCAT(firstName, ' ', lastName) AS 성명, jobTitle
FROM s_employees
WHERE managerID IS NULL;