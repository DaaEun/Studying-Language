-- Q4 (30점) :
-- 주문을 하지 않은 고객과 그 고객의 담당직원(salesRepId)을 검색하세요.
-- 단 담당직원이 없는 고객도 출력에 포함합니다.
-- 출력 컬럼은 고객의 고객명(name), 담당직원의 성명 순으로 합니다.
-- 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 결과는 고객명의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

-- 서브쿼리 작성
SELECT customerId, salesRepId
FROM customers C
WHERE NOT EXISTS (
					SELECT *
                    FROM orders O
                    WHERE C.customerId = O.customerId
				 );

-- 정답. 제출
SELECT C.name 고객명, CONCAT(E.firstName, ' ', E.lastName) 직원성명
FROM customers C LEFT JOIN employees E ON C.salesRepId = E.employeeId -- LEFT JOIN
WHERE NOT EXISTS (
					SELECT *
                    FROM orders O
                    WHERE C.customerId = O.customerId
				 )
ORDER BY 1;