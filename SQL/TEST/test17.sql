/* Q17 (20점) :
고객의 2003년부터 2005년까지의 년도별 결제액을 검색하세요.
고객의 년도별 결제액은 해당 년도의 고객 결제액(amount)의 합으로 계산합니다.
단, 결제액이 없는 연도에는 0.00을 출력합니다.
결제액이 없는 고객도 출력에 포함합니다.
출력 컬럼은 고객의 name, 2003 결제액, 2004 결제액, 2005 결제액 순으로 합니다.
결과는 고객 name의 오름차순으로 정렬합니다.
*/

SELECT C.name,
	COALESCE(CASE YEAR(P.paymentDate) WHEN 2003 THEN SUM(P.amount) END, 0.00) '2003',
    COALESCE(CASE YEAR(P.paymentDate) WHEN 2004 THEN SUM(P.amount) END, 0.00) '2004',
    COALESCE(CASE YEAR(P.paymentDate) WHEN 2005 THEN SUM(P.amount) END, 0.00) '2005'
FROM customers C LEFT JOIN payments P USING (customerId)
GROUP BY P.paymentDate, C.customerId
ORDER BY 1;

-- 
WITH temp AS (
	SELECT C.name,
		COALESCE(CASE YEAR(P.paymentDate) WHEN 2003 THEN SUM(P.amount) END, 0.00) 2003결제액,
		COALESCE(CASE YEAR(P.paymentDate) WHEN 2004 THEN SUM(P.amount) END, 0.00) 2004결제액,
		COALESCE(CASE YEAR(P.paymentDate) WHEN 2005 THEN SUM(P.amount) END, 0.00) 2005결제액
	FROM customers C LEFT JOIN payments P USING (customerId)
	GROUP BY P.paymentDate, C.customerId
)
SELECT name, SUM(2003결제액), SUM(2004결제액), SUM(2005결제액)
FROM temp
GROUP BY name
ORDER BY 1;
