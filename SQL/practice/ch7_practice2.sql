-- 2. 조인 연산자
-- 2.1 WHERE 절 조인 (inner join 기능만 지원함)
-- Q2 (10점) :
-- 할인을 해주지 않고, 권장소비자가(MSRP)를 그대로 주문단가(priceEach)로 주문한 상품을 검색하세요.
-- 출력 컬럼은 상품의 productCode, name, 주문회수, priceEach, MSRP 순으로 합니다.
-- 결과는 주문회수의 내림차순, MSRP의 내림차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM products;

SELECT *
FROM orderdetails;

SELECT P.productCode, P.name, quantity 주문회수, O.priceEach, P.MSRP
FROM products P JOIN orderdetails O USING (productCode)
WHERE P.MSRP = O.priceEach
ORDER BY 3 DESC, 5 DESC;


-- 제출한 정답
SELECT P.productCode, P.name, COUNT(productCode) 주문회수, O.priceEach, P.MSRP
FROM products P JOIN orderdetails O USING (productCode)
WHERE P.MSRP = O.priceEach
GROUP BY productCode
ORDER BY 3 DESC, 4 DESC;