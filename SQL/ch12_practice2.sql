-- Q2 (20점) :
-- 고객이 위치한 국가(country) 별로 고객수를 구하고, 그 국가의 고객수에 따른 순위를 검색하세요.
-- 단, 동점자에게 같은 순위를 주며, 이 경우 다음 순위와 동점자 수 만큼 차이가 나야 합니다.
-- 출력 컬럼은 국가, 고객수, 순위 순으로 합니다.
-- 결과는 순위의 오름차순, 국가의 오름차순으로 정렬합니다.


SELECT	country, COUNT(*) 고객수,
		RANK() OVER (ORDER BY COUNT(*) DESC) AS 순위			/* RANK() 함수를 계산할 때의 정렬 기준 */
FROM 	s_customers
GROUP 	BY country
ORDER 	BY 순위, country;			/* 출력할 때의 정렬 기준. */
									/* 이게 없으면, RANK() 함수의 정렬 기준대로 출력됨. */