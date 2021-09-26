# Day36

![Untitled](https://user-images.githubusercontent.com/56623911/134811386-bc456232-6b85-4888-81a3-a013f8649e5c.png)

## 2021.09.11

오늘 수업 목표 

분석 함수    
 - RDB 상에서는 칼럼과 칼럼간의 연산, 비교, 연결은 쉬운 반면,
        행과 행간의 관계를 정의하거나, 비교, 연산하는 것을 하나의 SQL문으로 처리 하는 것은
        매우 어려운 문제이므로 이를 해결하기 위한 함수이다.

- 프로그램을 작성하거나, 인라인 뷰를 이용해 복잡한 SQL문을 작성해야 하던 것을
       Analytic Function 을 활용하면 하나의 SQL문으로 쉽게 해결된다.

- SQL 사용자 입장에서는 인라인 뷰 이후 SQL 의 중요한 기능이 추가되었다고 할 수 있으며,
       많은 프로그램이나 튜닝 팁을 대체할 수 있을 것이다.

-Analytic Function 은 다른 함수와는 달리 중첩(nest) 해서 사용하지 못하지만, 서브쿼리에서는 사용할수 있다.

<종류>
   – RANKING FAMILY
  – AGGREGATE FAMILY
  – LEAD/LAG FAMILY
==========================

<< 구문>>
  SELECT   ANALYTIC FUNCTION( )  OVER
          ([PARTITION BY  절]           [ORDER BY 절]            [Windowing 절])
 FROM  테이블명;

-ANALYTIC FUNCTION
     : AVG, COUNT, LAG, LEAD, MAX, MIN, RANK,    RATIO _ TO_ REPORT, ROW _ NUMBER, SUM 등의 함수가 있다.
        argument는 0에서 3개까지 올 수 있다.

-PARTITION BY:  쿼리 결과를 <expr_list>별로 그룹핑한다. 생략시에는 하나의 그룹으로 묶는다.

-ORDER BY 구문
                    ORDER BY <expr_list> [ASC | DESC NULLS FIRST | LAST ]
                     :  PARTITION BY로묶인 컬럼 그룹내에 있는 행의 검색순서를 나타낸다.
                 ex) Rank()  over (PARTITION BY deptno ORDER BY sal  DESC )

-WINDOWING 구문 :
          ROWS|RANGE [BETWEEN start_point AND end_point | start_point]

   => ROWS는물리적인 단위(ROW위치)이고, RANGE는논리적인 단위(ROW값)이다.

   => START_POINT : 그룹별 시작점을 의미하며, UNBOUNDED  PRECEDING, CURREN ROW,
                           <expr>  PRECEDING | FOLLOWING 이올수 있다.

   => END_POINT : 그룹별 끝점을 의미하며,
             UNBOUNDED FOLLOWING, CURRENT ROW, <expr> PRECEDING | FOLLOWING 이올수 있다.

================================================================
1) Analytic Function <value_expr1> 에는 하나 이상의 컬럼 또는 적합한 표현식이 사용될 수 있다.
     Analytic Function의  아규먼트는 0에서 3개까지 사용 가능하고 *는 COUNT(*)에서만 허용되며
     DISTINCT는 해당 집계 함수가 허용할 때만 지원된다.

2) OVER analytic_clause 해당 함수가 쿼리 결과 집합에 대해 적용되라는 지시어로써
            FROM, WHERE, GROUP BY와  HAVING 이후에 계산되어 진다.
             SELECT 구 또는 ORDER BY 구에 Analytic Function을사용할 수 있다.

  2-1)  PARTITION BY 구 <value_expr2> 에는 하나 이상의 컬럼 또는 적합한 표현식이 사용될 수 있고
        하나 이상의 컬럼 또는 표현식에 의한 그룹으로 쿼리의 결과를 파티션한다.
          생략되면 단일 그룹처럼 쿼리 결과 집합이 처리된다.

  2-2)  ORDER BY 구 <value_expr3> 에는하나 이상의 컬럼 또는 적합한 표현식이 사용될 수 있고
       하나 이상의 컬럼 또는 표현식을 기준으로 파티션 내의 데이터를 정렬한다.
     표현식은 컬럼의 별칭 또는 위치를 나타내는 숫자를 사용할 수 없다.

  2-3)  Windwing 구 Windowing 구의 예약어
   - CURRENT ROW : 윈도우의 시작 위치 또는 마지막 위치가 현재 로우임을 지시하는 예약어
   - UNBOUNDED PRECEDING : 윈도우의 시작 위치가 Partition의 첫 번째 로우임을 지시하는 예약어
   - UNBOUNDED FOLLOWING : 윈도우의 마지막 위치가 Partition의 마지막 로우임을 지시하는 예약

===============================

분석 함수의 장점

1) Query _  speed의 향상 Self-join,  절차적 로직으로 표현한 것을 SQL에서 바로 적용할 수 있도록 하여 join 이나 over head를 줄인다. 

2) 향상된 개발 생산력이 간결한  SQL로 복잡한 분석 작업을 수행 가능하게 하며 유지보수가 간편하다.

3) 이해 및 활용이 용이하고 기존 SQL  syntax 를 그대로 적용한다.( ANSI SQL로 채택)

==================================

Q1)사원번호, 이름 ,  부서번호, 급여, 부서 내에서 급여가 많은 사원부터 순위를 매기자.(RANK 함수 사용)

```sql
SELECT EMPNO, ENAME, DEPTNO, SAL,
			RANK() OVER( PARTITION BY DEPTNO ORDER BY sal desc) "RANK"
FROM EMP;
```

