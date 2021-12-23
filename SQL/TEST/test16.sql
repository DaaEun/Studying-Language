/* Q16 (20점) :
2004년 6월의 날짜별 결제횟수를 검색하세요. 
주문이 없는 날짜도 출력에 포함하며, 결제횟수는 0으로 출력합니다.
단, 모든 'Saturday'와 'Sunday'는 출력에서 제외합니다. (내장함수 DAYNAME() 사용)
출력 컬럼은 paymentDate, 결제횟수 순으로 합니다.
결과는 paymentDate의 오름차순으로 정렬합니다.
*/

WITH RECURSIVE allDates (date, 요일) AS
(
SELECT '2004-06-01', DAYNAME('2004-06-01')
UNION ALL
SELECT date + INTERVAL 1 DAY , DAYNAME(date + INTERVAL 1 DAY)
FROM allDates
WHERE date + INTERVAL 1 DAY <= '2004-06-30'
)
SELECT A.date, COALESCE(COUNT(P.paymentDate),0) 결제횟수
FROM allDates A LEFT JOIN payments P ON A.date = P.paymentDate
WHERE A.요일 NOT IN ('Sunday', 'Saturday')
GROUP BY A.date
ORDER BY 1;