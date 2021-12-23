/*Q10 (10점) :
고객의 총결제액을 검색하세요.
고객의 총결제액은 고객 결제액(amount)의 합으로 계산합니다.
단, 결제액이 없는 고객도 출력에 포함하며, 이때 결제액은 0.00으로 출력합니다.
출력 컬럼은 고객의 name, 총결제액 순으로 합니다.
결과는 총결제액의 내림차순, name의 오름차순으로 정렬합니다.
*/

SELECT C.name, COALESCE(SUM(P.amount), 0.00) 총결제액
FROM payments P RIGHT JOIN customers C USING (customerId) 
GROUP BY C.name
ORDER BY 2 DESC, 1;