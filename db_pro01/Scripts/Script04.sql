
SELECT FIRST_NAME 
	 ,LENGTH(FIRST_NAME) AS "길이"
  FROM EMPLOYEES;
 
SELECT LENGTH('Hello Oracle')
	 , LENGTH('오라클 안녕')
  FROM DUAL;
  
SELECT LENGTHB('Hello Oracle')
	 , LENGTHB('오라클 안녕')		-- LENGTHB : BYTE 로 보여줌
  FROM DUAL;					-- DUAL 테이블 (테스트용 더미 공간)
  
SELECT INSTR('smaple@example@com', '@', 1)
	 , INSTR('smaple@example@com', '@', -1)
	 , INSTR('smaple@example@com', '@', -1, 2)
  FROM DUAL;
  
SELECT '!' || LPAD('A', 4)		-- LEFT Padding (왼쪽 여백) (느낌표는 여백 공간 보려고 넣어놓은거임)
	 , '!' || LPAD('AB', 4)
 	 , '!' || LPAD('ABC', 4)
 	 , '!' || LPAD('ABCDE', 4)	-- 4글자 넘으면 짤림
 	 , '!' || LPAD('A', 4, '_')-- 세번째 인자, 해당값으로 여백을 채워줌
 	 , RPAD('A', 4) || '!'		-- RIGHT Padding (오른쪽 여백)
 	 , RPAD('AB', 4) || '!'
 	 , RPAD('ABC', 4) || '!'
 	 , RPAD('ABCDE', 4) || '!'
 	 , '!' || LPAD('A', 4, '_')
  FROM DUAL;
   
 
SELECT RTRIM('userId@example.com', 'example.com') 
	 , LTRIM('010-1234-5678', '010-')
	 , LTRIM(RTRIM('     PASSWORD INPUT     '))
	 , TRIM('     PASSWORD INPUT     ')
	 , TRIM('A' FROM 'AAAAAHelloAAAA')
	 , TRIM(LEADING 'A' FROM 'AAAAAHelloAAAA')
	 , TRIM(TRAILING 'A' FROM 'AAAAAHelloAAAA')
	 , TRIM(BOTH 'A' FROM 'AAAAAHelloAAAA')
  FROM DUAL;
  
 
SELECT SUBSTR('userId@example.com', 1, 6)
	 , SUBSTR('userId@example.com', 8, 7)
 	 , SUBSTR('userId@example.com', 8)
 	 , SUBSTR('userId@example.com', -3)
  FROM DUAL;
 
 
SELECT LOWER('userId@example.com')
	 , UPPER('userId@example.com')
	 , INITCAP('userId@example.com')
  FROM DUAL;
  
 
SELECT CONCAT('Hello', ' World')
  FROM DUAL;
  
 
 --				원본					  찾을문자열		  변경할문자열
SELECT REPLACE('userId@example.com', '@example.com', '@example.co.kr')
  FROM DUAL;
 

SELECT ABS(10)
	 , ABS(-10)
	 , ABS(-10.12)
  FROM DUAL;
 
-- 나머지값 구하기 
SELECT MOD(10, 3)
	 , MOD(-10, 3)
	 , MOD(10.5, 3)
	 , MOD(-10.5, 3)
  FROM DUAL;
 
-- 반올림
SELECT ROUND(10.4)
	 , ROUND(10.5)
	 , ROUND(10.46)
	 , ROUND(10.45 , 1)
	 , ROUND(10.456 , 2)
	 , ROUND(18.45 , -1)
  FROM DUAL;
 
 
SELECT FLOOR(10.34)
	 , FLOOR(-10.34)
 	 , CEIL(10.34)
 	 , CEIL(-10.34)
  FROM DUAL;
  
  
SELECT TRUNC(10.34, 1) 
	 , TRUNC(10.36, 1)
	 , TRUNC(10.3456, 2)
	 , TRUNC(1234, -1)
  FROM DUAL;
  

ALTER SESSION SET NLS_LANGUAGE = KOREAN;
 
SELECT * FROM V$NLS_PARAMETERS WHERE PARAMETER LIKE '%LANG';
 
SELECT SYSDATE 
	 , ADD_MONTHS(SYSDATE, 3)
	 , ADD_MONTHS(SYSDATE, -3)
	 , LAST_DAY(SYSDATE)
	 --, NEXT_DAY(SYSDATE, 'FRI')
	 --, NEXT_DAY(SYSDATE, 'FRIDAY')
	 , NEXT_DAY(SYSDATE, '금')
	 , NEXT_DAY(SYSDATE, '금요일')
	 , NEXT_DAY(SYSDATE, 6) -- 1:일요일, 2:월요일, ... 6:금요일, 7:토요일
  FROM DUAL;
  
 
