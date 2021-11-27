-- Q2 (10점) :
-- scale이 가장 큰 상품을 검색 검색하세요.
-- 출력 컬럼은 productCode, name, scale 순으로 합니다.
-- 결과는 scale의 내림차순, name의 오름차순으로 정렬합니다.

SELECT *
FROM products;

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


-- 강의에서~~

SELECT productCode, name, scale
FROM products
ORDER BY CAST(SUBSTRING(scale, LOCATE(':', scale) + 1) AS UNSIGNED) DESC, name; 

-- 데이터타입이 STRING(VARCHAR)이므로 CAST 활용한다.
-- SUBSTRING() 함수에서 length가 생략되면, position부터 문자열 끝까지 리턴한다.