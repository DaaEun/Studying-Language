/*Q9 (10점) :
완료 예정일(requiredDate) 7일 전에 배송(shippedDate)이 이루어진 주문을 검색하세요. (즉, 7일을 제외하고 8, 9일 둥을 포함)
출력 컬럼은 주문의 orderNo, orderDate, requiredDate, shippedDate 순으로 합니다.
결과는 주문번호의 오름차순으로 정렬합니다.
*/


SELECT orderNo, orderDate, requiredDate, shippedDate
FROM orders
WHERE requiredDate > shippedDate + INTERVAL 7 DAY
GROUP BY 1; 