-- 코드를 작성해주세요 : 2022년도 점수, 사번, 성명, 직책, 이메일
SELECT sum(SCORE)'SCORE', he.EMP_NO, EMP_NAME, POSITION, EMAIL FROM HR_EMPLOYEES he
join HR_GRADE hg on he.EMP_NO = hg.EMP_NO
WHERE YEAR = '2022'
GROUP BY hg.EMP_NO
ORDER BY SCORE desc
LIMIT 1;

# select EMP_NO, sum(SCORE) from HR_GRADE
# group by EMP_NO


