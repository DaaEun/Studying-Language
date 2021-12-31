-- 1. 집합 연산자
-- Q1 (10점) :
-- 상품라인(productLine)이 'Vintage Cars'이거나 'Motorcycles'인 상품을 검색하세요.
-- 출력 컬럼은 상품의 name, scale, productLine 순으로 합니다.
-- 이때 결과는 productLine의 오름차순, name의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT name, scale, productLine
FROM products
WHERE productLine IN ('Vintage Cars', 'Motorcycles')
ORDER BY productLine, name;