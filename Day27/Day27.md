# Day27

## 2021. 09. 01

### 1. DDL  ( Data Definition Language)을 구현하고 활용하자.

### 2. 테이블(Table), 뷰(View), 시퀀스 (Sequence), 인덱스 (Index)  등을 구현하고 활용할 수 있다.

### 3. 데이터 저장 하는 테이블을 생성할 수 있다.

### 4. 테이블 구조를 변경할 수 있다.

### 5. 제약조건(Constraints) 을 사용해서 데이터 무결성(Data intergrity)을 보장할 수 있다.

### 1. 테이블 생성

[기본 구문]

 CREATE TABLE TABLE_NAME

( column_name data_type [DEFAULT] expr] [column_constraint]...

[table_constraint...] ) ;

- column_constraint

    [CONSTRAINT constraint_name] constraint_type

- table_constraint

      [CONSTRATINT constraint_name] constraint_type (column_name ...)

[구문셜명]

DEFAULT  expr  : 해당 컬럼에 적용될 자동 기본 값

CONSTRAINTS 

- column_constraint (컬럼 레벨에서의 제약 조건)
- table_constraint ( 테이블 레벨에서의 제약조건)

2) Naming Rule

- 테이블, 컬럼 명 : 문자로 시작,  30자 이하, 영문 대/소문자( A  ~ Z, a ~ z), 숫자(0~9)
특수문자 ( _, $, #) 한글만 포함 가능(사용 하지 않는다).
- 중복되는 이름은 사용할 수 없다.
- 예약어 사용할 수 없다.

3) CARATE TABLE TEST(

ID NUMBER(5),

NAME CHAR(10),

ADDRESS VARCHAR2(2)

);

```sql
CREATE TABLE ORDERS(
ORDERNO CHAR(4),
CUSTNO CHAR(4),ORDERDATE DATE DEFAULT SYSDATE,
SHIPDATE DATE,
SHIPADDRESS VARCHAR2(40),
QUANTITY NUMBER)
```

 

4) 제약조건

- 데이터 무결성 : 데이터베이스에 저장되어 있는 데이터가 손상되거나 원래의 의미를 잃지 않고 유지하는 상태
- 데이터 무결성 제약조건 : 데이터의 무결성을 보장하기 위해 오라클에서 지원하는 방법
Ex) 유효하지 않는 데이터 입력 방지, 유효한 범위에서만 데이터 변경/ 삭제 작업 허용

5) 종류 

- NOT NULL : 해당 컬럼에 NULL을 포함하지 않도록 함
- UNIQUE : 해당컬럼 또는 컬럼 조합 값이 유일하도록 함
- PRIMARY KEY : 각 행을 유일하게 식별할 수 있도록 함
[PRIMARY KEY = NOT NULL + UNIQUE]
- REFERENCES table (column_name) :  해당 컬럼이 참조 하고 있는 테이블 ( 주테이블 = 부모테이블)의 특정 컬럼값들과 일치 하거나 또는 NULL이 되도록 보장함
- CHECK : 해당 컬럼에 특정 조건을 항상 만족 시키도록 함 ( 컬럼, 테이블)

6) 제약조건 특징

- 이름으로 관리된다 : 문자로 시작, 길이는 30자 , 이름을 지정하지 않으면 자동생성
EX) SYS_C0000000 형식
- 생성시기 : 테이블 생성과 동시, 테이블을 생성한 후 (제약조건 추가)
- 컬럼 레벨 또는 테이블 레벨에서의 정의 ( 단, NOT NULL 은 컬럼 레벨에서만 사용가능하다)
- 컬럼 여러 개를 조합하는 경우에는 '테이블 레벨' 에서만 가능하다.

---

Q1) NOT NULL을 확인 해보자.

