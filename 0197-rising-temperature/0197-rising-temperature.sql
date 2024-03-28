/* Write your PL/SQL query statement below */
/*select id from Weather w inner join(
select recordDate + 1 next_date, temperature from Weather) sb 
    on w.recordDate = sb.next_date
    where w.temperature > sb.temperature;*/
    
select id from Weather w1 join(
select recordDate + 1 Next_date, temperature from Weather
) w2 on (w1.recordDate = w2.Next_date and w1.temperature > w2.temperature)