/*Q6 (10점) :
상품의 재고개수(quantityInStock)를 이용하여, 재고 상태를 검색하세요.
quantityInStock의 개수에 따라, 재고 상태를 다음과 같이 출력합니다.
- quantityInStock >= 6000 : '충분'
- 4000 <= quantityInStock < 6000 : '주의'
- quantityInStock < 4000 : '부족'
출력 컬럼은 상품의 name, quantityInStock, 재고상태 순으로 합니다.
결과는 재고상태의 내림차순, name의 오름차순으로 정렬합니다.
*/

SELECT name, quantityInStock, 
	CASE
		WHEN quantityInStock >= 6000 THEN '충분'
		WHEN 4000 <= quantityInStock AND quantityInStock < 6000 THEN '주의'
		WHEN quantityInStock < 4000 THEN '부족'
	END 재고상태
FROM products
ORDER BY 3 DESC, 1;