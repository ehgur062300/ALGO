-- 코드를 입력하세요
select history_id, car_id, 
to_char(start_date, 'yyyy-mm-dd') as start_date,
to_char(end_date, 'yyyy-mm-dd') as end_date,
    case
        when end_date-start_date+1 >= 30 
        then '장기 대여'
        else '단기 대여'
    end as rent_type
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(start_date, 'yyyy-mm') = '2022-09' 
order by history_id DESC