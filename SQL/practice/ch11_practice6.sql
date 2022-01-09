-- Q6 (30점) :
-- 고객의 국가 별로 주문날짜 기준으로 2004년의 월별 주문액 합계, 그리고 2004년의 주문액 합계를 검색하세요.
-- 출력 컬럼은 국가, 1월부터 12월까지의 월별 주문액 합계, 2004년 주문액 합계 순으로 합니다.
-- 상품의 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 합계를 계산할 때(월별 주문액 합계와 2004년 주문액 합계), 소수점 이하를 버리고 정수 부분만 취합니다.
-- 주문액 합계가 없으면 0을 출력합니다.
-- 결과는 국가의 오름차순으로 정렬합니다.

SELECT	country 국가,
		COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 1 THEN priceEach * quantity END)),0) AS 1월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 2 THEN priceEach * quantity END)),0) AS 2월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 3 THEN priceEach * quantity END)),0) AS 3월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 4 THEN priceEach * quantity END)),0) AS 4월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 5 THEN priceEach * quantity END)),0) AS 5월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 6 THEN priceEach * quantity END)),0) AS 6월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 7 THEN priceEach * quantity END)),0) AS 7월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 8 THEN priceEach * quantity END)),0) AS 8월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 9 THEN priceEach * quantity END)),0) AS 9월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 10 THEN priceEach * quantity END)),0) AS 10월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 11 THEN priceEach * quantity END)),0) AS 11월,
        COALESCE(FLOOR(SUM(CASE MONTH(orderDate) WHEN 12 THEN priceEach * quantity END)),0) AS 12월,
        COALESCE(FLOOR(SUM(priceEach * quantity)),0) 주문액합계
FROM	s_customers JOIN s_orders USING (customerId)
		JOIN s_orderDetails USING (orderNo)
WHERE	YEAR(orderDate) = 2004
GROUP 	BY country
ORDER 	BY country;