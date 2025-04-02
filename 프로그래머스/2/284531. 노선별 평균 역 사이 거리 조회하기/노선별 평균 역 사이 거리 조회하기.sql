-- 코드를 작성해주세요 : 노선별로 노선, 총 누계 거리, 평균 역 사이 거리 조회
SELECT ROUTE, concat(round(sum(D_BETWEEN_DIST), 1), "km") 'TOTAL_DISTANCE', 
    concat(round(avg(D_BETWEEN_DIST), 2), "km") 'AVERAGE_DISTANCE' 
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY sum(D_BETWEEN_DIST) desc;