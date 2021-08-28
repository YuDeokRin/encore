# Day26

## 2021.08.26

### 오늘의 학습 목표

1) 툴을 설치하고 계정을 확인 해보자.

2) 서브쿼리 학습을 해보자.

3) 기타등등 


![Untitled](https://user-images.githubusercontent.com/56623911/131220674-14e8b7ca-0688-4dd1-8242-b70e43ff7301.png)


### ROUNUM

ROWNUM 특징
1. where 조건 절이 실행되면서 순차 적으로 할당
2. 할당된 후에는 변경되지 않는다.
3. where 절이 수행되면서 조건을 만족시키는 행에 rownum을 할당한 결과로
1차 ResultSet 을 생성한다.
-ROWNUM 사용- 순번 체크 할 때 사용
1. RONUM 특정 값으로 사용은 불가능
2. where 절이 모두 수행되어야 rownum 이 할당된다.
(특정 rownum 이 할당되기 이전 이므로 실행은 되지만 원하는 결과를 만들 수 없다.)
3. ResultSet의 1st 행(rownum=1)은 선택적으로 가능하다.(명시할 수 있다)

1. 순번을 사용할 때 ROWNUM이 할당되기 전에 미리 정렬을 해야하며
미리 정렬된 결과를 가지고 있도록 하기 위해서 인라인 뷰를 사용한다.(1~3의 특징이 있기 때문이다.)

Q1)EMP  사원 테이블에서 급여를 1 ~ 3위 까지만 출력해보자.

- 1

    SELECT ROWNUM, ENAME, SAL
    FROM (
             SELECT ENAME, SAL
             FROM EMP
             ORDER BY SAL DESC )
    WHERE ROWNUM <= 3 ;   --ROWNUM이 1,2,3 을 리턴한다.

    SELECT ROWNUM, ENAME, SAL
    FROM (
             SELECT  SAL
             FROM EMP
             ORDER BY SAL DESC )
    WHERE ROWNUM <= 3 ;

Q2) EMP 사원 테이블에서 급여를 1 ~ 3위 까지만 출력해보자 

- 1

    SELECT EMPNO, ENAME, SAL
    FROM EMP E1
    WHERE (SELECT COUNT(1)
    FROM EMP E2
    WHERE E1.SAL < E2.SAL )  < 3
    ORDER BY 3 DESC;

Q3) SELECT  ROW_NUMER() OVER(ORDER BY SAL DESC) RNO, SAL FROM EMP;

SELECT ROW_NUMBER() OVER (정렬조건) => ROWNUM과 동일하다.

—사원테이블에서 4등에서 7등까지 순위를 추출하자.

SELECT RNO, ENAME4 AND 7
FROM (  SELECT ENAME, ROW_NUMBER() OVER (ORDER BY SAL DESC) RNO, SAL FROM EMP WHERE RNO BETWEEN 4 AND 7
ORDER BY SAL DESC;
