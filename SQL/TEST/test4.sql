/*Q4 (10점) :
국가(country) 별 고객수의 평균을 검색하세요.
출력 컬럼은 평균 고객수 하나 입니다.
*/

WITH temp AS (
	SELECT country, count(*) 고객수
	FROM customers
	GROUP BY country 
)
SELECT AVG(고객수) 평균고객수
FROM temp;