RANK FAMILY : 대상집합에 대해서 특정 컬럼을 기준으로 순위나 등급을 부여한다. 
오름차순, 내림차순 등급을 부여하고 NULL은 순위의 가장 처음 또는 마지막으로 강제 처리된다.
파티션 마다 초기화 되며 순위, 등급은 GROUP BY, CUBE, ROLLUP 시 초기화된다.

RANK()  : 로우 마다 순위를 매기는 함수로 파티션에서 ORDER BY  절에 명시한 대로 정렬한 후 순위를 매긴다. 1부터 시작하고 동일한 값은 동일한 순위로 매기고 그 순위만큼 다음 순위로 건너뛴다.

DENSE_RANK() : 동일한 값의 순위는 상관 없이 1이 증가된 값을 리턴한다.

Q2)사원번호, 이름, 부서번호, 급여, 부서내에서 급여가 많은 사원 부터 순위를 매기자.

```sql
SELECT EMPNO, ENAME, DEPTNO, SAL,
			DENSE_RANK() OVER (PARTITION BY DEPTNO ORDER BY SAL DESC) "RANK"
FROM EMP;
```

Q3) 부서번호가 30번인 사원번호 ,이름, 부서번호, 급여 부서내에서 급여가 많은 사원부터 순위를 매기자.

```sql
SELECT EMPNO, ENAME, DEPTNO, SAL,
					RANK() OVER (PARTITION BY DEPTNO ORDER BY SAL DESC )"RANK"
FROM EMP 
WHERE DEPTNO=30;
```

```sql
SELECT EMPNO, ENAME, DEPTNO, SAL,
					RANK() OVER (ORDER BY SAL DESC )"RANK"
FROM EMP;
```

Q4)누적 분산 정보 함수를 사용해서  20번 부서의 이름, 봉급, 누적 분산 정보를 조회해보자.

```sql
SELECT ENAME, SAL, CUME_DIST() OVER (ORDER BY SAL)
FROM EMP
WHERE DEPTNO = 20;
```

CUME, 누적 분산 정보: PARTITON BY 로 절로 나누어진 그룹 별로 각 ROW를 ORDER BY 순으로 정렬한 후 그룹별로 상대적 위치(누적정보)를 구한다.
상대적 위치는 구하고자 하는 값을 작거나 같은 값을 가진 ROW 수를 그룹내에 전체 ROW수로 나눈 것을 의미하며 결과값의 범위는 0보다 크고 1보다 작거나 같다 .

```sql
SELECT ENAME, SAL, CUME_DIST() OVER (PARTITION  BY DEPTNO ORDER BY SAL )
FROM EMP;

SELECT ENAME, SAL, CUME_DIST() OVER (ORDER BY SAL)
FROM EMP;
```

Q5) 사원의 월급을 기준으로 4등급으로 분류하자.

```sql
SELECT ENAME, SAL, NTILE(4) OVER (ORDER BY SAL)
FROM EMP;

--NTILE(4)를 사용하면 ROW  100가 있으면 25씩  ROW를 나눈다
```

NTILE( ) : PARTITION BY 대신  BUCKET라는 단어로 ( ) 안에 매개변수로 나눈다.

 NTILE(4)를 사용하면 ROW  100가 있으면 25씩  ROW를 나눈다.
근사치로 배분할 경우 남는 값에 대해서 PARTITION을 한개 씩 배분한다.

ex) 103개의 ROW가 있다 → NTILE(5)로 적용한다. 1 ~ 3 까지는 21의 ROW로 나머지는 30개의 ROW 가 들어간다. 

Q6) 사원번호, 사원의 이름, 봉급, 입사일을 출력하되, 입사일 순으로 순버을 매겨보자.

단, 급여가 많은 순으로 순번을 주고 만일에 같은 급여를 받는 경우 입사일이 빠른 순번부터 부여하자.

```sql
SELECT EMPNO, ENAME, SAL, HIREDATE,
ROW_NUMBER() OVER (ORDER BY SAL DESC, HIREDATE ASC) AS "순번"
FROM EMP;
```

WINDOWING 구문을 이용한 함수를 살펴보자.

1) 윈도우 집계유형(Window aggreate Family) : 윈도우 집계 함수는 윈도우를 근간으로 하여 정렬된 로우들의 집합과 각각의 로우들에 대한 집계값을 리턴한다.
집계함수 (SUM, COUNT, MAX, MIN 등)의 파티션에 속하는 로우들의  SLIDING WINDOW에 대한 계산을 수행하기 위한 윈도우 문법을 추가하여 확장한 형태

2) 보고형 집계유형 : 한 집합 레벨에 대한 집계 값과 다른 집합 레벨에 대한 집계 값의  비교를 통해 분석 작업을 하고자 하는 경우 사용한다.

ex) 한 사원의 급여와 해당 부서의 평균 급여를 비교 하고자 하는 경우
그 사원의 급여를 제외한 해당 부서의 평균 급여를 출력하는 경우
보고형 집계 유형은 셀프 조인을 할 필요없이 다른 집합 레벨에 대한 집계값을 계산하여 리턴한다.

Q7) 사원번호, 부서번호, 봉급, 전체 봉급의 합계, 부서별 급여 합계를 구하자.

```sql
SELECT ENAME, DEPTNO, SAL, SUM(SAL) OVER() "TOTAL SAL",
SUM(SAL) OVER (PARTITION BY DEPTNO) "DEPT_SUN"
FROM EMP
```

Q8) 사원이름, 직업, 봉급, 직업별 급여평균, 직업별 최대 급여를 구하자.

```sql
SELECT ENAME, JOB, SAL, AVG(SAL) OVER ()"급여평균",
MAX(SAL) OVER (PARTITION BY JOB)"최대급여"
FROM EMP;
```

---
