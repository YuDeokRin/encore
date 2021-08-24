## 2021.08.24

## 오늘의 학습 목표

1. 스크립트를 설치하고 스트립트 생성된 테이블을 연동하자.(SQLPLSQL_Sample_v2.0.sql)

2. SET 연산자를 이용해서 테이블간의 연산을 구현할 수 있다.(합집합, 교집합, 베타집합...)

--------------------------------------------------------------------------------------------------------
#### 데이터 베이스 전체흐름

DML, DDL, TCL의 순서로 진행 (CRUD) -> 설치 -> 스키마(계정, 권한, 테이블) -> SELECT구문 ->
집계 함수 -> 함수(숫자, 문자열, 날짜) ->서브쿼리 -> 조인(테이블간의 컬럼 매칭) -> CRUD[VIEW] ->제약조건 -> 트랜잭션 -> 트리거 -> 인덱스 -> 사용자함수, 프로시저(PL/SQL)

스크립트 파일의 테이블들을 이용해서 구문을 실행해보자.


#### Q1) '2010년 1월 1일' 기준으로 입사한지 10년이 넘은 직원들의 근무 년수를 조회하자.단, MONTHS_BETWEEN('10/01/01', 대상컬럼)을 이용해서 사원의 이름, 입사일, 별칭으로 근무년수를 구해보자.
```
SELECT EMP_NAME, HIRE_DATE, MONTHS_BETWEEN('10/01/01', HIRE_DATE)/12 AS 근무년수
FROM EMPLOYEE
WHERE MONTHS_BETWEEN('10/01/01', HIRE_DATE) > 120;
```

```
SELECT EMP_NAME '사원의 이름' , HIRE_DATE 입사일,
TRUNC(MONTHS_BETWEEN('10/01/01', HIRE_DATE)/12) AS 근무년수
FROM EMPLOYEE
WHERE TRUNC(MONTHS_BETWEEN('10/01/01', HIRE_DATE)) >= 120;
```

--------------------------------------------------------------------------------------------------------

#### Q2) 사번이 100인 직원 이름과 급여를 출력해보자.
```
SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE EMP_ID = TO_CHAR(100);  -- >명시 형변환

SELECT EMP_NAME, SALARY
FROM EMPLOYEE
WHERE EMP_ID ='100';  --> 형변환
```
--------------------------------------------------------------------------------------------------------

#### Q3) 이름과 입사일을 별칭으로 출력하되 입사일은 0000-00-00으로 출력 해보자.

TO_CHAR()로 서식을 사용한다. 단, JOB_ID는 J7만 추출한다.
ex) NUMBER <->   CHAR    <->  DATE

<img src="https://user-images.githubusercontent.com/56623911/130610252-fb8b44c5-3062-435c-a3f3-d37c9a193ca4.png" wigth="40%" height="30%">


```
SELECT EMP_NAME AS 이름, TO_CHAR(HIRE_DATE, 'YYYY-MM-DD') AS 입사일
FROM EMPLOYEE
WHERE JOB_ID ='J7';

SELECT EMP_NAME AS 이름, TO_CHAR(HIRE_DATE, 'YYYY"년" MM"월"DD"일" ') AS 입사일
FROM EMPLOYEE
WHERE JOB_ID ='J7';
```

--------------------------------------------------------------------------------------------------------

#### Q4) JOB_ID가 J1, J2 인 사원의 이름 기본입사일, 상세입사일을 별칭으로 출력하되
상세입사일을 0000/00/00 00:00:00으로 출력해보자.

```
SELECT EMP_NAME AS 이름,  HIRE_DATE AS 기본입사일, TO_CHAR(HIRE_DATE, 'YYYY/MM/DD
HH24:MI:SS' ) AS 상세입사일
FROM EMPLOYEE
WHERE JOB_ID IN('J1', 'J2') ;
```
```
SELECT EMP_NAME AS 이름,  HIRE_DATE AS 기본입사일, TO_CHAR(HIRE_DATE, 'YYYY/MM/DD
HH24:MI:SS' ) AS 상세입사일
FROM EMPLOYEE
WHERE JOB_ID = 'J1' OR JOB_ID = 'J2';
```

--------------------------------------------------------------------------------------------------------
#### Q5) 한선기 90/04/01 2090/04/01 13:30:30, 90년04월01일 에 입사한 사원의 이름과 입사일을 출력 해보자.

```
SELECT EMP_NAME, HIRE_DATE
FROM EMPLOYEE
WHERE TO_CHAR(HIRE_DATE, 'YYMMDD')= '900401';
```

```
SELECT EMP_NAME, HIRE_DATE
FROM EMPLOYEE
WHERE HIRE_DATE = TO_CHAR('900401 133030', 'YYMMDD HH24MISS');
```

--------------------------------------------------------------------------------------------------------
#### Q6) 오라클에서 표시되는 세기 _ RR 날짜 서식

