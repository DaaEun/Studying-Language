-- Q3 (20점) :
-- 주문년도 별로, 주문에 포함된 상품의 주문개수(quantity)의 합계가 많은 순서대로 주문의 순위를 구하세요.
-- 단, 동점자에게 같은 순위를 주며, 이 경우 다음 순위와 동점자 수 만큼 차이가 나야 합니다.
-- 출력 컬럼은 orderNo, orderDate, 주문개수합계, 순위 순으로 합니다.
-- 결과는 같은 주문년도 내에서, 주문개수합의 내림차순으로 정렬합니다.

SELECT	orderNo, orderDate, SUM(quantity) AS 주문개수합계,
		RANK() OVER
		(
			PARTITION BY YEAR(orderDate)
			ORDER BY SUM(quantity) DESC
		) AS 순위
FROM	s_orders JOIN s_orderDetails USING (orderNo)
GROUP 	BY orderNo;