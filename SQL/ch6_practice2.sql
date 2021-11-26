-- Q2 (10점) :
-- scale이 가장 큰 상품을 검색 검색하세요.
-- 출력 컬럼은 productCode, name, scale 순으로 합니다.
-- 결과는 scale의 내림차순, name의 오름차순으로 정렬합니다.

SELECT *
FROM products;

SELECT CAST(NOW() AS DATE);

SELECT productCode, name, scale, CAST(SUBSTRING(scale, 3, 5) AS SIGNED)
FROM products
WHERE MAX(CAST(SUBSTRING(scale, 3, 5) AS SIGNED)) = CAST(SUBSTRING(scale, 3, 5) AS SIGNED)
ORDER BY scale DESC, name; -- MAX 함수에서 에러 발생


WITH temp AS (
	SELECT productCode, name, scale, CAST(SUBSTRING(scale, 3, 5) AS SIGNED), 
		RANK() OVER (ORDER BY CAST(SUBSTRING(scale, 3, 5) AS SIGNED)) AS scaleRank
    FROM products
)
SELECT productCode, name, scale
FROM temp
WHERE scaleRank = 1
ORDER BY scale DESC, name;
-- scale 정확히 어떤 수치를 의미하는지 모르겠다.
-- 틀림




