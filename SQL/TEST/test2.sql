/*Q2 (10점) :
국가(country) 별로 고객수를 검색하세요.
출력 컬럼은 country, 고객수 순으로 합니다.
결과는 고객수의 내림차순, country의 오름차순으로 정렬합니다.
*/

SELECT country, count(*) 고객수
FROM customers
GROUP BY country
ORDER BY 2 DESC, 1;