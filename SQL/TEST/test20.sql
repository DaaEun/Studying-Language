/*Q20 (30점) :
주문하지 않은 담당 고객이 있는 직원을 검색하세요.
출력 컬럼은 직원의 성명, 담당고객수, 주문하지 않은 담당고객수 순으로 합니다.
성명은 firstName과 lastName으로 구성되며, 사이에 공백 문자(space)가 하나 들어갑니다.
결과는 성명의 오름차순으로 정렬합니다.
*/

WITH temp AS (
	SELECT employeeId, COUNT(*) 주문X
	FROM employees
	WHERE employeeId = ANY (
								SELECT salesRepId
								FROM customers C
								WHERE NOT EXISTS (
													SELECT *
													FROM orders O
													WHERE C.customerId = O.customerId
												 )
						   )
	GROUP BY employeeId
)
SELECT CONCAT(firstName, ' ', lastName) 성명, COUNT(*) 담당고객수, 주문X '주문하지 않은 담당고객수'
FROM employees E JOIN customers C ON E.employeeId = C.salesRepId
	JOIN temp T USING (employeeId)
GROUP BY employeeId    
ORDER BY 1;