CREATE TABLE TABLE_NOTNULL
( ID CHAR(3) NOT NULL,
SNAME VARCHAR2(20));
INSERT INTO TABLE_NOTNULL VALUES('100', 'ORACLE');
INSERT INTO TABLE_NOTNULL VALUES(NULL, 'ORACLE');

```sql
SQL> SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
2  FROM USER_CONSTRAINTS
3  WHERE TABLE_NAME ='TABLE_NOTNULL';

CONSTRAINT_NAME                                              CO

---------------------------------------------------------------
SYS_C007069                                                   C
```

Q2) NOT NULL 을 확인 해보자.

CREATE TABLE TABLE_NOTNULL2
( ID CHAR(3),
SNAME VARCHAR2(20),
CONSTRAINT TN2_ID_NN NOT NULL(ID) );

Q3) UNIQUE을 확인해보자. _단일컬럼

CREATE TABLE TABLE_UNIQUE
( ID CHAR(3) UNIQUE,
SNAME VARCHAR2(20));

INSERT INTO TABLE_UNIQUE VALUES('100', 'ORACLE');
INSERT INTO TABLE_UNIQUE VALUES('100', 'ORACLE');

ORA-00001: unique constraint (TEST.SYS_C007070) violated : 'ID' 컬럼에 중복 값을 입력하라고 했기 때문에 발생 

Q4) 제약 조건 테이블을 확인 하자.

DESC USER_CONSTRAINTS

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS
WHERE TABLE_NAME ='TABLE_UNIQUE';

```sql
SQL> SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
  2  FROM USER_CONSTRAINTS
  3  WHERE TABLE_NAME ='TABLE_UNIQUE';

CONSTRAINT_NAME                                              CO
------------------------------------------------------------ --
SYS_C007070                                                  U
```

5) EMP 테이블의 제약 조건 을 확인 해보자 .

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS
WHERE TABLE_NAME ='EMP';

```sql
SQL> SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
  2  FROM USER_CONSTRAINTS
  3  WHERE TABLE_NAME ='EMP';

CONSTRAINT_NAME                                              CO
------------------------------------------------------------ --
PK_EMP                                                       P
FK_DEPTNO                                                    R
```

Q6) UNIQUE(식별값: 중복데이터 허용 불가, NULL) 을 확인해보자. _조합 컬럼 = 테이블 레벨

CREATE TABLE TABLE_UNIQUE2
( ID CHAR(3),
SNAME VARCHAR2(20),
SCODE CHAR(2),
CONSTRAINT TN2_ID_UN UNIQUE(ID, SNAME));

INTSERT INTO TABLE_UNIQUE2 VALUES('100', 'ORACLE', '01');
INTSERT INTO TABLE_UNIQUE2 VALUES('200', 'ORACLE', '01');

INTSERT INTO TABLE_UNIQUE2 VALUES('100', 'ORACLE', '02');

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS
WHERE TABLE_NAME = 'TABLE_UNIQUE2';

Q7) UNIQUE (식별값 :  중복데이터 허용 불가, NULL)을 확인해보자. 

NULL은 무한정 허용한다.

CREATE TABLE TABLE_UNIQUE3
(ID CHAR(3) UNIQUE,
SNAME VARCHAR2(20) UNIQUE,
SCODE CHAR(2));

INSERT INTO TABLE_UNIQUE3 VALUES('100', 'ORACLE', '01');

INSERT INTO TABLE_UNIQUE3 VALUES('200', 'ORACLE', '01');

ERROR at line 1:
ORA-00001: unique constraint (TEST.SYS_C007073) violated

 : 'ID'컬럼과 'SNAME'컬럼에 각각 제약조건이 설정 되었기 때문에, 중복된 'SNAME'  컬럼값이 입력될 수 없음 만일에 두 컬럼의 조합 결과를 유일하게 하려면 '테이블 레벨'에서 생성되어야 한다.

INSERT INTO TABLE_UNIQUE3(SCODE) VALUES('10');

