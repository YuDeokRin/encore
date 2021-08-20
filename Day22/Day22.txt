# Day22


## 2021.08.20

오늘의 학습 목표
1. 오라클의 기본(단일)쿼리를 구현할 수 있다 .

2.Group by를 통해서 집계 함수를 활용할 수 있다.

3. 오라클이 




-----------------------------------------------------

어제 배운 내용 

별칭, ||(연결 문자형) : VALUE에 DATA의 연결을 유도하는 문자열 키워드, 산술연산 컬럼형식(DATA),NULL 처리 
1) 오라클의 기본 쿼리 구문
SELECT 컬럼리스트[*] AS별칭 , 컬럼 별칭, 칼럼 AS 별칭, 컬럼 AS "별 칭", 컬럼 " 별 칭"
FROM 테이블명...;



계정을 생성할 때
2) SYS -> SYSTEM -> SYSDBA 

3) .sql, .dbf
sql> @".SQL" -> 쿼리 실행

4) 테이블의 구조확인
DESC 테이블명;

5) show user; -> 현재 접속한 계정을 확인

6) SQL> CONNECT TEST/admin1234 -> 다른계정으로 접속

7) 현재 계정으로 생성된 모든 테이블 확인
SQL> SELECT * FROM TAB;

===============================================

Q1) 생서된 모든테이블의 내용을 확인해보자 

Q2) 사원 테이블의 구조를 확인해보자.
DESC EMP;

Q3) 사원테이블의 사원의 이름을 이름,  사원의 봉급을 봉급으로 별칭을 출력
SELECT ENAME 이름, SAL 월급 FROM EMP;

Q4) 사원의 테이블과 부서테이블의 내용을 출력
SELECT * FROM EMP,DEPT;

Q5) 사원의 이름과 부서번호, 부서명을 출력해보자. TABLE = Entity
SELECT ENAME, DEPTNO, DNAME FROM EMP, DEPT;  <- 오류 : ORA-00918: column ambiguously defined

SELECT ENAME, EMP.DEPTNO, DNAME
FROM EMP, DEPT;

*별칭을 주었을때 별칭으로 처리해야한다.

SELECT ENAME, EMP.DEPTNO, DEPT.DNAME
FROM EMP, DEPT;


SELECT ENAME, EMP.DEPTNO, DEPT.DNAME  
FROM EMP, DEPT ;


SELECT E.ENAME, E.DEPTNO, DEPT.DNAME  
FROM EMP E, DEPT ;

SELECT E.ENAME, E.DEPTNO, DEPT.DNAME  
FROM EMP E, DEPT ;


SELECT E.ENAME, EDEPTNO, DEPT.DNAME AS 부서이름
FROM EMP E, DEPT;


------------------------------------------------------------------------------
번외편


Q6) USER_000 형식의 테이블이 있다.   C:\oraclexe\app\oracle\oradata\XE\USERS.DBF
생성된 테이블을 사전테이블에서 확인할 수 있다. USER_TABLES 
구조를 살펴보자.
DESC USER_TABES;

Q7) USER_TABES의 테이블 이름만 출력해보자.
SQL> SELECT TABLE_NAME FROM USER_TABLES;

Q8) USER_TABLES의 테이블의 내용을 보고 테이블의 이름, 상태, 줄번호(NUM_ROWS)를 출력해보자.
SQL> select TABLE_name,STATUS  ,NUM_ROWS from USER_TABLES;

Q9) ROWID, ROWNUM 
테이블 생성 후 데이터를 ROW  단위로 입력할 때 자동으로 생성되는 인덱싱되는 컬럼의 속성값

SQL> SELECT ROWID, ROWNUM FROM EMP;


Q10) 테이블 마다 데이터 무결성[데이터보전]에 해당하는 제약조건이 테이블 생성시 추가 되게 된다.
	DESC USER_CONSTRAINTS -> 제약조건 확인 테이블
SELECT TABLE_NAME, CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS;
	


-다른 사람의 SQL파일을 볼 때

1.구조확인

2. ROW_NUMs

3.Users 확인 제약조건 확인


Q11) 테이블생성을 해보자.

