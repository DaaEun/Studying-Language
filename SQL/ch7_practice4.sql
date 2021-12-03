-- 문제 설명
-- Q4 (10점) :
-- 고객의 총 주문액을 검색하세요.
-- 상품의 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 출력 컬럼은 customerId, name(고객명), 총주문액 순으로 합니다.
-- 결과는 customerId의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM customers;

SELECT * 
FROM orders;

SELECT * 
FROM orderdetails;


-- 두 질의를 합쳐서 고객에 따른 총 주문액을 구해야한다.
SELECT customerId, C.name 고객명, O.orderNo
FROM customers C JOIN orders O USING (customerId)
ORDER BY customerId;

SELECT O.orderNo, SUM(Od.priceEach * Od.quantity) 주문액합계
FROM orders O JOIN orderdetails Od USING (orderNo)
GROUP BY O.orderNo;

-- with 
WITH temp AS
(
	SELECT O.orderNo, SUM(Od.priceEach * Od.quantity) 주문액합계, O.customerId
	FROM orders O JOIN orderdetails Od USING (orderNo)
	GROUP BY O.orderNo
)
SELECT C.customerId, C.name 고객명, SUM(주문액합계) 총주문액
FROM customers C JOIN temp T USING (customerId)
GROUP BY C.customerId
ORDER BY 1;