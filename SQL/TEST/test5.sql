/*Q5 (10점) :
국가(country) 별 고객수의 평균을 구하여, 국가별 고객수와 함께 출력하세요.
출력 컬럼은 country, 고객수, 평균 고객수 순으로 합니다.
결과는 고객수의 내림차순, country의 오름차순으로 정렬합니다.
*/


WITH temp AS (
	SELECT country, count(*) 고객수
	FROM customers
	GROUP BY country 
),
temp1 AS (
	SELECT AVG(고객수) 평균고객수
	FROM temp 
)
SELECT country, 고객수, 평균고객수
FROM temp, temp1
ORDER BY 2 DESC, 1;
