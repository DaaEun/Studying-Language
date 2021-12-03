-- Q5 (20점) :
-- 총주문액과 총결재액이 같은 고객을 검색하세요.
-- 출력 컬럼은 customerId, name(고객명), 총주문액, 총결재액 순으로 합니다.
-- 결과는 customerId의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT * 
FROM customers;

SELECT *
FROM payments;

SELECT C.customerId, C.name, SUM(P.amount) 총결제액
FROM customers C JOIN payments P USING (customerId)
GROUP BY C.customerId;

SELECT * 
FROM orders;

-- JOIN : customers, payments
SELECT C.customerId, C.name, SUM(P.amount) 총결제액
FROM customers C JOIN payments P USING (customerId)
GROUP BY C.customerId
ORDER BY 1;


-- 왜 틀리지?
WITH temp AS
(
	SELECT O.orderNo, SUM(Od.priceEach * Od.quantity) 주문액합계, O.customerId
	FROM orders O JOIN orderdetails Od USING (orderNo)
	GROUP BY O.orderNo
)
SELECT C.customerId, C.name 고객명, SUM(T.주문액합계) 총주문액, SUM(P.amount) 총결제액
FROM customers C JOIN payments P USING (customerId) JOIN temp T USING (customerId)
GROUP BY C.customerId
HAVING 총주문액 = 총결제액
ORDER BY 1;
