/* Q13 (20점) :
오늘부터 2달 안에 생일을 맞을 직원을 검색하세요. (오늘이 09-14면, 오늘부터 11-13까지 포함함)
출력 컬럼은 직원의 성명, 생일(birthDate), 만나이 순으로 합니다.
성명은 firstName과 lastName으로 구성되며, 사이에 공백 문자(space)가 하나 들어갑니다.
결과는 생일에서 월의 오름차순, 일의 오름차순으로 정렬합니다.
*/

SELECT CONCAT(firstName, ' ', lastName) 성명, birthDate 생일,
	CASE
		WHEN ( MONTH(NOW()) > MONTH(birthDate) ) OR 
			( MONTH(NOW()) = MONTH(birthDate) AND DAY(NOW()) >= DAY(birthdate) ) 
		THEN YEAR(NOW()) - YEAR(birthDate)
		ELSE YEAR(NOW()) - YEAR(birthDate) - 1
	END 나이
FROM employees
WHERE	( MONTH(NOW()) = MONTH(birthDate) AND DAY(NOW()) <= DAY(birthDate) ) OR
        ( MONTH(NOW() + INTERVAL 1 MONTH) = MONTH(birthDate) AND DAY(NOW() + INTERVAL 1 MONTH) > DAY(birthDate) ) OR
        ( MONTH(NOW() + INTERVAL 2 MONTH) = MONTH(birthDate) AND DAY(NOW() + INTERVAL 2 MONTH) > DAY(birthDate) )
ORDER   BY MONTH(birthDate), DAY(birthDate);