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
