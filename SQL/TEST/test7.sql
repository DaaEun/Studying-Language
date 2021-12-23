/*Q7 (10점) :
상품의 평균, 최고, 최저 주문단가(priceEach)를 검색하세요.
출력 컬럼은 상품의 productCode, 평균 주문단가, 최고 주문단가, 최저 주문단가 순으로 합니다.
평균 주문단가는 반올림하여 소수 둘째자리까지 출력하세요.
결과는 평균 주문단가의 내림차순, 최고 주문단가의 내림차순, 최저 주문단가의 내림차순으로 정렬합니다.
*/

SELECT productCode, ROUND(AVG(priceEach),2) 평균, MAX(priceEach) 최고, MIN(priceEach) 최저
FROM orderdetails
GROUP BY productCode
ORDER BY 2 DESC, 3 DESC, 4 DESC;