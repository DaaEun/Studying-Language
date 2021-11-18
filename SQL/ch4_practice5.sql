-- Q5 (10점) :
-- 상품의 재고액이 500,000불 이상인 상품을 검색하세요.
-- 상품의 재고액은 구매단가(buyPrice)와 재고개수(quantityInStock)의 곱으로 계산합니다.
-- 출력 컬럼은 상품의 productCode, name, buyPrice, quantityInStock, 재고액 순으로 합니다.
SELECT productCode, name, buyPrice, quantityInStock, buyPrice * quantityInStock AS 재고액
FROM s_products
WHERE buyPrice * quantityInStock >= 500000;