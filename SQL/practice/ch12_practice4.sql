-- Q4 (30점) :
-- 직원 별로, 본인의 매출액(본인이 관리하는 모든 고객의 결제액(s_payments.amount) 합계)에서
-- +- 100,000 범위의 매출을 하는 직원수(본인 포함)를 검색하세요
-- 단, 매출액이 없는 직원도 출력에 포함하며, 이 경우 매출액은 0.00으로 나타냅니다.
-- 출력 컬럼은 직원의 성명, 직책(jobTitle), 매출액, 범위, '범위내 직원수' 순으로 합니다.
-- 성명은 firstName과 lastName으로 구성하며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 범위는 본인의 매출액에서 100,000을 뺀 금액, 매출액에서 100,000을 더한 금액, 그리고 그 사이에 '~'가 들어간 문자열입니다.
-- 결과는 매출액의 내림차순으로 정렬합니다.

SELECT	CONCAT(firstName, ' ', lastName) AS 성명, jobTitle AS 직책, 
		COALESCE(SUM(amount),0) AS 매출액,
		CONCAT(COALESCE(SUM(amount),0) - 100000, '~', COALESCE(SUM(amount),0) + 100000) AS 범위,
		COUNT(*) OVER 
        (
			ORDER BY SUM(amount) DESC
			RANGE BETWEEN 100000 PRECEDING AND 100000 FOLLOWING
		) AS '범위내 직원수'
FROM 	s_employees LEFT JOIN s_customers ON employeeId = salesRepId
		LEFT JOIN s_payments p USING (customerId)
GROUP	BY 성명;