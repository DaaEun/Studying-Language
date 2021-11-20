-- Q7 (10점) :
-- 'Paris', 'London', 'Berlin'에 있는 고객을 검색하세요.
-- 출력 컬럼은 고객의 name, city 순으로 합니다.
SELECT name, city
FROM s_customers
WHERE city IN ('Paris', 'London', 'Berlin');

/*
WHERE REGEXP_LIKE(city, 'Paris|London|Berlin');
-- 정규표현식의 패턴매치, 내장함수
-- city라는 컬럼안에 Paris오거나 London오거나 Berlin오는지 확인
*/