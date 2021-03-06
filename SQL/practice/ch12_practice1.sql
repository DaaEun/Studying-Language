-- 1. 윈도우 함수
-- Q1 (20점) :
-- 상품라인(productLine) 별로, 상품 재고개수(quantityInStock)의 '전체 합계'를 구하여, 상품의 재고개수와 함께 출력하세요.
-- 출력 컬럼은 productLine, name, quantityInStock, 재고개수합계 순으로 합니다.
-- 결과는 같은 상품라인 내에서, quantityInStock의 내림차순으로 정렬합니다.

SELECT	productLine, name, quantityInStock,
		SUM(quantityInStock) OVER
		(
			PARTITION BY productLine
			ORDER BY quantityInStock DESC
			RANGE BETWEEN UNBOUNDED PRECEDING AND UNBOUNDED FOLLOWING
		) AS 재고개수합계
FROM	products;