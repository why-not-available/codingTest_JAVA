-- 코드를 작성해주세요 
-- 분화된 연도(YEAR), 분화된 연도별 대장균 크기의 편차(YEAR_DEV), 대장균 개체의 ID(ID) 를 출력
select year(DIFFERENTIATION_DATE) 'YEAR', 
    ((select max(SIZE_OF_COLONY) from ECOLI_DATA 
      where year(DIFFERENTIATION_DATE) = YEAR group by year(DIFFERENTIATION_DATE)
     ) - SIZE_OF_COLONY) 'YEAR_DEV', 
    ID 
from ECOLI_DATA
order by YEAR asc, YEAR_DEV asc
                                                         