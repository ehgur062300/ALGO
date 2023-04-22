-- 코드를 입력하세요
SELECT ii.flavor as flavor 
from first_half fh, icecream_info ii
where fh.flavor = ii.flavor 
and fh.total_order > 3000
and ii.INGREDIENT_TYPE = 'fruit_based'
