-- 문제 설명
-- Q3 (20점) :
-- 15개 이상의 상품이 포함된 주문에 대해, 포함된 상품 주문액의 합계를 검색하세요.
-- 단, 주문 상태(status)가 'Cancelled'인 주문은 제외합니다.
-- 상품의 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 출력 컬럼은 orderNo, status, 상품수, 주문액합계 순으로 합니다.
-- 결과는 상품수의 내림차순, 주문액합계의 내림차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT * 
FROM orders;

SELECT * 
FROM orderdetails
ORDER BY quantity;


SELECT O.orderNo, O.status, Od.quantity 상품수, SUM(Od.priceEach * Od.quantity) 주문액합계
FROM orders O JOIN orderdetails Od USING (orderNo)
WHERE Od.quantity >=15 AND O.status NOT LIKE '%Cancelled%'
ORDER BY 3 DESC, 4 DESC;


SELECT O.orderNo, O.status, COUNT(O.orderNo) 상품수,  SUM(Od.priceEach * Od.quantity) 주문액합계
FROM orders O JOIN orderdetails Od USING (orderNo)
WHERE COUNT(O.orderNo) >=15 AND O.status NOT LIKE '%Cancelled%'
GROUP BY O.orderNo
ORDER BY 3 DESC, 4 DESC;


-- 제출
SELECT O.orderNo, O.status, COUNT(O.orderNo) 상품수,  SUM(Od.priceEach * Od.quantity) 주문액합계
FROM orders O JOIN orderdetails Od USING (orderNo)
WHERE O.status NOT LIKE '%Cancelled%'
GROUP BY O.orderNo
HAVING 상품수 >=15
ORDER BY 3 DESC, 4 DESC;




