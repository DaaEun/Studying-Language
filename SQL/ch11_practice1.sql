-- 1. CTE
-- Q1 (20점) :
-- 지점(s_offices.city) 별로 주문액 합계와 결재액(amount) 합계를 검색하세요.
-- 상품 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 출력 컬럼은 city, 주문액합계, 결재액합계 순으로 합니다.
-- 결과는 주문액합계의 내림차순으로 정렬합니다.

-- 주문액 계산
SELECT customers.salesRepId, SUM(orderdetails.quantity * orderdetails.priceEach) AS 주문액
FROM customers JOIN orders USING (customerId)
	JOIN orderDetails USING (orderNo)
GROUP BY customers.salesRepId;

-- 결제액 
SELECT customers.salesRepId, SUM(payments.amount) AS 결제액
FROM customers JOIN payments USING (customerId)
GROUP BY customers.salesRepId;

WITH orderTotal AS
(
SELECT customers.salesRepId, SUM(orderdetails.quantity * orderdetails.priceEach) AS total
FROM customers JOIN orders USING (customerId)
	JOIN orderDetails USING (orderNo)
GROUP BY customers.salesRepId
),
paymentTotal AS
(
SELECT customers.salesRepId, SUM(payments.amount) AS total
FROM customers JOIN payments USING (customerId)
GROUP BY customers.salesRepId
)
SELECT O_f.city, SUM(O.total) AS 주문액합계, SUM(P.total) AS 결재액합계
FROM orderTotal O JOIN paymentTotal P USING (salesRepId)
	JOIN employees E ON E.employeeId = salesRepId
    JOIN offices O_f USING (officeCode)
GROUP BY O_f.city
ORDER BY 2 DESC;