Q8) UNIQUE (식별값 :  중복데이터 허용 불가, NULL)을 확인해보자. 

NULL은 무한정 허용한다.

CREATE TABLE TABLE_UNIQUE3
(ID CHAR(3) CONSTRAINT TNM4_ID_UN UNIQUE,
SNAME VARCHAR2(20) CONSTRAINT
SCODE CHAR(2));

```sql
SQL> SELECT * FROM TABLE_UNIQUE3;

ID     SNAME                                    SCOD
------ ---------------------------------------- ----
100    ORACLE                                   01
                                                10
                                                10
                                                10
```

Q9) PRIMARY KEY = UNIQUE + NOT NULL , 테이블 당 1개만 생성

CREATE TABLE TABLE_PK
( ID CHAR(3) PRIMARY KEY,
SNAME VARCHAR2(20));

INSERT INTO TABLE_PK VALUES('100', 'ORACLE');

INSERT INTO TABLE_PK VALUES('100', 'ORACLE'); → X

INSERT INTO TABLE_PK VALUES(NULL, 'ORACLE'); →X

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS
WHERE TABLE_NAME =  ' TABLE_PK';

Q10)  PRIMARY KEY = UNIQUE + NOT NULL , 테이블 당 1개만 생성

 CREATE TABLE TABLE_PK2
( ID CHAR(3) ,
SNAME VARCHAR2(20),
SCODE CHAR(2),
CONSTRAINT TP2_PK PRIMARY KEY(ID, SNAME));

INSERT INTO TABLE_PK2 VALUES('100', 'ORACLE','02');

INSERT INTO TABLE_PK2 VALUES'100', 'ORACLE','02'); → 중복데이터

INSERT INTO TABLE_PK2 VALUES(NULL, 'ORACLE','02');

→ 조합되는 개별 컬럼에 NULL은 허용되지 않는다.

Q11)  PRIMARY KEY = UNIQUE + NOT NULL , 테이블 당 1개만 생성

 CREATE TABLE TABLE_PK2
( ID CHAR(3)  PRIMARY KEY,
SNAME VARCHAR2(20) PRIMARY KEY,
SCODE CHAR(2));

```sql
SQL> CREATE TABLE TABLE_PK2
  2  ( ID CHAR(3)  PRIMARY KEY,
  3  SNAME VARCHAR2(20) PRIMARY KEY,
  4  SCODE CHAR(2));
SNAME VARCHAR2(20) PRIMARY KEY,
                   *
ERROR at line 3:
ORA-02260: table can have only one primary key
```

Q12) EMPLOYEE 테이블에서 사원번호, 이름, 부서 아이디를 출력해보자.

SELECT EMP_ID, EMP_NAME, DEPT_ID
FROM EMPLOYEE;

```sql
SQL> SELECT EMP_ID, EMP_NAME, DEPT_ID
  2  FROM EMPLOYEE;

EMP_ID EMP_NAME                                 DEPT
------ ---------------------------------------- ----
100    한선기                                   90
101    강중훈                                   90
102    최만식                                   90
103    정도연                                   60
104    안석규                                   60
107    조재형                                   60
124    정지현                                   50
141    김예수                                   50
143    나승원                                   50
144    김순이                                   50
149    성해교                                   50

EMP_ID EMP_NAME                                 DEPT
------ ---------------------------------------- ----
174    전우성                                   80
176    엄정하                                   80
178    심하균
200    고승우                                   10
201    박하일                                   50
202    권상후                                   10
205    임영애                                   10
206    염정하
207    김술오                                   20
208    이중기                                   20
210    감우섭                                   20
```

DEPARMENT 테이블에서 부서아이디, 부서명을 출력해보자.

SELECT DEPT_ID, DEPT_NAME
FROM DEPARTMENT;

