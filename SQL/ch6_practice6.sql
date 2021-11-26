-- Q6 (10점) :
-- 'Germany'에 있는 고객을 검색하세요.
-- 출력 컬럼은 name, country, 담당직원(salesRepId) 순으로 합니다.
-- 단, 담당직원이 없는 고객의 경우, 직원아이디 1165인 직원을 판매담당 직원으로 출력하세요.
-- 출력 컬럼은 name, country, salesRepId 순으로 합니다.
-- 이때 결과는 name의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM customers;

SELECT name, country, 
	CASE 
		WHEN salesRepId IS NULL THEN 1165
        ELSE salesRepId
    END AS 담당직원
FROM customers
WHERE country = 'Germany'
ORDER BY name;