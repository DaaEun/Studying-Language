-- 4. ORDER BY 절
-- Q6 (10점) :
-- 완료예정일(requiredDate)을 포함하여 그 이후에 배송(shippedDate)된 주문을 검색하세요.
-- 출력 컬럼은 orderNo, orderDate, shippedDate, requiredDate 순으로 합니다.
-- 이때 결과는 orderDate의 오름차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM orders;

SELECT orderNo, orderDate, shippedDate, requiredDate
FROM orders
WHERE requiredDate <= shippedDate -- 동일한 Date 포함하기
ORDER BY orderDate;