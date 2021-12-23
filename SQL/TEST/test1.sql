/*
Q1 (10점) :
고객이 있는 국가(country)를 검색하세요.
단, 국가는 한 번씩만 나와야 합니다.
출력 컬럼은 country 하나 입니다.
결과는 country의 오름차순으로 정렬합니다.
*/

SELECT DISTINCT country
FROM customers
ORDER BY 1;