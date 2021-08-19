#Day21

#Oracle 

## 오늘의 수업 목표 

https://www.oracle.com/kr/database/technologies/oracle-database-software-downloads.html


1. 오라클 설치를 할 수 있다.


2. 오라클의 기본(단일)  쿼리를 구현 할 수 있다
	SELECT
	FROM
	WHERE
	HAVING
	GROUP BY
	ORDER BY
	


3.DML, DCL(DDL), TCL를 구분할 수 있다.


파일설명
C:\oraclexe\app\oracle
1. admin : 계정관리<DB>, DB 복원관리 등에 대한 Database연동에 대한 정보를 저장

2. diag : log파일 / 설정파일

3. fast_recovery_area : 복원정보 설정 / log 파일

4. oradata : sys, system, sysdba, user_계정으로 구현되는 정보를 테이블로 생성해서 데이터베이스로 저장된 것 
=>	.sql  (CRUD 명령을 기록하는 파일 )
	.dbf (생성된 테이블과 data를 논리적, 물리적으로 저장되는 곳)

5.product : 실행되는 오라클의 프로그램 
*service name's id = SID = XE


C:\oraclexe\app\oracle\oradata\XE

CONTROL.DBF
SYSAUX.DBF
SYSTEM.DBF
TEMP.DBF
UNDOTBS1.DBF
USERS.DBF



-----------------------------------------

C:\oraclexe\app\oracle\product\11.2.0\server

/Test
	.html
	.css
	.js
	.pnp etc .... -> 정적페이지

	.jsp
	.asp
	.php
	.aspx ------------> 동적페이지

=> 웹프로젝트에 대한 서버 기능 + 컨텍스트 구현 및 페이지를 브라우저로 연동

Winodw (=Server) + WAS (IIS = HTTP)
Oracle (=Server)  + WAS(Tomcat = HTTP)




plsql ->오라클 쿼리문으로 작성되는 프로그램 라이브러리

sqlplus -> 클라이언트 컴포넌트 중에 하나의 툴 








==================================================
1)자바의 식별자 생성 규칙과 동일하다 단 명령구문 대소문자 구분하지 않는다.
2)단 명령구문은 대소문자 구분하지 않는다.
3)VALUE는 대소문자를 명확하게 구분한다.

------------------------------------
- SELECT ~ FROM 명령문
FROM
WHERE
HAVING
GROUP BY
ORDER BY
-----------------------------------------------


SELECT 컬럼명[*],[별칭]...
FROM 테이블

Q1)sql확장자 파일을 실행 시키는 방법

C:\Users\Deok>sqlplus / as sysdba

SQL> @"C:\Users\Deok\Desktop\scott.sql"
SQL> EXIT



Q2) 생성된 전체 테이블의 보는 방법
SQL> SELECT * FROM TAB;



Q3) 대상 테이블의 내용을 확인하자.
SELECT *
FROM EMP;

Q4) DEPT 테이블의 내용을 확인하자
SQL>DESCRIBE EMP;
EMPNO : 사원 번호 
ENAME : 사원 이름
JOB   : 직업
MGR   : 관리자의 사원번호
HIREDATE : 입사일
SAL   : 월급
COMM  : 커미션
DEPTNO : 부서번호




Q5) BONUS 테이블의 내용을 확인하자.



Q6) 테이블의 구조를 확인하자.
DESC 테이블명;




숫자(NUMBER)(자리수, 소수이하 자리수)
문자 CHAR
문자열 VARCHAR 2000 VARCHAR 4000



Q7) 사원테이블의 사원의 이름과 사원의 번호, 봉급을 출력하자.
SELECT ENAME, EMPNO, SAL
FROM EMP;

Q8)사원의 이름과 입사일을 출력해보자.
SELECT ENAME, HIREDATE
FROM EMP:
Q9)사원의 이름과 매니져 부서번호를 출력해보자
SELECT ENAME, MGR, DEPTONO
FROM EMP:
Q10)사원의 이름과 입사일 커미션을 출력해보자.
SELECT ENAME, HIREDATE, COMM
FROM EMP;

Q11)
SELECT 컬럼명 별칭, 컬럼명 AS 별칭, 컬럼명 AS "별  칭" 
FROM 테이블명; 


사원의 이름과 입사일 커미션을 출력해보자. 단 문제내용의 컬럼명을 동일하게 한글로 표시해라

SELECT ENAME "사원의 이름 ", HIREDATE입사일, COMM AS커미션
FROM EMP;


Q12) 연결문자열 ||
SELECT ENAME||'님'
FROM EMP;

Q13)연결문자열 ||
SELECT ENAME||'님' AS "사원의 이름"
FROM EMP; 

Q14) 00님은 00일에 입사를 하고 00 월급을 받는다.
SELECT ENAME "사원의 이름 ", HIREDATE입사일, COMM AS커미션
    FROM EMP;

Q15) 사칙연산을 컬럼연산으로 구현할 수 있다.
사원의 테이블에서 사원의 이름과 연봉을 구해라.

SELECT ENAME, SAL,SAL *12  as 연봉
FROM EMP;

Q16) 사원의 이름, 봉급, 커미션, 연봉을 구하되 다음과 같이 연봉을 구한다.
-> 연봉 =(봉급*12) - 커미션
-> 별칭도 문제의 한글 컬럼 속성과 같이 출력한다.


select ename 사원의이름, sal 봉급, comm 커미션, (sal *12)-nvl(comm,0) 연봉
  2  from emp;


Q17)사원의 테이블에서 사원의 이름과 매니저를 출력하되 매니저가 없으면 없다고라고 출력하자.
select ename 사원의이름, nvl(To_CHAR(mgr),'없음') from emp;





Q16) 사원의 이름, 봉급, 커미션, 연봉을 구하되 다음과 같이 연봉을 구한다.
 	값이 null일 경우에 연봉으로 채워라 

NVL2로 연산해보자 
select ename, sal, comm, nvl2(comm, (sal *12)- comm, sal*12) from emp;