-YY 날짜 서식과 동일하다

-'지정된 년도'와 '현재 년도'에 따라 반환하는 '세기'값이 달라짐

```
SELECT EMP_NAME, HIRE_DATE, TO_CHAR(HIRE_DATE, 'YYYY/MM/DD')
FROM EMPLOYEE
WHERE EMP_NAME ='한선기';

SELECT EMP_NAME, HIRE_DATE, TO_CHAR(HIRE_DATE, 'RRRR/MM/DD')
FROM EMPLOYEE
WHERE EMP_NAME ='한선기';
```

<img src ="https://user-images.githubusercontent.com/56623911/130618889-b46fe2b3-002c-42bd-9246-7a484b2feb0b.png" wigth="30%" height="30%">

<img src ="https://user-images.githubusercontent.com/56623911/130619295-55491212-241e-4798-9eba-7582fa4b7da2.png" wigth="30%" height="30%">





--------------------------------------------------------------------------------------------------------

#### Q7) RR과  YY를 비교해서 출력해보자.

```
SELECT '2009/10/14' AS 현재, '95/10/27' AS 입력,
TO_CHAR(TO_DATE('95/10/27','YY/MM/DD'),'YYYY/MM/DD') AS YY형식1,
TO_CHAR(TO_DATE('95/10/27','YY/MM/DD'),'RRRR/MM/DD') AS YY형식2,
TO_CHAR(TO_DATE('95/10/27','RR/MM/DD'),'YYYY/MM/DD') AS RR형식1,
TO_CHAR(TO_DATE('95/10/27','RR/MM/DD'),'RRRR/MM/DD') AS RR형식2
FROM DUAL;
```
```
SELECT EMP_NAME, HIRE_DATE, TO_CHAR(TO_DATE('90/04/01', 'RR/MM/DD'), 'YYYY/MM/DD')
FROM EMPLOYEE
WHERE EMP_NAME = '한선기';
```

--------------------------------------------------------------------------------------------------------

#### Q8)  기타 단일 행 함수 - DECODE

SELECT 구문으로 IF-ELSE 논리를 제한적으로 구현한 오라클함수

DECODE(expr, search1, result1, [, searchN, resultN,... ],[, default])

expr : 대상 컬럼 또는 문자열 

search1 : expr 과 비교하려는 값

result1 : IF expr = serarch1  인 경우 반환하는 값

default : expr과 search1이 일치하지 않은 경우의 기본 리턴 값, default를 지정하고 않고 expr과 search1이 일치하지 않으면 NULL 값을 리턴

사원테이블에서 사원의 이름과 성별을 출력해보자.
```
SELECT EMP_NAME, SUBSTR(EMP_NO,8,1)
FROM EMPLOYEE;
```
```
SELECT EMP_NAME, DECODE(SUBSTR(EMP_NO,8,1), '1', '남', '2', '여', '3', '남', '4', '여') AS 성별
FROM EMPLOYEE;
```
```
SELECT EMP_NAME, DECODE(SUBSTR(EMP_NO,8,1), '1', '남', '3', '남', '여') AS 성별
FROM EMPLOYEE;
```

--------------------------------------------------------------------------------------------------------

#### Q9) 사원 테이블에서  사원의 번호, 사원의 이름, 관리자를 별칭으로 출력하되 관리자가 없으면 없음이라고 출력하자.
```
SELECT EMP_ID AS "사원의 번호", EMP_NAME AS "사원의 이름", DECODE(MGR_ID, NULL, '없음',
MGR_ID) AS 관리자 
FROM EMPLOYEE;
```
```
SELECT EMP_ID AS "사원의 번호", EMP_NAME AS "사원의 이름",
NVL(MGR_ID, '없음') AS 관리자
FROM EMPLOYEE;
```

--------------------------------------------------------------------------------------------------------

#### Q10) 사원의 이름과 직업, 봉급, 인상급여를 별칭으로 출력하자.

단, 인상급여는 DECODE를 이용해서 잡의 ID가 J7이면 봉급의 1.1, J6이면 봉급의 1.15, J5면 봉급의 1.2를 나머지는 1.05를 인상하자.
```
SELECT EMP_NAME "사원의이름",
JOB_ID AS "직업",
TO_CHAR(SALARY, 'L999,999,999')  AS 봉급,
DECODE(JOB_ID, 'J7', SALARY*1.1, 'J6', SALARY*1.15, 'J5', SALARY*1.2, SALARY*1.05) AS 인상급여
FROM EMPLOYEE;
```

--------------------------------------------------------------------------------------------------------

#### Q11) DECOD 함수와 유사한  ASSI 표준구문

 CASE expr WHEN search1  THEN result1 [WHEN...THEN...][ELSE default ] END
