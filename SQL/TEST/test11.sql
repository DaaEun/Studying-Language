/*Q11 (10점) :
주문을 하지 않은 고객을 검색하세요.
출력 컬럼은 고객의 name, city, country 순으로 합니다.
결과는 name의 오름차순으로 정렬합니다.
*/

SELECT name, city, country
FROM customers LEFT JOIN orders USING (customerId)
WHERE orderNo IS NULL
ORDER BY 1;