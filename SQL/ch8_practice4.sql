-- Q4 (30점) :
-- orderDate 기준으로 2004년에, 주문회수가 많은 상위 50위까지의 상품을 검색하세요.
-- 상품의 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 출력 컬럼은 productCode, name, 주문회수, 순위 순으로 합니다.
-- 결과는 순위의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT P.productCode, P.name, COUNT(O.orderNo) 주문회수, RANK() OVER (ORDER BY COUNT(O.orderNo) DESC) 순위
FROM products P JOIN orderdetails Od USING (productCode)
	JOIN orders O USING (orderNo)
WHERE YEAR(O.orderDate) = 2004 
GROUP BY P.productCode
ORDER BY 4; 


-- 제출. 정답
WITH temp AS
(
	SELECT P.productCode, P.name, COUNT(O.orderNo) 주문회수, RANK() OVER (ORDER BY COUNT(O.orderNo) DESC) 순위
	FROM products P JOIN orderdetails Od USING (productCode)
	JOIN orders O USING (orderNo)
	WHERE YEAR(O.orderDate) = 2004 
	GROUP BY P.productCode
	ORDER BY 4
)
SELECT *
FROM temp
WHERE 순위 <= 50; 