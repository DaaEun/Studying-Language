-- Q2 (10점) :
-- 주문에서 상태(status)별 주문수를 검색하세요.
-- 단, 주문일(orderDate)의 7일 내에 배송(shippedDate)이 이루어진 주문만 주문수에 포함합니다.
-- 출력 컬럼은 status, 주문수 순으로 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.
SELECT *
FROM orders;

SELECT status , COUNT(*) 주문수
FROM orders
GROUP BY status;

SELECT status , COUNT(*) 주문수
FROM orders
GROUP BY status 
HAVING (shippedDate - orderDate) < 7 ;	-- 에러 / 왜 에러가 날까요?

SELECT status, COUNT(status) 주문수
FROM orders
WHERE (shippedDate - orderDate) <= 7 
GROUP BY status;

SELECT status, COUNT(status) 주문수
FROM orders
WHERE (shippedDate - orderDate) < 7 
GROUP BY status;

-- 못 품.