CASE expr WHEN condition  THEN result1 [WHEN...THEN...][ELSE default ] END


--------------------------------------------------------------------------------------------------------

#### Q10) 사원의 이름과 직업, 봉급, 인상급여를 별칭으로 출력하자.

단, 인상급여는 DECODE를 이용해서 잡의 ID가 J7이면 봉급의 1.1, J6이면 봉급의 1.15, J5면 봉급의 1.2를 나머지는 1.05를 인상하자.

```
SELECT EMP_NAME AS "사원의이름", JOB_ID AS "직업",
TO_CHAR(SALARY, 'L999,999,999')  AS 봉급,
CASE JOB_ID
WHEN  'J7' THEN SALARY*1.1
WHEN  'J6' THEN SALARY*1.15
WHEN  'J5' THEN SALARY*1.2
ELSE SALARY*1.05 END AS 인상급여
FROM EMPLOYEE;
```

--------------------------------------------------------------------------------------------------------

#### Q11) 사원의 번호와 이름, 구분을 출력 하되 구분은 CASE 문을 이용한다.

구분은 봉급이 300이하면 초급, 400이상이면 중급, 나머지는 고급으로 출력한다.

```
SELECT EMP_NO AS 사원의번호, 
EMP_NAME AS 사원의이름,
SALARY  AS 봉급, 
CASE WHEN SALARY <=300000 THEN '초급'
WHEN SALARY <=4000000 THEN '중급'
ELSE '고급' END AS "구분"
FROM EMPLOYEE;
```

```
SELECT EMP_ID, EMP_NAME AS 이름,
TO_CHAR(SALARY, 'L999,999,999') AS 봉급,
CASE
WHEN SALARY <= 3000000 THEN '초급'
WHEN SALARY <= 4000000 THEN '중급'
ELSE '고급' END AS 구분
FROM EMPLOYEE;
```

--------------------------------------------------------------------------------------------------------

#### Q13) 사원의 이름과 이메일과 ID로 출력하자. 단 ID는 이메일의 ID만 출력하자.

```
COL ID FORMAT A50
SELECT EMP_NAME, EMAIL,  SUBSTR(EMAIL, 1, INSTR(EMAIL, '@')-1) AS ID
FROM EMPLOYEE;
```

--------------------------------------------------------------------------------------------------------

#### Q14) BOUNS_PCT 를 연산하는데 기본 평균, 중복제거 평균, NULL포함 평균을 구해보자.

```
SELECT AVG(BONUS_PCT) "기본 평균", 
AVG(DISTINCT BONUS_PCT) "중복 제거 평균", 
AVG(NVL(BONUS_PCT,0)) "NULL 포함 평균" 
FROM EMPLOYEE;
```

JOIN 

JOIN의 필요성

서로 연관되는 다른 테이블에 존재하는 컬럼들을 한번에 조회하기 위해 사용되는 기법

<img src="https://user-images.githubusercontent.com/56623911/130618923-f3604be9-8cc2-4ab2-8ea1-4898da7b2c91.png" wigth="30%" height="30%">


```
SELECT EMP_NAME, DEPT_NAME
FROM EMPLOYEE E, DEPARTMENT D
WHERE E.DEPT_ID = D.DEPT_ID;

SELECT EMP_NAME, DEPT_NAME , D.DEPT_ID
FROM EMPLOYEE E, DEPARTMENT D
WHERE E.DEPT_ID = D.DEPT_ID; 
```

→ WHERE절 :  테이블의 구분 필요, SELECT 절 : 양쪽 테이블의 컬럼 값은 동일하지만, 문법 상 어떤 테이블이 컬럼값을 표시 할 것인지 구분 필요

 JOIN → ANSI 표준 구문

SELECT

FROM  TABLE1{

      [INNER] JOIN TABLE2 ON (condition1 [AND condition2...])

 [INNER] JOIN TABLE2 USING (column1 [...]) | 

NATURAL [INNER] JOIN TABLE2 |

LEFT | RIGHT | FULL [OUTER] JOIN TABLE2 ON (condition1 [AND condition2...]) |

LEFT | RIGHT | FULL [OUTER] JOIN TABLE2 USING (column1 [...]) | 

CROSS JOIN TABLE2 }

}

WHERE 


--------------------------------------------------------------------------------------------------------

#### Q15) INNER JOIN : 조인 조건으로 사용하는 컬럼 이름이 동일한 경우 사용하는데 NULL, FLASE 값은 출력 되지 않는다.

사원테이블과 부서 테이블에서 사원의 이름과 부서번호와 부서 이름을 출력 해보자.

-ANSI 용
```
SELECT ENAME, DEPTNO, DNAME
FROM EMP 
INNER JOIN DEPT USING(DEPTNO);
```
```
SELECT ENAME, DEPTNO, DNAME
FROM EMP 
JOIN DEPT USING(DEPTNO);
```

