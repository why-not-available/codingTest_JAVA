-- 코드를 작성해주세요
SELECT count(*) 'FISH_COUNT', month(TIME) 'MONTH'
FROM FISH_INFO
GROUP By month
ORDER BY month