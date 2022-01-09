-- Q5 (10점) :
-- 지점(s_offices.city) 별로 2004년의 월별 결제횟수, 그리고 총결제횟수를 검색하세요.
-- 출력 컬럼은 지점, 1월부터 12월까지의 월별 결제횟수, 총결제횟수 순으로 합니다.
-- 결제횟수가 없으면 0을 출력합니다.
-- 결과는 지점의 오름차순으로 정렬합니다.
-- 마지막 행으로, 1월부터 12월, 그리고 총결제횟수 컬럼 각각의 합계를 출력합니다.
-- 이때 지점에는 '합계'라고 출력하세요

SELECT O.city AS 지점, 
COALESCE(SUM(CASE MONTH(paymentDate) WHEN 1 THEN 1 END),0) 1월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 2 THEN 1 END),0) 2월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 3 THEN 1 END),0) 3월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 4 THEN 1 END),0) 4월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 5 THEN 1 END),0) 5월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 6 THEN 1 END),0) 6월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 7 THEN 1 END),0) 7월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 8 THEN 1 END),0) 8월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 9 THEN 1 END),0) 9월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 10 THEN 1 END),0) 10월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 11 THEN 1 END),0) 11월,
COALESCE(SUM(CASE MONTH(P.paymentDate) WHEN 12 THEN 1 END),0) 12월,
COALESCE(COUNT(*),0) 총결제횟수
FROM customers C LEFT JOIN payments P USING (customerId)
	JOIN employees E ON C.salesRepId = E.employeeId
	JOIN offices O USING (officeCode)
WHERE YEAR(paymentDate) = 2004
GROUP BY O.city
ORDER BY 1;
-- 오잉?? 합계요?? / 설마 다음챕터 내용을 알아야 푸나요ㅠㅠ



-- 정답. 제출

With temp AS
(
	SELECT	O.city 지점,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 1 THEN 1 END),0) AS 1월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 2 THEN 1 END),0) AS 2월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 3 THEN 1 END),0) AS 3월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 4 THEN 1 END),0) AS 4월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 5 THEN 1 END),0) AS 5월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 6 THEN 1 END),0) AS 6월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 7 THEN 1 END),0) AS 7월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 8 THEN 1 END),0) AS 8월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 9 THEN 1 END),0) AS 9월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 10 THEN 1 END),0) AS 10월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 11 THEN 1 END),0) AS 11월,
			COALESCE(SUM(CASE MONTH(paymentDate) WHEN 12 THEN 1 END),0) AS 12월,
			COALESCE(COUNT(*),0) 총결재횟수
	FROM	s_offices O JOIN s_employees USING (officeCode)
			JOIN s_customers ON employeeId = salesRepId
			JOIN s_payments USING (customerId)
	WHERE	YEAR(paymentDate) = 2004
	GROUP 	BY O.city
	ORDER 	BY O.city
)
SELECT	*
FROM	temp
UNION ALL
SELECT	'합계', SUM(1월), SUM(2월), SUM(3월), SUM(4월), SUM(5월), SUM(6월),
		SUM(7월), SUM(8월), SUM(9월), SUM(10월), SUM(11월), SUM(12월), SUM(총결재횟수)
FROM	temp;