```sql
SQL> SELECT DEPT_ID, DEPT_NAME
  2  FROM DEPARTMENT;

DEPT DEPT_NAME
---- ------------------------------------------------------------
20   회계팀
10   본사 인사팀
50   해외영업1팀
60   기술지원팀
80   해외영업2팀
90   해외영업3팀
30   마케팅팀
```

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS
WHERE TABLE_NAME IN('EMPLOYEE', DEPARTMENT');

→ 두 개의 테이블의 참조형을 가진 상태

DEPT_ID → FOREIGN KEY 컬럼

DEPARTMENT 테이블의 DPET_ID  컬럼에 존재 하지 않은 값이 EMPLOYEE에 포함되면 데이터 무결정에 문제가 발생했다라고 판단 후 오류 발생

Q13) FOREIGN KEY : 참조 테이블(주테이블)의 컬럼값과 일치하거나 NULL상태를 유지하도록 하는 제약 조건 

TABLE_FK(종)  테이블생성을 하면서 LOCATION 테이블을 참조하려고 한다.

1. 주테이블의 구조를 확인
2. 주테이블의 제약 조건을 확인
3. 주테이블의 참조 컬럼의 제약 조건이 반드시 PK이어야 한다.

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS
WHERE TABLE_NAME ='LOCATION';

CREATE TABLE TABLE_FK(
ID CHAR(3),
SNAME VARCHAR2(2),
LID CHAR(2) REFERENCES LOCATION ( LOCATION_ID));

—>컬럼 레벨 

CREATE TABLE TABLE_FK(
ID CHAR(3),
SNAME VARCHAR2(2),
LID CHAR(2) REFERENCES LOCATION (LOCATION_ID));

→참조 테이블만 기술하고 참조 컬럼을 생략하면 해당 참조 테이블의 PRIMARY KEY컬럼을 참조하게 된다.

SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
FROM USER_CONSTRAINTS
WHERE TABLE_NAME ='TABLE_FK';

```sql
SQL> SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE
  2  FROM USER_CONSTRAINTS
  3  WHERE TABLE_NAME ='TABLE_FK';

CONSTRAINT_NAME                                              CO
------------------------------------------------------------ --
SYS_C007076                                                  R
```

Q14) FOREIGN KEY 를 이용해서 데이터를 입력해보자.

INSERT INTO TABLE_FK VALUES('200',OR', 'C1');

→ 참조 테이블 LOCATION = 'C1' 값이 없음

Q15) FOREIGN KEY를 이용해서 테이블 레벨에서 생성해보자.
테이블 생성시는 ' FOREIGN KEY' 가 추가된다.

CREATE TABLE TABLE_FK2(
ID CHAR(3),
SNAME VARCHAR2(20),
LID CHAR(2),
FOREIGN KEY (LID) REFERENCES LOCATION(LOCATION_ID) );

CREATE TABLE TABLE_FK3(
ID CHAR(3),
SNAME VARCHAR2(20),
LID CHAR(2),
CONSTRAINT TFK3_MYKEY FOREIGN KEY (LID) REFERENCES LOCATION(LOCATION_ID) );

주의 할 점 :  부모테이블의 컬럼에 PK를 참조하는 것이 원치기안 만일에 명시할 떄는 PRIMARY/ UNIQUE 제약 조건이 설정된 컬럼만 참조가 가능하다.

Q16) 참조 키를 확인 해보자.

CREATE TABLE TABLE_NOPK(
ID CHAR(3),
SNAME VARCHAR2(20));

CREATE TABLE TABLE_FK4(
ID CHAR(3) REFERENCES TABLE_NOPK); → 부모의 PK를 찾는다.

```sql

SQL> CREATE TABLE TABLE_FK4(
  2  ID CHAR(3) REFERENCES TABLE_NOPK);
ID CHAR(3) REFERENCES TABLE_NOPK)
                      *
ERROR at line 2:
ORA-02268: referenced table does not have a primary key
```

CREATE TABLE TABLE_FK4(
ID CHAR(3) REFERENCES TABLE_NOPK(ID));

