-- Q9 (20점) :
-- 권장소비자가(MSRP)가 가장 큰 25위까지의 상품을 검색하세요.
-- 단, MSRP는 소수점 이하를 버리고 비교 및 출력하세요.
-- 출력 컬럼은 행번호, productCode, name, MSRP, 순위 순으로 합니다.
-- 이 때 결과는 MSRP의 내림차순, name의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

WITH temp AS
(
	SELECT productCode, name, TRUNCATE(MSRP, 0) MSRP, RANK() OVER (ORDER BY TRUNCATE(MSRP, 0) DESC) AS msrpRank
	FROM products
    ORDER BY MSRP DESC, name
)
SELECT ROW_NUMBER() OVER (ORDER BY MSRP DESC) AS rowNo, productCode, name, MSRP, msrpRank 순위
FROM temp
WHERE msrpRank <= 25;


-- 강의에서~~
SELECT ROW_NUMBER() OVER (ORDER BY TRUNCATE(MSRP, 0) DESC, name) AS rowNo, 
	productCode, name, MSRP, RANK() OVER (ORDER BY TRUNCATE(MSRP, 0) DESC) AS msrpRank
FROM products
LIMIT 25; -- 최종 답