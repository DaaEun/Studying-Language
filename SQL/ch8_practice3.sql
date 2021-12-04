-- Q3 (20점) :
-- 각 직원에 대해, 본인이 관리하는 고객의 2004년 주문액 합계를 검색하세요.
-- 단, 관리하는 고객사가 없는 직원도 결과에 포함합니다.
-- 고객사의 2004년 주문액은 orderDate 기준입니다.
-- 상품의 주문액은 주문단가(priceEach)와 주문개수(quantity)의 곱으로 계산합니다.
-- 출력 컬럼은 직원의 근무지점(s_offices.city), 성명, 주문액합계 순으로 합니다.
-- 성명은 firstName과 lastName으로 구성되며, 사이에 공백 문자(space)가 하나 들어갑니다.
-- 결과는 주문액합계의 내림차순으로 정렬합니다.
-- SQL문을 실행하면 그림과 같이 결과가 나와야 합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT Ofi.city 근무지점, CONCAT(E.firstName, ' ', E.lastName) 성명, SUM(Od.priceEach * Od.quantity) 주문액합계
FROM employees E  LEFT JOIN customers C ON E.employeeId = C.salesRepId
	JOIN offices Ofi USING (officeCode)
	JOIN orders O USING (customerId)
    JOIN orderdetails Od USING (orderNo)
WHERE YEAR(O.orderDate) = 2004
GROUP BY E.employeeId
ORDER BY 3 DESC;  
    
-- 제출, 정답 아님.    
WITH orders_temp AS 
(
	SELECT * 
	FROM orders
	WHERE YEAR(orderDate) = 2004
) 
SELECT Ofi.city 근무지점, CONCAT(E.firstName, ' ', E.lastName) 성명, SUM(Od.priceEach * Od.quantity) 주문액합계
FROM employees E LEFT JOIN customers C ON E.employeeId = C.salesRepId
	JOIN offices Ofi USING (officeCode)
	JOIN orders_temp O USING (customerId)
    JOIN orderdetails Od USING (orderNo)
GROUP BY E.employeeId
ORDER BY 3 DESC; 






