/*Q18 (20점) :
지점 고객수를 구하여, 직원의 담당 고객수와 함께 출력하세요.
지점 고객수는 그 지점에 근무하는 직원의 담당 고객수를 모두 합한 것입니다.
출력 컬럼은 officeCode, 직원 성명, 담당고객수, 지점고객수 순으로 합니다.
결과는 officeCode의 오름차순, 담당고객수의 내림차순, 직원 성명의 오름차순으로 정렬합니다.
*/

WITH temp AS (
SELECT officeCode, CONCAT(firstName, ' ', lastName) 성명, COUNT(customerId) 담당고객수
FROM employees JOIN customers ON employeeId = salesRepId
GROUP BY officeCode, 성명
),
temp1 AS (
SELECT officeCode, SUM(담당고객수) 지점고객수
FROM temp
GROUP BY officeCode
)
SELECT officeCode, 성명, 담당고객수, 지점고객수
FROM temp JOIN temp1 USING (officeCode)
ORDER BY 1, 3 DESC, 2;