→부모의 PK를 찾는다, 컬럼명을 명시하게 되면 PK,U 를 찾는다.

```sql
SQL> CREATE TABLE TABLE_FK4(
  2  ID CHAR(3) REFERENCES TABLE_NOPK(ID));
ID CHAR(3) REFERENCES TABLE_NOPK(ID))
                                 *
ERROR at line 2:
ORA-02270: no matching unique or primary key for this column-list
```

Q17) 참조키를 생성할 때 주의할 옵션 - Foreign key : DELETE OPTION

-Foreing key 제약조건을 생성할 때, 참조 컬럼값이 삭제 되는 경우

 Foreing key 컬럼값을 어떻게 처리할 지를 지정하는 옵션
[구문]
1) [Constraint constraint_name] constraint_type ON DELETE SET NULL
참조 컬럼 값이 삭제 될 때, Foreign key 컬럼값을 NULL로 변경

2)[Constraint constraint_name] constraint_type ON DELETE CASCADE
참조 컬럼 값이 삭제 될 때, Foreign key  컬럼값도 함께 삭제

Q18) 참조키 조합 컬럼

CREATE TABLE TABLE_PK2
(ID CHAR(3),
SNAME VARCHAR2(20),
SCOD CHAR(2),
CONSTRAINT TP2_PK PRIMARY KEY (ID, SNAME));

CREATE TABLE TABLE_FK5
(ID CHAR(3),
SNAME VARCHAR2(20),
SCOD CHAR(2),
CONSTRAINT TP2_FK FOREIGN KEY (ID, SNAME) REFERENCES TABLE_PK2); 

INSERT INTO TABLE_FK5 VALUES('100','ORACLE', '03');

INSERT INTO TABLE_FK5 VALUES('NULL','ORACLE', '03');

INSERT INTO TABLE_FK5 VALUES(NULL,NULL, '03');

INSERT INTO TABLE_FK5 VALUES('100',NULL, '03');

Q19) CHECK 제약 조건

CREATE TABLE TABLE_CHECK(
EMP_ID CHAR(3) PRIMARY KEY,
SALARY NUMBER CHECK(SALARY > 0 ),
MARRIAGE CHAR(1),
CONSTRAINT CHK_MRG CHECK(MARRIAGE IN('Y','N') ) );

INSERT INTO TABLE_CHECK VALUES('100', -100, 'Y');

```sql
SQL> INSERT INTO TABLE_CHECK VALUES('100', -100, 'Y');
INSERT INTO TABLE_CHECK VALUES('100', -100, 'Y')
*
ERROR at line 1:
ORA-02290: check constraint (TEST.SYS_C007080) violated
```

INSERT INTO TABLE_CHECK VALUES('100', 100, '?');

```sql
SQL> INSERT INTO TABLE_CHECK VALUES('100', 100, '?');
INSERT INTO TABLE_CHECK VALUES('100', 100, '?')
*
ERROR at line 1:
ORA-02290: check constraint (TEST.CHK_MRG) violated
```

CREATE TABLE TABLE_CHECK02(
EMP_ID CHAR(3) PRIMARY KEY,
SALARY NUMBER CHECK(SALARY > 0 ),
MARRIAGE CHAR(1),
CONSTRAINT CHK_MRG CHECK(MARRIAGE IN('Y','N') ) );

Q20) 서브쿼리를 이용해서 생성 할 수 있다.

CREATE TABLE TABLE_SUBQUERY1
AS
SELECT EMP_ID, EMP_NAME, SALARY, DEPT_NAME, JOB_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT USING(DEPT_ID)
LEFT JOIN JOB USING (JOB_ID);

Q21) 서브쿼리를 이용해서 생성 할 수 있다.(컬럼명 변경 가능)

