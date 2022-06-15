SELECT EMPLOYEE_ID
	 , FIRST_NAME || ' ' || LAST_NAME AS NAME
	 , SALARY
	 , COMMISSION_PCT 
	 , HIRE_DATE
  FROM EMPLOYEES  
-- ORDER BY SALARY DESC, NAME;		-- 입력하지 않으면 오름차순(ASC)
 ORDER BY SALARY, NAME DESC;
 
SELECT EMPLOYEE_ID
	 , FIRST_NAME || ' ' || LAST_NAME AS NAME
	 , SALARY
	 , COMMISSION_PCT 
	 , HIRE_DATE
  FROM EMPLOYEES 
 ORDER BY NAME DESC;
 
SELECT EMPLOYEE_ID
	 , FIRST_NAME || ' ' || LAST_NAME AS NAME
	 , SALARY
	 , COMMISSION_PCT 
	 , HIRE_DATE
  FROM EMPLOYEES 
 ORDER BY 4 NULLS FIRST;
 
SELECT EMPLOYEE_ID
	 , FIRST_NAME || ' ' || LAST_NAME AS NAME
	 , SALARY
	 , COMMISSION_PCT 
	 , HIRE_DATE
  FROM EMPLOYEES 
 ORDER BY SALARY, 4 NULLS LAST;

--SELECT DISTINCT DEPARTMENT_ID		-- DISTINCT (중복 제거)
SELECT DEPARTMENT_ID				-- 실행순서 4번째
	 , MIN(SALARY)
	 , MAX(SALARY)
	 , AVG(SALARY)
	 , SUM(SALARY)
	 , COUNT(SALARY)
  FROM EMPLOYEES					-- 실행순서 1번째, (WHERE 2번째)
 GROUP BY DEPARTMENT_ID				-- 실행순서 3번째
 ORDER BY DEPARTMENT_ID;


SELECT DEPARTMENT_ID
	 , JOB_ID 
	 , MIN(SALARY)
	 , MAX(SALARY)
	 , AVG(SALARY)
	 , SUM(SALARY)
	 , COUNT(SALARY)
  FROM EMPLOYEES
 GROUP BY DEPARTMENT_ID, JOB_ID 
 ORDER BY DEPARTMENT_ID;
 
 
 
SELECT EXTRACT(YEAR FROM HIRE_DATE) AS 입사년도
	 , MIN(SALARY)
	 , MAX(SALARY)
	 , AVG(SALARY)
	 , SUM(SALARY)
	 , COUNT(SALARY)
  FROM EMPLOYEES
  GROUP BY EXTRACT(YEAR FROM HIRE_DATE)
  HAVING COUNT(SALARY) > 1;			-- HAVING (그룹 조건) = WHERE (조건절)
  
  
SELECT COMMISSION_PCT 				-- 실행순서 5번째
	 , MIN(SALARY) AS "최저 급여"
	 , MAX(SALARY) AS "최고 급여"
	 , AVG(SALARY) AS "평균 급여"
	 , SUM(SALARY) AS "급여 총합"
	 , COUNT(SALARY) AS "인원수"
  FROM EMPLOYEES					-- 실행순서 첫번째
 WHERE COMMISSION_PCT IS NOT NULL	-- 실행순서 2번째
   AND SALARY >= 7000
 GROUP BY COMMISSION_PCT			-- 실행순서 3번재
HAVING AVG(SALARY) >= 9500			-- 실행순서 4번째
-- ORDER BY COUNT(SALARY); 
 ORDER BY 6;						-- 실행순서 5번째
 
 
SELECT COMMISSION_PCT
     , SALARY
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL
   AND SALARY >= 7000;
   
SELECT COMMISSION_PCT
     , MIN(SALARY) AS "최저 급여"
     , MAX(SALARY) AS "최고 급여"
     , AVG(SALARY) AS "평균 급여"
     , SUM(SALARY) AS "급여 총합"
     , COUNT(SALARY) AS "인원수"
  FROM EMPLOYEES
 WHERE COMMISSION_PCT IS NOT NULL
   AND SALARY >= 7000
 GROUP BY COMMISSION_PCT;
 
