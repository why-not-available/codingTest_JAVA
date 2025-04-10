-- 코드를 작성해주세요 : 사원별 성과금 정보
-- 사번, 성명, 평가등급, 성과금
-- 2단계: 위 결과를 FROM절로 감싸고, BONUS 계산
SELECT EMP_NO, EMP_NAME, GRADE, CASE 
                                WHEN GRADE = 'S' THEN SAL * 0.2
                                WHEN GRADE = 'A' THEN SAL * 0.15
                                WHEN GRADE = 'B' THEN SAL * 0.1
                                ELSE 0 END 
                                'BONUS'
FROM (SELECT e.EMP_NO, EMP_NAME, CASE 
                                    WHEN avg(SCORE) >= 96 THEN 'S'
                                    WHEN avg(SCORE) >= 90 THEN 'A'
                                    WHEN avg(SCORE) >= 80 THEN 'B'
                                    ELSE 'C' END 'GRADE', SAL
     FROM HR_EMPLOYEES e
     JOIN HR_GRADE g ON e.EMP_NO = g.EMP_NO
     GROUP BY e.EMP_NO, EMP_NAME, SAL
     ) t
ORDER BY EMP_NO asc;


# case 
#         when GRADE='S' then sal = SAL*0.8
#         when GRADE='A' then sal = SAL*0.75
#         when GRADE='B' then sal = SAL*0.9
#         when GRADE='C' then sal = SAL;


# select EMP_NO, (case when (sum(SCORE))/2 >= 96 then 'S'
#                      when (sum(SCORE))/2 >= 90 then 'A'
#                      when (sum(SCORE))/2 >= 80 then 'B'
#                      else 'C' 
#                 end) 'GRADE'
# from HR_GRADE 
# group by EMP_NO