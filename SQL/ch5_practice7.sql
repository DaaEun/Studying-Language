-- Q7 (10점) :
-- 상품라인(productLine) 별로 평균 구매단가(buyPrice)와 평균 권장소비자가(MSRP)를 검색하세요.
-- 출력 컬럼은 productLine, 평균 구매단가, 평균 권장소비자가 순으로 합니다.
-- 이 때 결과는 평균 구매단가와 평균 권장소비자가의 내림차순으로 정렬합니다.
-- 관련 스키마 다이어그램(ERD)을 보시려면 여기를 클릭하세요.

SELECT *
FROM products;

SELECT productLine, AVG(buyPrice) '평균 구매단가', AVG(MSRP) '평균 권장소비자가'
FROM products
GROUP BY productLine
ORDER BY '평균 구매단가' DESC, '평균 권장소비자가' DESC;
