-- Q5 (10점) :
-- 직원의 성명과 생일(birthDate)을 검색하세요.
-- 성명은 firstName과 lastName으로 구성되며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 생일은 월, 일, 4자리 년도 순서로 나오고 사이사이에 점(.)이 들어갑니다. (USA 스타일)
-- 출력 컬럼은 성명, 생일 순으로 합니다.
-- 이때 결과는 생일의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM employees;


SELECT CONCAT(firstName, ' ', lastName) 성명, DATE_FORMAT(birthDate, GET_FORMAT(DATE, 'USA')) 생일
FROM employees
ORDER BY birthDate;