-- 1. 단일행 내장함수
-- Q1 (10점) :
-- description이 300자 이상인 상품의 name과 description을 검색하세요.
-- 단, name은 모두 대문자로 출력하세요.
-- 출력 컬럼은 name, description 순으로 합니다.
-- 이때 결과는 name의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM products;

SELECT UPPER(name) name, description
FROM products
WHERE LENGTH(description) >= 300
ORDER BY name;
