-- 코드를 입력하세요
select round(avg(daily_fee),0) as daily_fee from CAR_RENTAL_COMPANY_CAR 
where car_type = 'SUV'
          