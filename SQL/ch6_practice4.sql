-- Q4 (10점) :
-- 오늘부터 1달 안에 생일(birthDate)을 맞을 직원을 검색하세요. (오늘이 09월 14일이면, 10월 13일까지 포함함)
-- 출력 컬럼은 성명, birthDate 순으로 합니다.
-- 단, 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 이때 결과는 생일의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM employees;

SELECT DATE(SYSDATE()), MONTH(SYSDATE()), DAY(SYSDATE());

SELECT CONCAT(firstName, ' ', lastName) 성명, birthDate
FROM employees
WHERE (MONTH(SYSDATE()) = MONTH(birthDate) AND DAY(SYSDATE()) <= DAY(birthDate)) 
	OR (MONTH(SYSDATE())+1 = MONTH(birthDate) AND DAY(SYSDATE()) > DAY(birthDate)) 
ORDER BY birthDate;