/* Q15 (20점) :
국가별 고객수의 평균 보다 고객수가 많은 국가를 검색하세요.
출력 컬럼은 국가, 고객수 순으로 합니다.
결과는 고객수의 내림차순으로 정렬합니다.
*/


WITH temp AS (
	SELECT country 국가, count(*) 고객수
	FROM customers
	GROUP BY country 
)
SELECT 국가, 고객수 
FROM temp
WHERE 고객수 > (
				SELECT AVG(고객수) 평균고객수
				FROM temp
			  )
ORDER BY 2 DESC;