CREATE TABLE USER_NAME( 
  컬럼명 데이터타입 제약조건..
)


CREATE TABLE USER_NAME AS 
  대상테이블

 - CASE 1 : TEST 라는 테이블을 생성해 보자. ID, NAME
	CREATE TABLE TEST(
	ID NUMBER,
	NAME VARCHAR2(10)
	);

 - CASE 2 : TEST01 라는 테이블을 생성해 보자. ID, NAME
	CREATE TABLE TEST01(
	ID NUMBER NOT NULL,
	NAME VARCHAR2(10)
	);

 - CASE 3: TEST02 라는 테이블을 생성해 보자. ID, NAME, HIREDATE
	CREATE TABLE TEST02(
	ID NUMBER,NOT NULL,
	NAME VARCHAR2(10)
	HIREDATE DATE
	);


 - CASE 4:
	CREATE TABLE TEST03
	AS
	SELECT * FROM EMP;


 - CASE 5:
	CREATE TABLE TEST04(ENAME, SAL)
	AS
	SELECT ENAME, SAL FROM EMP;


 - CASE 6:
	CREATE TABLE TEST05(MYNAME, MYSAL)
	AS
	SELECT ENAME, SAL FROM EMP;



 - CASE 7: 데이터없이 EMP 테이블의 구조만 동일하게 테이블이 생성된다.

	CREATE TABLE TEST06
	AS
	SELECT * FROM EMP
	WHERE 1=0;


Q12)테이블 삭제 DROM 테이블명;
생성된 TEST시리즈 테이블을 모두 삭제한다.

Q13) 휴지통을 확인하자.
SQL> DESC RECYCLEBIN;

SQL> SELECT OBJECT_NAME, ORIGINAL_NAME, TS_NAME FROM RECYCLEBIN;
-----------------------------------------------------------
Q14) TEST 계정으로 접속한다.
 CONNECT TEST/admin1234


Q15) 컬럼의 내용을 표시할 떄 중복데이터 배제하고 단일데이터만 출력하자.
    - DISTINCT 컬럼명
 SELECT DISTINCT JOB
 FROM EMP;

Q16) 조건에 맞는 데이터를 찾을 때 사용하는 쿼리문 
SELECT 컬럼리스트
FROM 테이블
WHERE 조건문 ; -> 조건문의 결과는 TRUE가 되어야한다. 

사원테이블에서 사원의 봉급이 1000원 이상인 사원의 이름과 봉급을 출력

SELECT ENAME, SAL FROM EMP WHERE SAL>=1000; 

Q17) 사원데이블에서 부서번호가 10번인 사원의 이름과 부서 번호를 출력하자.
SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = 10;

Q18) 부서번호가 10번이고 월급이 1000 이상인 사원의 이름과 월급을 출력하되 별칭으로 처리
SELECT ENAME "사원의 이름", SAL "월급" 
FROM EMP
 WHERE DEPTNO=10 AND SAL>=1000; 
Q19) 부서번호가 10 또는 20번인 사원의 월급과 부서 번호를 출력하자
SELECT SAL, DEPTNO
FROM EMP
WHERE DEPTNO = 10 OR DEPTNO = 20;

Q20) 사원의 입사 년도가 80년 이후에 입사한 사원의 이름과 입사년도를 출력하자
SELECT ENAME, HIREDATE 입사년도
FROM EMP
WHERE HIREDATE >= '1980/01/01';

SELECT ENAME, HIREDATE
FROM EMP;
WHERE HIREDATE >= '1980-01-01';

SELECT ENAME, HIREDATE
FROM EMP;
WHERE HIREDATE >= '80-01-01';

Q21) TEST 테이블을 생성해서 데이터를 입력해보자. 
CREATE TABLE TEST(
ID NUMBER(4) NOT NULL,
HIREDATE DATE );

DESC TEST;




Q22) TEST 테이블에 데이터 입력해보자. 
ORACLE은 INSERT INTO 테이블명

입력쿼리  : INSERT 테이블명
	VALUES(값,,,);

INSERT INTO 테이블명(컬럼명)
	VALUES(값,,,);

INSERT INTO TEST VALUES(111, SYSDATE);

