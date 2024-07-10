-- 코드를 입력하세요
SELECT B.TITLE, B.BOARD_ID, R.REPLY_ID, R.WRITER_ID, R.CONTENTS, TO_CHAR(R.CREATED_DATE, 'YYYY-MM-DD') CREATED_DATE
FROM USED_GOODS_BOARD B, USED_GOODS_REPLY R
WHERE B.BOARD_ID = R.BOARD_ID
      AND B.CREATED_DATE >= TO_DATE('2022-10-01', 'YYYY-MM-DD')
      AND B.CREATED_DATE <= TO_DATE('2022-10-31', 'YYYY-MM-DD')
      ORDER BY R.CREATED_DATE ASC, B.TITLE ASC;