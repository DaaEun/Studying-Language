-- Q3 (10점) :
-- orderNo 10127에 포함된 상품 중, 주문액이 5,000불 이상인 상품을 검색하세요.
-- 상품의 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산하며, 계산 결과에서 소수점 이하 숫자는 버립니다.
-- 출력 컬럼은 orderNo, productCode, priceEach, quantity, 주문액 순으로 합니다.
-- 이때 결과는 주문액의 내림차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM orderdetails;

SELECT orderNo, productCode, priceEach, quantity, TRUNCATE(priceEach * quantity, 0) 주문액
FROM orderdetails
WHERE orderNo = 10127 AND TRUNCATE(priceEach * quantity, 0) >= 5000
ORDER BY 주문액 DESC;