SELECT EXTRACT(YEAR FROM SYSDATE)
	 , EXTRACT(MONTH FROM SYSDATE)
	 , EXTRACT(DAY FROM SYSDATE)
	 , EXTRACT(HOUR FROM SYSTIMESTAMP)
	 , EXTRACT(MINUTE FROM SYSTIMESTAMP)
	 , EXTRACT(SECOND FROM SYSTIMESTAMP)
	 , SYSDATE
	 , SYSTIMESTAMP
  FROM DUAL;
  
 
 
SELECT MONTHS_BETWEEN(SYSDATE, ADD_MONTHS(SYSDATE, 3))
	 , MONTHS_BETWEEN(ADD_MONTHS(SYSDATE, 3), SYSDATE)
  FROM DUAL;
  
 
 
SELECT SYSDATE
	 , SYSDATE  + 1
	 , SYSDATE  + 2
	 , SYSDATE  - 1
	 , SYSDATE  - 2
     , SYSDATE + INTERVAL '1' DAY
     , SYSDATE + INTERVAL '1' MONTH
     , SYSDATE + INTERVAL '1' YEAR
     , SYSDATE + INTERVAL '1' HOUR
     , SYSDATE + INTERVAL '1' MINUTE
     , SYSDATE + INTERVAL '1' SECOND
  FROM DUAL;
 
 
SELECT SYSTIMESTAMP 
     , SYSTIMESTAMP + INTERVAL '3' DAY
     , SYSTIMESTAMP + INTERVAL '3' MONTH
     , SYSTIMESTAMP + INTERVAL '3' YEAR
     , SYSTIMESTAMP + INTERVAL '30' SECOND
     , SYSTIMESTAMP + INTERVAL '30' MINUTE
     , SYSTIMESTAMP + INTERVAL '3' HOUR
     , SYSTIMESTAMP - INTERVAL '30' SECOND
     , SYSTIMESTAMP - INTERVAL '30' MINUTE
     , SYSTIMESTAMP - INTERVAL '3' HOUR
  FROM DUAL;
  
 -- 통화 단위에 심볼 변경이 필요한 경우 다음의 ALTER 문을 사용
ALTER SESSION SET NLS_CURRENCY = '￦';
SELECT * FROM V$NLS_PARAMETERS WHERE PARAMETER = 'NLS_CURRENCY';
 
SELECT 1234
 	 , TO_CHAR(1234)
 	 , TO_CHAR(SYSDATE, 'YYYYMMDD')
 	 , TO_CHAR(SYSDATE, 'YYYY/MM/DD')
 	 , TO_CHAR(SYSDATE, 'YYYY-MM-DD')
 	 , TO_CHAR(SYSDATE, 'YYYY"년" MM"월" DD"일"')
 	 , TO_CHAR(SYSDATE, 'YYYY-MM-DD AM HH:MI:SS')
 	 , TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS')
 	 , TO_CHAR(SYSTIMESTAMP, 'YYYY-MM-DD AM HH:MI:SS.FF3')
 	 , TO_CHAR(1000000, '999,999,999')
 	 , TO_CHAR(1000000, '000,000,000')
 	 , TO_CHAR(1000000, '999,999,999L')
  FROM DUAL;
  

SELECT TO_DATE('20220425', 'YYYYMMDD')
	 , TO_DATE('20220425')
	 , TO_DATE(20220425)
	 , TO_DATE('2022/04/25')		-- 일반적인 형태는 포멧을 지정 안해줘도 (생략해도) 됨 
	 , TO_DATE('2022-04-25')
	 , TO_DATE('2022.04.25')
	 , TO_DATE('2022년 04월 25일',  'YYYY"년" MM"월" DD"일"') -- 일반적이지 않아서 지정해줘야 함
  FROM DUAL;
  
SELECT TO_NUMBER('20220425')
	 , TO_NUMBER('20,220,425', '999,999,999')
	 , TO_NUMBER('FFFF', 'XXXX')
  FROM DUAL;
  
 
SELECT TO_NUMBER(TO_CHAR(SYSDATE, 'YYYYMMDD'))
  FROM DUAL;