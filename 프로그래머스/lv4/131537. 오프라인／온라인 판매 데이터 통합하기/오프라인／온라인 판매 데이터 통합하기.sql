-- 코드를 입력하세요
SELECT to_char(sales_date, 'yyyy-mm-dd') as sales_date,
product_id, user_id as user_id, sales_amount from ONLINE_SALE 
where to_char(sales_date, 'yyyy-mm') = '2022-03' 

union all

SELECT to_char(sales_date, 'yyyy-mm-dd') as sales_date,
product_id, NULL as user_id,
sales_amount from OFFLINE_SALE
where to_char(sales_date, 'yyyy-mm') = '2022-03'
order by sales_date ASC, product_id ASC, user_id ASC