EX) EMP =  DEPTNO, DEPT = NO

```
SELECT ENAME, DEPTNO, DNAME
FROM EMP 
           INNER JOIN DEPT ON(DEPTNO = NO);
```

Oracle
```
 SELECT ENAME, D.DEPTNO, DNAME
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO;
```

--------------------------------------------------------------------------------------------------------

### Q16) 두개의 컬럼을 USING으로 INNER JOIN 할 수 있다.
```
SELECT EMP_NAME, LOC_ID
FROM EMPLOYEE2
JOIN DEPARTMENT USING(DEPT_ID, LOC_ID);
```

--------------------------------------------------------------------------------------------------------

#### Q17) JOIN조건으로 사용하는 컬럼 이름이 서로 다른 경우 사용할 수 있다. (ON)
```
COL LOC_DESCRIBE FROMAT A20
```
-ANSI
```
SELECT DEPT_NAME, LOC_DESCRIBE
FROM DEPARTMENT
JOIN LOCATION ON(LOC_ID = LOCATION_ID);
```
-Oracle
```
SELECT DEPT_NAME, LOC_DESCRIBE
FROM DEPARTMENT 
WHERE LOC_ID = LOCATION_ID;
```
--------------------------------------------------------------------------------------------------------
#### Q18) OUTER JOIN : 주 테이블의 내용은 모두 출력 되고 종 테이블의 있는 내용은 TURE만 출력된다.
```
CREATE TABLE X(
X1 NUMBER,
X2 NUMBER);
```
```
CREATE TABLE Z(
Z1 NUMBER,
Z2 NUMBER);
```
```
INSERT INTO X VALUES(1,111);
INSERT INTO X VALUES(2,333);
INSERT INTO X VALUES(3,444);
INSERT INTO X VALUES(4,555);

INSERT INTO Z VALUES(111,2);
INSERT INTO Z VALUES(222,3);
INSERT INTO Z VALUES(444,4);
INSERT INTO Z VALUES(NULL,NULL);
```

<img src="https://user-images.githubusercontent.com/56623911/130618948-4362a7cb-a679-4e54-b6f4-0b4f95b80747.png" wigth="30%" height="30%" >

--------------------------------------------------------------------------------------------------------
#### Q19) 주종 관계 테이블 형식에서 주 테이블의 있는 내용은 다 출력 되고 종 테이블에 있는 값은

TRUE인 값만 출력된다.

-ANSI
```
SELECT *
FROM X OUTER JOIN Z ON(X2 = Z1);
```
```
SELECT *
FROM X  LEFT OUTER JOIN Z ON(X2 = Z1);
```
```
SELECT *
FROM X  RIGHT OUTER JOIN Z ON(X2 = Z1);
```

Oracle (+) 주종 관계에서 종 테이블의 컬럼에 (+)를 지정한다.

```
SELECT *
FROM X,Z
WHERE X.X2 = Z.Z1(+);
```
```
SELECT *
FROM X,Z
WHERE X.X2(+) = Z.Z1;
```
--------------------------------------------------------------------------------------------------------
### Q20) FULL OUTER JOIN
```
SELECT *
FROM X FULL JOIN Z ON(X2=Z1);
```
--------------------------------------------------------------------------------------------------------
#### Q21) CROSS JOIN  : 모든 조합의 결과를 리턴

-ANSI
```
SELECT * 
FROM X CROSS JOIN Z;
```
```
SELECT EMPNO, ENAME, DNAME
FROM EMP CROSS JOIN DEPT;
```
-ORACLE
```
SELECT * 
FROM X,Z;
```
```
SELECT EMPNO, ENAME, DNAME
FROM EMP, DEPT;
```
--------------------------------------------------------------------------------------------------------
#### Q22) JOIN - Non - EQUIJOIN : 컬럼값이 같은 경우가 아닌 범위에 속하는 지의 여부를 확인하는 조인

사원의 이름과 봉급, 등급을 출력해보자.

-ANSI
```
SELECT ENAME, SAL, GRADE
FROM EMP JOIN
SALGRADE ON(SAL BETWEEN LOSAL AND HISAL); 
```
-ORACL
```
SELECT ENAME, SAL, GRADE
FROM EMP, SALGRADE
WHERE SAL BETWEEN LOSAL AND HISAL ;
```
--------------------------------------------------------------------------------------------------------
#### Q23) SELF JOIN : 하나의 테이블을 두 번 조인하는 유형

방법 : 하나의 테이블을 두개로 별칭을 선언해서 사용한다.

사원테이블의 사원 번호와 관리자 번호를 이용해서 직원, 관리자라는 별칭으로 출력해보자.
```
SELECT E.ENAME AS 직원,
M.ENAME AS 관리자
FROM EMP E 
LEFT JOIN EMP M ON(E.MGR = M.EMPNO);
```
