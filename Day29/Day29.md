# Day29

# Day29

# 2021.09.03

## 1) Transaction 을 이해하고 구현할 수 있다.

## 2) lock 개념을 이해 할 수 있다.

## 3) 오라클의 프로시저를 설계하고 기술 할 수 있다.

## 4) PL/SQL의 구문을 이해하고 기본 문법 및 설계를 학습할 수 있다.

트랜잭션 : 데이터 일관성을 유지 하려는 목적으로 사용하는 논리적으로 연관된 작업들의 집합

- 하나 이상의 연관된 DML 구문
- 하나 이상의 DDL 구문
- 트랜잭션 시작 : 첫번째 DML 구문이 실행될 때 시작됨
- 트랜잭션 종료 :

1) COMMIT/ROLLBACK 명령이 실행될 때 종류

2) DDL 구문이 실행될 때 종료 → AUTO COMMIT

3) SQL*PLUS OR DBSERBER가 비정상적으로 종료될 때  →AUTO ROLLBACK

SQL> INSERT INTO ...;

SQL>UPDATE ...;

SQL> COMMIT;

SQL>UPDATE ...;

SQL> CREATE OR REPLACE VIEW~~;

![Untitled](https://user-images.githubusercontent.com/56623911/132020227-0755ac5a-362d-4f8c-abd9-96f9bf8ae0d8.png)


트랜잭션 제어

COMMIT(저장) : 변경된 데이터(insert, delete, update)를 저장하고 트랜잭션을 종료하는 명령

ROLLBACK(취소) : 변경 작업(insert, delete, update)을 취소하고 트랜잭션을 종료하는 명령

SAVEPOINT savepoint_name : 트랜잭션의 특정 시점을 기록하는 명령

ROLLBACK TO savepoint_name : 지정한 특정 시점으로 데이터 상태를 되돌릴수 있음.


![Untitled 1](https://user-images.githubusercontent.com/56623911/132020476-23c0943c-fd9e-408f-a3ae-18aea7cd39ea.png)


![Untitled 2](https://user-images.githubusercontent.com/56623911/132020487-2cc607dd-55bd-4f5b-b875-90ecf518e567.png)


commit :  변경 내용이 데이터 베이스(파일)에 저장 및 반영 
모든 사용자는 변경된 동일한 결과를 볼 수 있다.
동일한 행에 대해 다른 변경 작업 가능
지금까지 설정된 모든 savepoint는 사라짐

rollback : 데이터이전 상태로 복구
동일한 행에 대해 다른 변경 작업 가능
지금까지 설정한 모든 savepoint는 사라짐

Q1) 트랜잭션과 데이터 상태를 확인 해보자.

ALTER TABLE EMPLOYEE
DISABLE CONSTRAINTS FK_MGRID;

SAVEPOINT S0;

INSERT INTO DEPARTMENT VALUES('40', '기획전략팀', 'A1');

SAVEPOINT S1;
UPDATE EMPLOYEE SET DEPT_ID = '40'
WHERE DEPT_ID IS NULL;
SAVEPOINT S2;
DELETE FROM EMPLOYEE;

---

데이터 타입 /  변수와 상수 / 연산자 /  표준입출력 / 제어문_반복,선택, 분기문/ 함수, 프로시져 _메소드(OOP) /  파일입출력

DECLARE
score01 int :=85;
grade01 varchar2(2);
BEGIN
IF score01 >=90 THEN grade01 := 'A';
ELSIF score01 >=80 THEN grade01 := 'B';
ELSIF score01 >=70 THEN grade01 := 'C';
ELSIF score01 >=60 THEN grade01 := 'D';
ELSE grade01 := 'F';
END IF;
DBMS_OUTPUT.PUT_LINE('SCORE '||score01||', GRADE = '||grade01);
END;
/

Q4) '홍길동1' 세번 출력하자

DECLARE
       NAME VARCHAR2(10) :='홍길동';
       I       INT :=0;
BEGIN
FOR I IN 1..3 LOOP
DBMS_OUTPUT.PUT_LINE(NAME||I);
END LOOP;
END;

Q5) 테이블을 생성해서 반복적인 쿼리, 자료를 넣어보자.

```sql
CREATE TABLE TEST01(
NO NUMBER(3),
IRUM VARCHAR2(10));

DECLARE
BEGIN
	FOR I IN 1..3 LOOP
			INSERT INTO TEST02 VALUES(I,SYSDATE);
	END LOOP;
END;
```

 

Q6) 구구단, 홀수 단만 출력해보자.

```sql
DECLARE
		TOTAL NUMBER :=0L
BEGIN
	FRO I IN 2..9 LOOP
				IF MOD(1,2) != 0 THEN DBMS_OUTPUT.PUT_LINE(I|| '단');
				FOR I IN 2..9 LOOP
                        TOTAL := I*J
				                DBMS_OUTPUT.PUT_LINE(I || '*' || J || '='|| TOTAL);

									ENDLOOP;
			END IF;
		END LOOP;
END;/
```

Q7) EMP 테이블에서 부서번호 10번인 사원의 평균 급여를 출력하는 익명의 블록을 작성하자.
EX)000 부서의 평균 급여는 00원 입니다.

SELECT AVG(SAL)
FROM EMP 
WHERE DEPTNO = 10
GROUP BY DEPTNO;

```sql

DECLARE
    MY_AVG NUMBER(7,2) := 0;
    MY_DEPTNO NUMBER(7) := 10; --MY_DEPTNO EMP.DEPTNO%TYPE :=10;
BEGIN
    SELECT AVG(SAL) INTO MY_AVG
    FROM EMP
    WHERE DEPTNO = 10
    GROUP BY DEPTNO;
    DBMS_OUTPUT.PUT_LINE ( MY_DEPTNO || '부서의 평균 급여는 ['||MY_AVG||']원입니다');
END;

```

Q8) EMP 테이블에서 20번 부서의 개수, 평균 급여를 구하라
Ex) 000부서의 평균 급여는 00원 이고, 사원의 수는 00명 입니다.

```sql
DECLARE
    MY_AVG NUMBER(7,2) := 0;
    MY_DEPTNO NUMBER(7) := 10; -- MY_DEPTNO EMP.DEPTNO%TYPE := 10;
    MY_COUNT NUMBER(5) := 0;
BEGIN
    SELECT AVG(SAL), COUNT(ENAME) INTO MY_AVG, MY_COUNT
    FROM EMP
    WHERE DEPTNO = MY_DEPTNO
    GROUP BY DEPTNO;
    DBMS_OUTPUT.put_line(MY_DEPTNO||'부서의 평균 급여는'||MY_AVG||'원이고'||' 사원의 수는 '||MY_COUNT||'명입니다.');
END;
```

Q9) ACCEPT : 사용자의 입력 값을 읽어서 변수에 저장하는 키워드

```sql
ACCEPT inputVal prompt '사번입력'
DECLARE
    NAME1 EMP.ENAME%TYPE;

BEGIN
    SELECT ENAME INTO NAME1
    FROM EMP
    WHERE EMPNO = &inputval;
    DBMS_OUTPUT.put_line('현재의 결과 :'||NAME1);
END;
```
