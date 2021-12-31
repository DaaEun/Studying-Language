-- 문제 설명
-- Q5 (20점) :
-- 한 종류의 상품라인(productLine)에 속하는 상품으로만 이루어진 주문을 검색하세요.
-- 이 때, 하나의 상품만 포함된 주문은 제외하세요.
-- 출력 컬럼은 orderNo, 상품수, productLine 순으로 합니다.
-- 결과는 상품수의 내림차순, orderNo의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT productCode, productLine
FROM products
ORDER BY productCode;

SELECT orderNo, productCode, productline
FROM orderdetails JOIN products USING (productCode)
ORDER BY 1;


-- 제출
SELECT O.orderNo, COUNT(O.orderNo) 상품수, P.productLine
FROM products P JOIN orderdetails O USING (productCode)
GROUP BY O.orderNo
HAVING COUNT(DISTINCT P.productLine) = 1 AND 상품수 > 1
ORDER BY 2 DESC, 1;
