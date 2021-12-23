/*Q14 (20점) :
고객사가 위치한 국가(country) 별로 주문횟수를 구하고, 그 국가의 주문횟수에 따른 순위를 검색하세요.
단, 동점자에게 같은 순위를 주며, 이 경우 다음 순위와 동점자 수 만큼의 갭(gap)이 있어야 합니다.
주문을 하지않은 국가도 출력에 포함하며, 이때 주문횟수는 0으로 출력합니다.
출력 컬럼은 국가, 주문횟수, 순위 순으로 합니다.
결과는 순위의 오름차순, 국가의 오름차순으로 정렬합니다.
*/


WITH temp AS (
	SELECT C.country 국가, COALESCE(COUNT(O.orderNo), 0) 주문횟수
	FROM customers C LEFT JOIN orders O USING (customerId)
	GROUP BY C.country
)
SELECT 국가, 주문횟수, RANK() OVER (ORDER BY 주문횟수 DESC) 순위
FROM temp
ORDER BY 3, 1;