-- Q8 (10점) :
-- 상품의 description에 'die-cast'란 단어가 들어있는 상품을 검색하세요.
-- 출력 컬럼은 상품의 name, description 순으로 합니다.
SELECT name, description
FROM s_products
WHERE description LIKE '%die-cast%';