/*
 * 1980 년대, 1990 년대 2000 년대 별로 그룹을 묶어서 급여의 평균과 인원수를 구한다.
 */
--SELECT HIRE_DATE AS "입사년도"
--	 , AVG(SALARY) "급여 평균"
--	 , COUNT(SALARY) "인원수"
--	 , CASE WHEN HIRE_DATE >= '1980-01-01' AND HIRE_DATE < '1990-01-01' THEN '1980년대'
--	 		WHEN HIRE_DATE >= '1990-01-01' AND HIRE_DATE < '2000-01-01' THEN '1990년대'
--			WHEN HIRE_DATE >= '2000-01-01' THEN '2000년대'
--			ELSE '2000년대'
--		END AS "소득분류"
-- FROM EMPLOYEES

SELECT TRUNC (EXTRACT(YEAR FROM HIRE_DATE), -1) AS 입사년도
	 , ROUND(AVG(SALARY), 2) AS 급여평균
	 , COUNT(*) AS 인원수
  FROM EMPLOYEES
 GROUP BY TRUNC(EXTRACT(YEAR FROM HIRE_DATE), -1)
 ORDER BY 입사년도;

SELECT SUBSTR(TO_CHAR(EXTRACT(YEAR FROM HIRE_DATE)), 1, 3) || '0' AS 입사년도
	 , ROUND(AVG(SALARY), 2) AS 급여평균
	 , COUNT(*) AS 인원수
  FROM EMPLOYEES
 GROUP BY SUBSTR(TO_CHAR(EXTRACT(YEAR FROM HIRE_DATE)), 1, 3) || '0'
 ORDER BY 입사년도;

SELECT FLOOR(EXTRACT(YEAR FROM HIRE_DATE) / 10) * 10 AS 입사년도
	 , ROUND(AVG(SALARY), 2) AS 급여평균
	 , COUNT(*) AS 인원수
  FROM EMPLOYEES
 GROUP BY FLOOR(EXTRACT(YEAR FROM HIRE_DATE) / 10) * 10
 ORDER BY 입사년도;


/*
 * 급여 집계를 위한 그룹을 다음과 같이 묶어서 인원수를 구한다.
 *		2000 ~ 3500 미만 	 1그룹
 *		3500 ~ 5000 미만 	 2그룹
 *		5000 ~ 8000 미만	 3그룹
 *		8000 ~ 12000 미만	 4그룹
 *		12000 이상		 5그룹
 */		
SELECT CASE WHEN SALARY >= 2000 AND SALARY < 3500 THEN '1그룹'
			WHEN SALARY >= 3500 AND SALARY < 5000 THEN '2그룹'
			WHEN SALARY >= 5000 AND SALARY < 8000 THEN '3그룹'
			WHEN SALARY >= 8000 AND SALARY < 12000 THEN '4그룹'
			WHEN SALARY >= 12000 THEN '5그룹'
		END AS 그룹
	  , COUNT(*) AS 인원수
  FROM EMPLOYEES
 GROUP BY CASE WHEN SALARY >= 2000 AND SALARY < 3500 THEN '1그룹'
			   WHEN SALARY >= 3500 AND SALARY < 5000 THEN '2그룹'
			   WHEN SALARY >= 5000 AND SALARY < 8000 THEN '3그룹'
			   WHEN SALARY >= 8000 AND SALARY < 12000 THEN '4그룹'
			   WHEN SALARY >= 12000 THEN '5그룹'
		  END
 ORDER BY 그룹;

 

SELECT DEPARTMENT_ID
	 , JOB_ID
	 , SUM(SALARY)
	 , AVG(SALARY)
	 , COUNT(* )
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY ROLLUP(DEPARTMENT_ID, JOB_ID);


