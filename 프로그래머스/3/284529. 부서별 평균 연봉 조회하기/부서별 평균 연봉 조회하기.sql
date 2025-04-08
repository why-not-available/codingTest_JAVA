-- 코드를 작성해주세요
-- 부서별로 부서 ID, 영문 부서명, 평균 연봉
SELECT d.DEPT_ID, DEPT_NAME_EN, round(avg(SAL), 0) 'AVG_SAL'
FROM HR_DEPARTMENT d 
    join HR_EMPLOYEES e on d.DEPT_ID = e.DEPT_ID
GROUP BY DEPT_ID
ORDER BY AVG_SAL desc