-- 코드를 입력하세요
SELECT (case when date_format(DATETIME, '%H') = 7 then 7
            when date_format(DATETIME, '%H') = 8 then 8
            when date_format(DATETIME, '%H') = 9 then 9
            when date_format(DATETIME, '%H') = 10 then 10
            when date_format(DATETIME, '%H') = 11 then 11
            when date_format(DATETIME, '%H') = 12 then 12
            when date_format(DATETIME, '%H') = 13 then 13
            when date_format(DATETIME, '%H') = 14 then 14
            when date_format(DATETIME, '%H') = 15 then 15
            when date_format(DATETIME, '%H') = 16 then 16
            when date_format(DATETIME, '%H') = 17 then 17
            when date_format(DATETIME, '%H') = 18 then 18
            when date_format(DATETIME, '%H') = 19 then 19
        end) 'HOUR', count(DATETIME) 'COUNT'
FROM ANIMAL_OUTS
WHERE date_format(DATETIME, '%H:%i') between '09:00' and '19:59'
GROUP BY HOUR 
# HAVING date_format(HOUR, '%H:%i') between '09:00' and '19:59'
ORDER BY HOUR asc