INSERT INTO TEST VALUES(222, '1980/08/07');
INSERT INTO TEST VALUES(333, '80/08/07');
INSERT INTO TEST VALUES(444, '2080/08/07');
INSERT INTO TEST VALUES(555, '1980-08-07');

Q23) TEST 테이블의 있는 내용을 년도를 4자리로 출력해서 확인해보자.
SQL> SELECT ID, TO_CHAR(HIREDATE, 'YYYY-MM-DD') FROM TEST;
SELECT ID, TO_CHAR(HIREDATE, 'YYYY "년" MM "월" DD "일" ') FROM TEST;


Q23) TEST 테이블의 있는 내용을 년도를 4자리로 출력해서 확인해보자.




=======
문자열 LIKE  %[모든] _[한글자]

'ABCD' LIKE 'A%'


Q24) 사원테이블에서 사원의 이름이 A로 시작하는 사원의 이름을 출력
SELECT ENAME FROM EMP WHERE ENAME LIKE 'A%';

Q25) 사원테이블에서 사원의 이름이 T자가 1개 들어간 사원의 이름을 출력
SELECT ENAME FROM EMP WHERE ENAME LIKE 'T%';
SELECT ENAME FROM EMP WHERE ENAME LIKE '%_T%';

Q26)사원테이블에서 사원의 이름이 L자가 2개 들어간 사원의 이름을 출력
SELECT ENAME FROM EMP WHERE ENAME LIKE '%_L%';

SELECT ENAME FROM EMP WHERE ENAME LIKE '_L%';





Q27) 사원테이블에서 사원의 이름이 S자로 끝나는 사원의 이름을 출력
SELECT ENAME FROM EMP WHERE ENAME LIKE '%_%S';


Q28) 
 CARATE TEABLE TEST01(
 ENAME VARCHAR2(10));

 INSERT INTO TEST01 VALUES('A_111');
 INSERT INTO TEST01 VALUES('B1%1');
 INSERT INTO TEST01 VALUES('C1%1');
 INSERT INTO TEST01 VALUES('D11_1');
   


SELECT ENAME FROM TEST01 WHERE ENAME LIKE '%A^_1%' ESCAPE '^';
    
SELECT ENAME FROM TEST01 WHERE ENAME LIKE '%*%%' ESCAPE '*';



-----------------------------------------------------

SELECT 결과의 정렬을 구현하기 위한 쿼리

SELECT 컬럼1, 컬럼2, 컬럼3...
FROM 테이블명
OBDER BY 컬럼1 [DESC | ASC(DEFAULT)],
ASC - 오름차순
DESC - 내림차순


Q29)사원의 테이블에서 사원의 이름을 오름차순으로 출력

SELECT ENAME
FROM EMP
ORDER BY ENAME;

SELECT ENAME
FROM EMP
ORDER BY ENAME ASC;  


SELECT ROWID, ROWNUM, ENAME
FROM EMP
ORDER BY ENAME ASC;  



SELECT ROWID, ROWNUM, ENAME 
RROM EMP 
ORDER BY ENAME ASC;


-확인
SELECT ROWID, ROWNUM, ENAME 
FROM EMP
WHERE ENAME='KING';

-CREATE AS ~ EMP 테이블을 생성할 경우 
 
CREATE TABLE MY_EMP
AS
SELECT ENAME, SAL, COMM FROM EMP;

Q30) 사원테이블에서 사원의 이름을 내림차순으로 출력
SELECT ENAME 
FROM EMP
ORDER BY ENAME DESC;

Q31) 사원테이블에서 사원의 이름을 오름차순으로 구현하고 봉급을 내림차순으로 출력
SELECT ENAME SAL
FROM EMP
ORDER BY 1, SAL DESC;

---------------------------------------------------------------------------
숫자함수, 문자함수, 날짜함수 => TO_NUMBER(), TO_CHAR();, TO_DATE();
집계함수(분석함수) => GROUP BY 퀴리용 사용

==============================================================================

