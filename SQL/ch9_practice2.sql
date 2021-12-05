-- 문제 설명
-- Q2 (20점) :
-- 담당 고객이 없는 직원을 검색하세요.
-- 출력 컬럼은 직원의 성명, jobTitle 순으로 합니다.
-- 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 결과는 성명의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.


-- 정답. 제출
SELECT CONCAT(firstName, ' ', lastName) 성명, jobTitle
FROM employees E
WHERE NOT EXISTS (
					SELECT *
                    FROM customers C
                    WHERE E.employeeId = C.salesRepId
				 )
ORDER BY 1;