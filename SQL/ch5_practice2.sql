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





WITH temp AS (
	SELECT status, COUNT(*) 주문수, shippedDate, orderDate
    FROM orders
    GROUP BY status
    HAVING shippedDate - orderDate <= 7
)
SELECT status, 주문수
FROM temp; 




WITH temp AS (
	SELECT status, shippedDate, orderDate
    FROM orders
    WHERE shippedDate - orderDate <= 7
)
SELECT status, COUNT(*) 주문수
FROM temp
GROUP BY status;




SELECT status, COUNT(*) 주문수, shippedDate, orderDate
FROM orders
GROUP BY status;
HAVING shippedDate - orderDate < 7;




SELECT *
FROM orders
WHERE status = 'Cancelled' AND (shippedDate - orderDate) <= 7;
-- 모르겠다@.@




-- 강의에서~~

SELECT status , COUNT(orderNo) 주문수
FROM orders
WHERE shippedDate <= orderDate + INTERVAL 7 DAY
GROUP BY status; 
-- 정답


SELECT status, shippedDate, orderDate,shippedDate - orderDate AS diff
FROM orders
ORDER BY diff DESC;
-- 2003-12-26	2003-10-22	204
-- 200312026 - 20031022 이렇게 정수로 계산되어서 204 가 나오게 된다.

SELECT status , COUNT(orderNo) 주문수
FROM orders
WHERE TIMESTAMPDIFF(DAY, orderDate, shippedDate) < 7 
GROUP BY status; 
-- 또 다른 정답
-- TIMESTAMPDIFF(unit, begin, end) 함수
-- 두 날짜형 값의 차이를 주어진 단위로 계산. (end – begin)