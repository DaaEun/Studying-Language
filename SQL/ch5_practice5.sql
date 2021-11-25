-- Q5 (20점) :
-- 한 종류의 상품라인(productLine)에 속하는 상품으로만 이루어진 주문을 검색하세요.
-- 이 때, 하나의 상품만 포함된 주문은 제외하세요.
-- 출력 컬럼은 orderNo, 상품수, productLine 순으로 합니다.
-- 결과는 상품수의 내림차순, orderNo의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM products;

SELECT *
FROM orderdetails;

-- 필요한 속성만 찾기
SELECT productCode, productLine
FROM products;

SELECT orderNo, productCode
FROM orderdetails
ORDER BY orderNo;

SELECT o.orderNo, o.productCode, p.productLine
FROM orderdetails AS o, products AS p
WHERE o.productCode = p.productCode 
ORDER BY orderNo;

-- 조건 추가
SELECT o.orderNo, o.productCode, p.productLine, COUNT(DISTINCT p.productLine) AS CNT_L_P
FROM orderdetails AS o, products AS p
WHERE o.productCode = p.productCode
GROUP BY orderNo
ORDER BY orderNo;

SELECT o.orderNo, o.productCode, p.productLine
FROM orderdetails AS o, products AS p
WHERE o.productCode = p.productCode AND COUNT(p.productLine) = 1 AND COUNT(*) > 1 
GROUP BY orderNo
ORDER BY orderNo;

WITH temp AS(
	SELECT COUNT(*) 상품수, productLine, productCode
    FROM products
    GROUP BY productLine
)
SELECT orderNo, 상품수, productLine
FROM orderdetails, temp
WHERE orderdetails.productCode = temp.productCode
ORDER BY 상품수 DESC, orderNo; -- 에러



-- 제출한 정답
WITH temp AS(
	SELECT o.orderNo, COUNT(o.orderNo) 상품수, o.productCode, p.productLine, COUNT(DISTINCT p.productLine) AS CNT_L_P
	FROM orderdetails AS o, products AS p
	WHERE o.productCode = p.productCode
	GROUP BY orderNo
)
SELECT orderNo, 상품수, productLine
FROM temp
WHERE CNT_L_P = 1 AND 상품수 > 1
ORDER BY 상품수 DESC, orderNo;



WITH temp AS(
	SELECT o.orderNo, COUNT(o.orderNo) 상품수, o.productCode, p.productLine, COUNT(DISTINCT p.productLine) AS CNT_L_P
	FROM orderdetails AS o, products AS p
	WHERE o.productCode = p.productCode
	GROUP BY orderNo
)
SELECT orderNo, 상품수, productLine
FROM temp
WHERE CNT_L_P = 1 AND 상품수 > 1
ORDER BY 상품수 DESC, orderNo;


-- 최종 제출한 정답
SELECT o.orderNo, COUNT(o.orderNo) 상품수, p.productLine
FROM orderdetails AS o, products AS p
WHERE o.productCode = p.productCode
GROUP BY orderNo 
HAVING COUNT(DISTINCT p.productLine) = 1 AND COUNT(o.orderNo) > 1
ORDER BY 상품수 DESC, orderNo;




