-- Q6 (20점) :
-- 고객의 담당직원 성명과 2004년도 결재액을 검색하세요.
-- 단, 담당직원이 없는 고객도 결과에 포함합니다.
-- 또, 결재액이 없는 고객도 결과에 포함하며, 이 경우 결재액은 0.00으로 출력합니다.
-- 출력 컬럼은 고객명(name), 담당직원의 성명, 결재액 순으로 합니다.
-- 담당직원의 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 결과는 고객명의 오름차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.


-- 제출.정답아님
WITH p_temp AS 
(
	SELECT * 
	FROM payments
	WHERE YEAR(paymentDate) = 2004
) 
SELECT C.name 고객명, CONCAT(E.firstName, ' ', E.lastName) 담당직원명, ROUND(SUM(P.amount),2) 결제액
FROM employees E LEFT JOIN customers C ON E.employeeId = C.salesRepId
	LEFT JOIN p_temp P USING (customerId)
GROUP BY C.name
ORDER BY 1; 


-- 정답.
WITH paymentsTemp AS
(
		SELECT	*
        FROM	s_payments
        WHERE	YEAR(paymentDate) = 2004
)
SELECT	name 고객명, CONCAT(firstName, ' ', lastName) 판매담당직원성명, COALESCE(SUM(amount),0) 결재액
FROM	s_employees RIGHT JOIN s_customers ON employeeId = salesRepId
		LEFT JOIN paymentsTemp USING (customerId)
GROUP 	BY customerId
ORDER 	BY name;
