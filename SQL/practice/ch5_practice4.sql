-- Q4 (20점) :
-- 주문에 포함된 상품수의 평균, 그리고 주문에 포함된 모든 상품 주문액 합계의 평균을 계산하세요.
-- 출력 컬럼은 주문수, 상품수의 평균, 주문액 합계의 평균 순으로 합니다.
-- 단, 주문에 포함된 각 상품의 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 또한, 상품수의 평균과 주문액 합계의 평균은 모두 소수 세째자리에서 반올림하여 소수 둘째자리까지 구합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM orderdetails;

SELECT *
FROM products;

SELECT COUNT(*) 주문수, productLine
FROM products
GROUP BY productLine;

SELECT COUNT(*) 주문수, ROUND(AVG(quantity), 2) '상품수의 평균', ROUND(AVG(priceEach * quantity),2) '주문액 합계의 평균'
FROM orderdetails
GROUP BY orderNo;

WITH temp AS (
	SELECT COUNT(*) 주문수, productCode
	FROM products
	GROUP BY productLine
)
SELECT SUM(주문수) 주문수, ROUND(AVG(quantity), 2) '상품수의 평균', ROUND(AVG(priceEach * quantity),2) '주문액 합계의 평균'
FROM orderdetails , temp
where temp.productCode = orderdetails.productCode
GROUP BY orderNo;


SELECT COUNT(*) 주문수, ROUND(AVG(quantity), 2) '상품수의 평균', ROUND((SUM(priceEach * quantity)/AVG(quantity)),2) '주문액 합계의 평균'
FROM orderdetails
GROUP BY orderNo;

-- 주문수, 상품수, 주문액 합계의 평균의 의미 모호
