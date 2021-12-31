-- Q7 (10점) :
-- 직원의 성명과 생일(birthDate), 그리고 생일의 요일을 검색하세요.
-- 성명은 firstName과 lastName으로 구성되며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 요일은 한글로 출력합니다. 예를 들어, 'Sunday'는 '일', 'Monday'는 '월'로 출력합니다.
-- 출력 컬럼은 성명, 생일, 요일 순으로 합니다.
-- 이때 결과는 성명의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM employees;

SELECT CONCAT(firstName, ' ', lastName) 성명, birthDate 생일, 
	CASE
        WHEN  DAYNAME(birthDate) = 'Monday' THEN '월'
        WHEN  DAYNAME(birthDate) = 'Tuesday' THEN '화'
        WHEN  DAYNAME(birthDate) = 'Wednesday' THEN '수'
        WHEN  DAYNAME(birthDate) = 'Thursday' THEN '목'
        WHEN  DAYNAME(birthDate) = 'Friday' THEN '금'
        WHEN  DAYNAME(birthDate) = 'Saturday' THEN '토'
		WHEN  DAYNAME(birthDate) = 'Sunday' THEN '일'
    END AS 요일 
FROM employees
ORDER BY 성명;