Q32) 사원테이블의 봉급을 이용해서 간단한 집계 함수를 확인해보자
간단한 집계함수를 확인해보자.
SELECT COUNT(SAL),SUM(AML), AVG(SAL), MAX(SAL), MEDIAN(SAL)
FROM EMP; 





Q33) 사원테이블과 평균 월급을 구하여라

Q34) 사원테이블에서 부서번호가 10번의 사원의 평균 월급을 구하자

SELECT AVG(SAL)
FROM EMP
WHERE DEPTNO = 10;


Q35) 직업이 SALESMAN 사원의 평균 월급과 합을 구해라
SELECT AVG(SAL), SUM(SAL)
FROM EMP
WHERE JOB = 'SALESMAN';

Q36) 부서별 평균 월급을 구해라 = GROUP BY
SELECT AVG(SAL)
FROM EMP
GROUP BY DEPTNO;

Q37) 직업별 평균 월급을 구해라 = GROUP BY
SELECT JOB, AVG(JOB)
FROM EMP
GROUP BY JOB;


Q38) 부서별 평균 월급을 구하되 10번 부서만 출력해보자 = GROUP BY
SELECT DEPTNO, AVG(SAL)
FROM EMP
WHERE DEPTNO = 10
GROUP BY DEPTNO;

Q39) 직업별 월급의 합을 구해라 = GROUP BY

SELECT JOB, SUM(JOB)
FROM EMP
GROUP BY JOB;



Q40) 직업이 SALESMAN인 사원들 중에서 최대 월급을 구하자.
SELECT JOB, MAX(SAL), DEPTNO
FROM EMP
WHERER JOB = 'SALESMAN'
GROUP BY JOB, DEPTNO;

GROUP BY의 특징
1) GROUP BY 문 다음에는 데이터를 구분 짓기 위한 표현식으로 해당 테이블의 컬럼 명이나 변수 값 등이 올 수 있으며,
그룹함수를 사용한 형태는 올 수 없다 <GROUP BY AVG(SAL)안됨 >

2)SLECT ~ LIST 에는 GROUP BY  문에 명시된 표현식과 그 외 그룹함수를 사용한 표현식만 올 수 있다.

3)출력된 결과를 정렬하기  위해 ORDER BY 문을 사용한다.
단, ORDER BY문 다음에는 SELECT ~ LIST 에서 명시된 컬럼 또는 표현식과 컬럼의 별칭 , 컬럼 번호등만 사용된다.

SQL> SELECT DEPTNO, AVG(SAL) FROM EMP GROUP BY DEPTNO ODER BY 1;

-----------------------------------------------------------------------------

IS [NOT] NULL 
Q41) 사원테이블에서 커미션을 책정되어 있는 사원의 이름과 커미션을 출력하자
SELECT ENAME, COMM FROM EMP WHERE COMM IS NOT NULL ;

Q42)사원테이블에서 커미션을 책정 안된 사원의 이름과 커미션을 출력하자
SELECT ENAME, COMM FROM EMP WHERE COMM IS NOT NULL ;

-----------------------------------------------------------------------

HAVING  - GROUP BY 로 집계된 데이터에 조건을 줄 때 사용되는 쿼리문 
	- 연산자는 GROUP BY 연산에 의해서 나누어진 데이터들을 다시 걸러주기 위해 사용한다.
	- 제 2의 조건 문이라고도 부르며 조건문에서 그룹함수가 사용이 가능하다.
	- HAVING 문 다음에는 SELECT ~ LIST 에서 사용한 컬럼과 그룹함수를 사용한 컬럼에 대해서만 조건을 사용할 수 있다.

실행 순서
SELECT ------------5 
FROM --------------1
WHERE -------------2
GROUP BY ----------3
HAVING ------------4
ORDER BY ----------6


Q43) 직업별 전체 급여를 구하고 월급의 합이 3500 이상인 것만 출력해라.

SELECT JOB, SUM(SAL) FROM EMP GROUP BY JOB HAVING SUM(SAL) >=3500;

Q44) 부서별 월급의 합을 구하고 그 합이 8000 이상인 것만 출력
SELECT DEPTNO, SUM(SAL)
FROM EMP
GROUP BY DEPTNO
HAVING SUM(SAL) >= 8000;
==========================================================================
