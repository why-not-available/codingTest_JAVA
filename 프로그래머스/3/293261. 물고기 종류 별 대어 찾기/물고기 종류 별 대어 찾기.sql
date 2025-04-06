-- 코드를 작성해주세요
-- 물고기 종류 별로 가장 큰 물고기의 ID, 물고기 이름, 길이 를 출력

select ID, FISH_NAME, LENGTH	
from FISH_INFO i join FISH_NAME_INFO ni on i.FISH_TYPE = ni.FISH_TYPE
where LENGTH = (select max(LENGTH) from FISH_INFO
                where FISH_TYPE = i.FISH_TYPE
                    and LENGTH > 10
                group by FISH_TYPE)
order by ID asc


