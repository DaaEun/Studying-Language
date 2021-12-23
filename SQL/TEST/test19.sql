/* Q19 (30점) :
고객의 총주문액과 총결제액, 그리고 결제상태를 검색하세요.
고객의 총주문액은 고객이 주문한 상품 주문액의 합으로 계산하며, 상품 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
고객의 총결제액은 고객 결제액(amount)의 합으로 계산합니다.
결제상태는 총주문액과 총결제액이 같으면 '완료', 총주문액 보다 총결제액이 작으면 '미결'이라는 값을 갖습니다.
출력 컬럼은 고객의 name, 총주문액, 총결제액, 결제상태 순으로 합니다.
결과에는 주문하지 않은 고객도 포함되어야 하며, 이 고객의 총주문액, 총결제액, 결제상태는 모두 NULL 값을 갖습니다.
결과는 name의 오름차순으로 정렬합니다.
*/

WITH orderTotal AS
(
SELECT customers.customerId, SUM(orderdetails.quantity * orderdetails.priceEach) AS total
FROM customers JOIN orders USING (customerId)
	JOIN orderDetails USING (orderNo)
GROUP BY customers.customerId
),
paymentTotal AS
(
SELECT customers.customerId, SUM(payments.amount) AS total
FROM customers JOIN payments USING (customerId)
GROUP BY customers.customerId
)
SELECT C.name, SUM(O.total) AS 총주문액, SUM(P.total) AS 총결재액,
	CASE 
		WHEN SUM(O.total) = SUM(P.total) THEN '완료'
        WHEN SUM(O.total) > SUM(P.total) THEN '미결'
    END 결제상태
FROM customers C LEFT JOIN orderTotal O USING (customerId) 
	LEFT JOIN paymentTotal P USING (customerId)
GROUP BY customerId
ORDER BY 1;