/*Q8 (10점) :
상품의 scale을 검색하세요.
출력 컬럼은 상품의 name, scale 순으로 합니다.
결과는 scale의 내림차순, name의 오름차순으로 정렬합니다.
단, scale은 1:700이 가장 큰 것이고, 1:10이 가장 작은 것입니다.
질의 작성시 다음 내장함수를 사용할 수 있습니다.
- INSTR(str, substr) : str에서 첫번째 나타나는 substr의 시작 위치를 리턴함.
- SUBSTR(str, position, length) : str의 position부터 length 만큼의 문자열을 리턴함. length가 생략되면, position부터 마지막까지의 문자열을 리턴함.
*/

SELECT name, scale
FROM products
ORDER BY CAST(SUBSTRING(scale, LOCATE(':', scale) + 1) AS UNSIGNED) DESC, 1;