CREATE TABLE TABLE_SUBQUERY2(EID,ENAME, SAL, DNAME, JTITLE)
AS
SELECT EMP_ID, EMP_NAME, SALARY, DEPT_NAME, JOB_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT USING(DEPT_ID)
LEFT JOIN JOB USING (JOB_ID);

Q21) 서브쿼리를 이용해서 생성 할 수 있다.(테이블 생성시 제약조건을 생성할 수 있다.)

CREATE TABLE TABLE_SUBQUERY2(EID,ENAME, SAL, CHECK(SAL> 2000000),  DNAME, JTITLE)
AS
SELECT EMP_ID, EMP_NAME, SALARY, DEPT_NAME, JOB_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT USING(DEPT_ID)
LEFT JOIN JOB USING(JOB_ID);

Q22) 서브쿼리를 이용해서 생성 할 수 있다.(테이블 생성시 제약조건을 생성할 수 있다.)

CREATE TABLE TABLE_SUBQUERY3(EID, ENAME, SAL CHECK (SAL > 20000000),DNAME, JTITLE DEFAULT 'N/A' NOT NULL)
AS
SELECT EMP_ID, EMP_NAME, SALARY, DEPT_NAME, JOB_TITLE
FROM EMPLOYEE
LEFT JOIN DEPARTMENT USING(DEPT_ID)
LEFT JOIN JOB USING(JOB_ID)
WHERE SALARY > 20000000;

Q23) SELECT CONSTRAINT_TYPE, SEARCH_CONDITION, R_CONSTRAINT_NAME, DELETE_RULE FROM USER_CONSTRAINTS;

Q24) DESC USER_CONS_CONLUMNS 제약조건 확인

SELECT CONSTRAINT_NAME AS 이름,
CONSTRAINT_TYPE AS 유형,
COLUMN_NAME AS 컬럼,
SEARCH_CONDITION AS 내용,
R_CONSTRAINT_NAME AS 참조,
DELETE_RULE AS 삭제규칙
FROM USER_CONSTRAINTS
JOIN USER_CONS_COLUMNS USING(CONSTRAINT_NAME, TABLE_NAME)
WHERE TABLE_NAME = 'EMPLOYEE';

Q25) 테이블 수정

ALTER TABLE table_name
ADD (column_name datatype [default]) |  ADD constraint
MODIFY (column_name datatype [default])
DROP COLUMN column_name [CASCADE CONSTRINTS]

이름 변경 
ALTER TABLE old_table_name RENAME TO new_table_name;
RENAME old_table_name  TO new_table_name;

ALTER TABLE table_name RENAME COLUMN old_column_name TO new_column_name;
ALTER TABLE table_name RENAME CONSTRAINT old_CONST_name TO new_CONST_name;

Q26)  추가되는컬럼은 테이블의 맨 마지막에 위치하며, 생성 위치를 변경할 수 없다.
ALTER TABLE DEPARTMENT
ADD (MGR_ID CHAR(3) );

ALTER TABLE DEPARTMENT
ADD (MGR_ID02 CHAR(3) DEFAULT '101')

Q27) 제약조건 추가하면서 테이블 생성 

CREATE TABLE EMP3
AS
SELECT * FROM EMPLOYEE;

ALTER TABLE EMP3
ADD PRIMARY KEY(EMP_ID)
ADD UNIQUE(EMP_NO)
MODIFY HIRE_DATE NOT NULL;

ALTER TABLE EMP3
ADD PRIMARY KEY(EMP_ID)
ADD UNIQUE(EMP_NO)
ADD HIRE_DATE NOT NULL;

```sql
SQL> ALTER TABLE EMP3
  2  ADD PRIMARY KEY(EMP_ID)
  3  ADD UNIQUE(EMP_NO)
  4  ADD HIRE_DATE NOT NULL;
ADD HIRE_DATE NOT NULL
    *
ERROR at line 4:
ORA-02263: need to specify the datatype for this column
--NOT NULL 은 MODIFY 로 설정해야된다. 
```
