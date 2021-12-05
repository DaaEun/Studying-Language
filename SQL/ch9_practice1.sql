-- 1. WHERE 절 서브쿼리
-- 1.1 비연관 서브쿼리
-- Q1 (20점) :
-- 고객의 최종 주문일(orderDate)을 검색하세요. 단, 주문이 없는 고객은 제외합니다.
-- 출력 컬럼은 고객명(name), 최종 주문일 순으로 합니다.
-- 결과는 최종 주문일의 내림차순, 고객명의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM customers;

SELECT *
FROM orders;


-- ㅋㅋㅋ time exceeded
SELECT DISTINCT C.name 고객, O.orderDate 최종주문일 
FROM customers C, orders O
WHERE C.customerId = ANY (
						SELECT customerId
                        FROM orders
                        GROUP BY customerId
                        HAVING orderdate = MAX(orderDate)
					  )
ORDER BY 2 DESC, 1;


-- 정답. 근데 비연관 서브쿼리 적용안함
SELECT C.name 고객, MAX(O.orderDate) 최종주문일 
FROM customers C RIGHT JOIN orders O USING (customerId)
GROUP BY customerId
ORDER BY 2 DESC, 1;


-- 정답.제출
SELECT C.name 고객, O.orderDate 최종주문일 
FROM customers C RIGHT JOIN orders O USING (customerId)
WHERE (C.customerId, O.orderDate) IN (
										SELECT customerId, MAX(orderDate)
										FROM orders
										GROUP BY customerId
									)
ORDER BY 2 DESC, 1;