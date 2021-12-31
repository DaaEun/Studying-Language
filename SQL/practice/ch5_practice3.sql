-- Q3 (10점) :
-- 15개 이상의 상품이 포함된 주문에 대해, 포함된 상품 주문액의 합계를 검색하세요.
-- 상품 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 출력 컬럼은 orderNo, 상품수, 주문액합계 순으로 합니다.
-- 결과는 삼품수의 내림차순, 주문액합계의 내림차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

-- SELECT *
-- FROM orderdetails;

-- SELECT orderNo, COUNT(orderNo) 상품수, SUM(priceEach*quantity) 주문액합계
-- FROM orderdetails
-- GROUP BY orderNo;

WITH temp AS (
	SELECT orderNo, COUNT(orderNo) 상품수, SUM(priceEach*quantity) 주문액합계
	FROM orderdetails
	GROUP BY orderNo
)
SELECT *
FROM temp
WHERE 상품수 >= 15
ORDER BY 상품수 DESC, 주문액합계 DESC;


SELECT orderNo, COUNT(productCode) 상품수, SUM(priceEach*quantity) 주문액합계
FROM orderdetails
GROUP BY orderNo
HAVING COUNT(productCode) >=15
ORDER BY 2 DESC, 3 DESC;


SELECT orderNo, COUNT(orderNo) 상품수, SUM(priceEach*quantity) 주문액합계
FROM orderdetails
GROUP BY orderNo
HAVING COUNT(orderNo) >=15
ORDER BY 상품수 DESC, 주문액합계 DESC;











