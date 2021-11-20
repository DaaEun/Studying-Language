-- Q6 (10점) :
-- 상품의 재고액을 기준으로, 각 상품에 다음과 같이 재고등급을 부여하세요.
-- 상품의 재고액은 구매단가(buyPrice)와 재고개수(quantityInStock)의 곱으로 계산합니다.
-- 500,000불 이상 : A
-- 400,000불 이상 : B
-- 300,000불 이상 : C
-- 300,000불 미만 : D
-- 출력 컬럼은 상품의 productCode, name, buyPrice, quantityInStock, 재고액, 재고등급 순으로 합니다.
SELECT productCode, name, buyPrice, quantityInStock, buyPrice * quantityInStock AS 재고액,
    CASE 
        WHEN buyPrice * quantityInStock >= 500000 THEN 'A'
        WHEN buyPrice * quantityInStock >= 400000 THEN 'B'
        WHEN buyPrice * quantityInStock >= 300000 THEN 'C'
        ELSE 'D'
    END AS 재고등급        
FROM s_products;

/*
CASE는 위의 WHEN부터 체크한다. break가 내포된 의미인 듯
*/