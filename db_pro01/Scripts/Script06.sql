SELECT 10 * NVL(NULL, 0) AS Col1
  FROM DUAL;
  
 
SELECT COUNTRY_ID
	 , COUNTRY_NAME
	 , DECODE(COUNTRY_ID, 'IT', '이태리', 'JP', '일본', 'US', '미국', 'CA', '캐나다', COUNTRY_NAME) AS COUNTRY_KOR
  FROM COUNTRIES;
  

SELECT EMPLOYEE_ID
	 , FIRST_NAME
	 , LAST_NAME
	 , CASE WHEN SALARY >= 1000 AND SALARY < 3000 THEN '하위소득'
	 		WHEN SALARY >= 3000 AND SALARY < 6000 THEN '중위소득'
			WHEN SALARY >= 6000 AND SALARY < 10000 THEN '고소득'
			ELSE '미분류'
		END AS "소득분류"
  FROM EMPLOYEES;
  
 
SELECT SUM(SALARY)
	 , SUM(COMMISSION_PCT)
  FROM EMPLOYEES;
  
 
SELECT AVG(SALARY)
  FROM EMPLOYEES;
  
SELECT AVG(COMMISSION_PCT)
  FROM EMPLOYEES;
  
SELECT MIN(COMMISSION_PCT)
	 , MIN(HIRE_DATE)
	 , MIN(FIRST_NAME)
  FROM EMPLOYEES;
 
 SELECT MAX(COMMISSION_PCT)
	  , MAX(HIRE_DATE)
	  , MAX(FIRST_NAME)
  FROM EMPLOYEES;
 
SELECT COUNT(*)		-- 무엇을 넣든 동일하니 보통 * 을 넣는다.
  FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL; 