SELECT DEPARTMENT_ID
	 , JOB_ID
	 , SUM(SALARY)
	 , AVG(SALARY)
	 , COUNT(* )
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY CUBE(DEPARTMENT_ID, JOB_ID)
 ORDER BY DEPARTMENT_ID, JOB_ID NULLS LAST;
 

SELECT DEPARTMENT_ID
	 , JOB_ID
	 , DECODE(NVL(COMMISSION_PCT, 0), 0, 'NO', 'YES')
	 , SUM(SALARY)
	 , AVG(SALARY)
	 , COUNT(* )
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY ROLLUP(DEPARTMENT_ID, JOB_ID, DECODE(NVL(COMMISSION_PCT, 0), 0, 'NO', 'YES'));
 

SELECT DEPARTMENT_ID
	 , JOB_ID
	 , DECODE(NVL(COMMISSION_PCT, 0), 0, 'NO', 'YES')
	 , SUM(SALARY)
	 , AVG(SALARY)
	 , COUNT(* )
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY CUBE(DEPARTMENT_ID, JOB_ID, DECODE(NVL(COMMISSION_PCT, 0), 0, 'NO', 'YES'))
 ORDER BY DEPARTMENT_ID, JOB_ID, 3 NULLS LAST;
 


SELECT * FROM EMPLOYEES;

/*
 * 부서, 고용연도 별 급여 통계(최고 급여, 최저 급여, 평균) 를 구한다.
 *		- ROLLUP, CUBE 를 적용하여 구한다.
 *		- 부서가 NULL 인원이 있기 때문에 해당 인원은 제외한다.
 */
SELECT DEPARTMENT_ID AS 부서
	 , EXTRACT(YEAR FROM HIRE_DATE) AS 고용연도
	 , MAX(SALARY) AS 최고급여
	 , MIN(SALARY) AS 최저급여
	 , AVG(SALARY) AS 평균급여
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY ROLLUP(DEPARTMENT_ID, EXTRACT(YEAR FROM HIRE_DATE))
 ORDER BY DEPARTMENT_ID, 고용연도;

SELECT DEPARTMENT_ID AS 부서
     , EXTRACT(YEAR FROM HIRE_DATE) AS 고용년도
     , MIN(SALARY) AS 최소급여
     , MAX(SALARY) AS 최대급여
     , AVG(SALARY) AS 평균급여
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY CUBE(DEPARTMENT_ID, EXTRACT(YEAR FROM HIRE_DATE))
 ORDER BY DEPARTMENT_ID, 고용년도;

SELECT DEPARTMENT_ID AS 부서
     , EXTRACT(YEAR FROM HIRE_DATE) AS 고용년도
     , MIN(SALARY) AS 최소급여
     , MAX(SALARY) AS 최대급여
     , AVG(SALARY) AS 평균급여
     , CASE WHEN GROUPING(DEPARTMENT_ID) = 0 AND GROUPING(EXTRACT(YEAR FROM HIRE_DATE)) = 0 THEN '부서별/년도별'
            WHEN GROUPING(DEPARTMENT_ID) = 0 AND GROUPING(EXTRACT(YEAR FROM HIRE_DATE)) = 1 THEN '부서별'
            WHEN GROUPING(DEPARTMENT_ID) = 1 AND GROUPING(EXTRACT(YEAR FROM HIRE_DATE)) = 0 THEN '년도별'
            WHEN GROUPING(DEPARTMENT_ID) = 1 AND GROUPING(EXTRACT(YEAR FROM HIRE_DATE)) = 1 THEN '전체(총)'
       END AS 그룹구분
  FROM EMPLOYEES
 WHERE DEPARTMENT_ID IS NOT NULL
 GROUP BY CUBE(DEPARTMENT_ID, EXTRACT(YEAR FROM HIRE_DATE))
 ORDER BY DEPARTMENT_ID, 고용년도;