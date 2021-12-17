-- Q2 (30점) :
-- 2004년의 11월의 날짜별 주문횟수를 검색하세요.
-- 주문이 없는 날도 출력에 포함합니다. 단, 모든 'Saturday'와 'Sunday'는 출력에서 제외합니다.
-- 주문이 없는 날의 주문횟수는 0으로 출력합니다.
-- 출력 컬럼은 주문날짜, 요일, 주문횟수 순으로 하세요.
-- 결과는 주문날짜의 오름차순으로 정렬하세요.

-- test1, 완전 이상한 sql
SELECT orderDate AS 주문날짜, DAY(orderDate) AS 요일, COUNT(orderDate) AS 주문횟수
FROM orders
GROUP BY orderDate
ORDER BY 1;


-- 2004년 11월 모든 날과 요일 생성
WITH RECURSIVE allDates (date, 요일) AS
(
SELECT '2004-11-01', DAYNAME('2004-11-01')
UNION ALL
SELECT date + INTERVAL 1 DAY , DAYNAME(date + INTERVAL 1 DAY)
FROM allDates
WHERE date + INTERVAL 1 DAY <= '2004-11-30'
)
SELECT *
FROM allDates
WHERE 요일 NOT IN ('Sunday', 'Saturday');


WITH RECURSIVE allDates (date, 요일) AS
(
SELECT '2004-11-01', DAYNAME('2004-11-01')
UNION ALL
SELECT date + INTERVAL 1 DAY , DAYNAME(date + INTERVAL 1 DAY)
FROM allDates
WHERE date + INTERVAL 1 DAY <= '2004-11-30'
)
SELECT A.date AS 날짜, A.요일, COALESCE(COUNT(O.orderDate),0) AS 주문횟수
FROM allDates A LEFT JOIN orders O ON A.date = O.orderdate
WHERE A.요일 NOT IN ('Sunday', 'Saturday')
GROUP BY A.date
ORDER BY 1;