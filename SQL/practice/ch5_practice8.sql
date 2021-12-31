-- 5. LIMIT 절
-- Q8 (10점) :
-- 권장소비자가(MSRP)가 가장 큰 25개 상품을 검색하세요.
-- 단, MSRP는 소수점 이하를 버리고 비교 및 출력하세요.
-- 출력 컬럼은 행번호, productCode, name, MSRP 순으로 합니다.
-- 이 때 결과는 MSRP의 내림차순, name의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT productCode, name, MSRP
FROM products;

SELECT ROW_NUMBER() OVER (ORDER BY MSRP DESC) AS rowNo, productCode, name, ROUND(MSRP, 0) AS RSMP
FROM products
ORDER BY MSRP DESC, name
LIMIT 25; -- 나열 제대로 못함, 그래서 결과와 다른 값 도출


WITH temp AS
(
	SELECT ROW_NUMBER() OVER (ORDER BY MSRP DESC) AS rowNo, productCode, name, 
		ROUND(MSRP, 0) MSRP, RANK() OVER (ORDER BY MSRP DESC) AS msrpRank
	FROM s_products
)
SELECT rowNo, productCode, name, MSRP
FROM temp
ORDER BY MSRP DESC, name
LIMIT 25; -- 정답 아님


WITH temp AS
(
	SELECT ROW_NUMBER() OVER (ORDER BY ROUND(MSRP, 0) DESC) AS rowNo, productCode, name, ROUND(MSRP, 0) MSRP, 
		RANK() OVER (ORDER BY ROUND(MSRP, 0) DESC) AS msrpRank
	FROM products
)
SELECT rowNo, productCode, name, MSRP
FROM temp
ORDER BY MSRP DESC, name
LIMIT 25;


-- 반올림을.. 버림으로.. 멍청이
WITH temp AS
(
	SELECT productCode, name, TRUNCATE(MSRP, 0) MSRP
	FROM products
    ORDER BY MSRP DESC, name
    LIMIT 25
)
SELECT ROW_NUMBER() OVER (ORDER BY MSRP DESC) AS rowNo, productCode, name, MSRP
FROM temp; -- 이거 정답



-- 강의에서~~
SELECT ROW_NUMBER() OVER (ORDER BY TRUNCATE(MSRP, 0) DESC, name) AS rowNo, 
productCode, name, TRUNCATE(MSRP, 0) MSRP
FROM products
LIMIT 25; -- 최종 답