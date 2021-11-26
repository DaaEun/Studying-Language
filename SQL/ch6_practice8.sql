-- Q8 (20점) :
-- 직원 이메일에서 아이디, 회사명, 도메인명을 분리하세요.
-- 예를 들어, id@company.com에서 아이디는 id, 회사명은 company, 도메인명은 com입니다.
-- 출력 컬럼은 직원의 성명, email, 아이디, 회사명, 도메인명 순으로 합니다.
-- 성명은 firstName과 lastName으로 구성되며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 결과는 성명의 오름차순으로 정렬합니다.
-- 질의 작성시 다음 내장함수를 사용할 수 있습니다.

-- REGEXP_SUBSTR(expr, pattern[, pos[, occurrence]]) : 
-- exp)의 문자열 내에 정규식 pattern과 일치하는 부분 문자열을 리턴함. 
-- pos는 검사의 시작 위치, occurrence는 일치하는 몇 번째 부분 문자열인지를 나타냄. 

-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM employees;

SELECT CONCAT(firstName, ' ', lastName) 성명, email, REGEXP_SUBSTR(email, '[^@]+') 아이디,
	REGEXP_SUBSTR(REGEXP_SUBSTR(email, '[^@]+', 1, 2), '[^\\.]+') 회사명, 
    'com' 도메인명	-- 정규표현식 설명 한번더 설명 요청합니다.
FROM employees
ORDER BY 성명;