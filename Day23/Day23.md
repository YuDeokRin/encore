# Day23
## 2021.08.23



### 오늘 학습 목표
1) 오라클의 쿼리를 정리하자.

2) 총계연산을 구할 수 있다.

3) 함수를 살펴보고 활용할 수 있다.



--------------------------------------------------------------------------------------------------

### - EXTRACT함수

 EXTRACT는 날짜 시간 또는 간격 표현식에서 지정된 날짜 시간 필드의 값을 추출하여 반환합니다. <br>
expr은 요청된 필드와 호환되는 날짜/시간 또는 간격 데이터 유형으로 평가되는 모든 표현식이 될 수 있습니다.<br>

<img src = "https://user-images.githubusercontent.com/56623911/130462688-94df28d6-e890-4527-b9d1-e1e9c76a17e7.png" width="40%" height="30%">

```sql
SELECT ename, EXTRACT(YEAR FROM (SYSDATE - hiredate) YEAR TO MONTH)
       || ' years '
       || EXTRACT(MONTH FROM (SYSDATE - hiredate) YEAR TO MONTH)
       || ' months'  "Interval"
  FROM emp;
```


--------------------------------------------------------------------------------------------
숫자 TO_NUMBER(), 문자 TO_CHAR(), 날짜 TO_DATE()<br>


--------------------------------------------------------------------------------------------
```
구분		INPUT		OUTPUT
1)문자열 함수:	CHARACTER    CHARACTER(LPAD/RPAD/LTRIM, RTRIM, TRIM/ SUBSTR), NUMBER(INSTR/ LENGTH/ LENGTHB...)
2)숫자 함수:	NUMBER	      NUMBER
3)날짜 함수:	DATE	      DATE(SYSDATE, ADD_MONTHS...), NUMBER(MONTH_BETWEEN...)
4)타입변환 함수:	ANY	    ANY(TO_CHAR, TO_DATE, TO_NUMBER...)
```

----------------------------------------------------------------------------------------------


### INSTR(String, substring, [position, [occurrence]])<br>
- 찾는 문자열이 지정된 위치부터 지정한 회수만큼 나타난 시작 위치를 반환하는 함수<br>

<img src = "https://user-images.githubusercontent.com/56623911/130464834-02eb324e-49e6-4bc9-b7fd-c5a70bde8c05.png" width="60%" height="50%">



```
position : 어디서 부터 찾을지를 결정하는 시작 위치(Default 1)
	positiobn > 0 : String의 시작부터 끝 방향을 의미한다.
	positiobn < 0 : String의 끝부터 시작 방향을 의미한다.
```

----------------------------------------------------------------------------------------

--Q1) email 에서 @ABC.COM 문자열에서 "." 바로 앞의 문자 B의 위치를 구해라. <br>
select 'SG_AHN@ABC.COM',  INSTR('SG_AHN@ABC.COM', 'B', -1, 1) 위치 <br>
FROM DUAL;


select 'SG_AHN@ABC.COM',  INSTR('SG_AHN@ABC.COM', INSTR('SG_AHN@ABC.COM', ',')-1) 위치 <br>
FROM DUAL;

----------------------------------------------------------------------------------------

--Q2) EMAIL 에서 @ACC.COM 문자열에서  "." 바로 앞의 문자 C의 위치를 구해라.<br>
select 'SG_AHN@ABC.COM',  INSTR('SG_AHN@ABC.COM', 'C', -1, 2) 위치<br>
FROM DUAL;

----------------------------------------------------------------------------------------

--Q3) 사원테이블에서 LPAD를 이용해서 전체 20 자리를 확보하고 나머지는  *로 채우자. <br>
SELECT ENAME, LPAD(ENAME,20,'*') RES<br>
FROM EMP;<br>

----------------------------------------------------------------------------------------

--Q4) 사원테이블에서 RPAD를 이용해서 전체 20 자리를 확보하고 나머지는  *로 채우자.<br>
SELECT ENAME, RPAD(ENAME,20,'*') RES <br>
FROM EMP;

----------------------------------------------------------------------------------------

--Q5) 해당 문자열의 공백을 지우자.<br>

- TRIM() : 양쪽공백 삭제<br>
- RTRIM() : 오른쪽 공백 및 원하는 글자.<br>
- LTRIM() : 왼쪽 공백 및 원하는 글자.<br>

<img src= "https://user-images.githubusercontent.com/56623911/130465227-c62f376d-82bc-45fa-b638-bfa287cac680.png" width="50%" height="50%"> 

<img src= "https://user-images.githubusercontent.com/56623911/130466438-e3d682fd-5e22-4e34-8dee-684797171637.png" width="50%" height="50%">

<img src= "https://user-images.githubusercontent.com/56623911/130466534-d6f394cc-4110-477c-84b0-a204d7fdbbf0.png" width="50%" height="50%">


SELECT '   ABC '  ,   TRIM('   ABC   '),  RTRIM('     ABC '), LTRIM('  ABC   ')<br>
FROM DUAL;


----------------------------------------------------------------------------------------

--Q6) SELECT LTRIM('   TECH') FROM DUAL;<br>
SELECT LTRIM('       TECH', ' ') FROM DUAL;<br>


SELECT LTRIM('000123', '0') FROM DUAL;<br>
SELECT LTRIM('123123TECH', '123') FROM DUAL;<br>

SELECT LTRIM('123123TECH123', '123') FROM DUAL;<br>
SELECT LTRIM('XYXZYYYTECH', 'XYZ') FROM DUAL;<br>


----------------------------------------------------------------------------------------
--Q7) SELECT TRIM('A' FROM 'AATECHAA') FROM DUAL;<br>
SELECT TRIM(LEADING FROM '  TECH ') FROM DUAL;<br>

SEELCT TRIM(TRAILING '1' FROM  '   TECH1111') FROM DUAL;<br>


----------------------------------------------------------------------------------------

--Q8) SUBSTR(STRING, POSITION, [LENGTH])<br>

- 주어진 컬럼이나 문자열에서 지정한 위치부터 지정한 개수 만큼의 문자열을 잘라내어 리턴하는 검수 <br>

<img src ="https://user-images.githubusercontent.com/56623911/130467283-9e69b9b0-5499-4254-a6a2-9fcd5a0c128f.png" width="50%" height="50%">


	position : 어디서 부터 찾을지를 결정하는 시작 위치 
	positiobn > 0 : String의 시작부터 끝 방향을 의미한다.
	positiobn < 0 : String의 끝부터 시작 방향을 의미한다.

	단, LENGTH < 0 경우 NULL을 리턴한다.


SELECT SUBSTR('This is a tes', 6,2) 
FROM DAUL;<br>

----------------------------------------------------------------------------------------


### - ROUND() 
--Q9) 반올림을 연동해보자.<br>

<img src ="https://user-images.githubusercontent.com/56623911/130468467-b280282f-3662-41ea-a5ec-28041d07758f.png" width="%50" height="50%">

SELECT ROUND(125.315) FROM DUAL;<br>
SELECT ROUND(125.315,0) FROM DUAL;<br>

SELECT ROUND(125.315,1) FROM DUAL;<br>
SELECT ROUND(125.315,-1) FROM DUAL;<br>

----------------------------------------------------------------------------------------

### - TRUNC()
--Q10) 지정한 자릿수에서 버림 하는 함수<br>

<img src ="https://user-images.githubusercontent.com/56623911/130468750-2ef91fe8-c16d-4697-abfb-095c41a28c24.png" width="40%" height="30%">


TRUNC(NUMBER, [INTEGER: decimal_places])<br>

SELECT TRUNC(125.315) FROM DUAL;<br>
SELECT TRUNC(125.315,0) FROM DUAL;<br>

SELECT TRUNC(125.315,1) FROM DUAL;<br>

SELECT TRUNC(125.315,3) FROM DUAL; <br>
SELECT TRUNC(-125.315,-3) FROM DUAL; <br>
SELECT TRUNC(125.315,-3) FROM DUAL; <br>

----------------------------------------------------------------------------------------

--Q11)사원 테이블에서 입사일 기준으로 근무한지 20년이 되는 일자를 출력해보자. ADD_MONTHS<br>
SELECT ENAME HIREDATE, ADD_MONTHS(HIREDATE, 240) FROM EMP;<br>

----------------------------------------------------------------------------------------

--Q12) 지정된 두 날짜 사이의 월 수 를 리턴하는 함수  <br>

<img src = "https://user-images.githubusercontent.com/56623911/130469060-4c46f3be-b627-40fa-977c-808c102e2e05.png" width="40%" height="40%">

MONTH_BETWEEN(DATE1, DATE2)<br>

SELECT MONTHS_BETWEEN('21-09-01','21-08-23') FROM DUAL;<br>

----------------------------------------------------------------------------------------

--Q13) 1980년도 1월 1일을 기준으로 입사한지 15년이 넘은 직원들의 근무 년수를 조회하자 ->MONTHS_BETWEEN<br>

SELECT ENAME, HIREDATE, MONTHS_BETWEEN('80/01/01', HIREDATE)/12 AS 근무년수<br>
FROM EMP<br>
WHERE MONTHS_BETWEEN('80/01/01', HIREDATE)>180;<br>

----------------------------------------------------------------------------------------

--Q14) 현재일을 기준으로 입사한지 20년이 넘은 직원들의 근무 년수를 조회하자.  ->MONTHS_BETWEEN<br>
SELECT ENAME HIREDATE, MONTHS_BETWEEN(SYSDATE, HIREDATE)/12 AS 근무년수<br>
FROM EMP<br>
WHERE MONTHS_BETWEEN(SYSDATE, HIREDATE)>180;<br>

----------------------------------------------------------------------------------------
```
4)타입변환 함수 :  ANY		ANY(TO_NUMBER, TO_CHAR, TO_DATE,)

TO_CHAR (INPUT_TYPE, FORMAT)
-NUMBER타입을 CHARACTER 타입으로 변환이 필요한 경우 EX) 표현 형식을 변경할 때 : 1000 -> 1,000 숫자를 문자로 변경 100-> '100'
-DATE  타입을 CHARACTER 타입으로 변환이 필요한 경우 EX) 21/08/23 -> '21-08-23', 시간정보를 표시하고 싶을 때, HIREDATE = '21/08/23'

9 : 자리수
0 : 남는 자리수
$, L : 통화 기호 
```
----------------------------------------------------------------------------------------

--Q15) TO_CHAR()를 이용해서 숫자를 문자로 변경해 보자.<br>
 
SELECT TO_CHAR(1234, '99999') FROM DUAL;<br>
SELECT TO_CHAR(1234, '09999') FROM DUAL;<br>

SELECT TO_CHAR(1234, 'L99999') FROM DUAL;<br>
SELECT TO_CHAR(1234, '99,999') FROM DUAL;<br>

SELECT TO_CHAR(1234, '09,999') FROM DUAL;<br>
SELECT TO_CHAR(1000, '9.9EEEE') FROM DUAL;<br>
SELECT TO_CHAR(1234, '999') FROM DUAL;<br>

----------------------------------------------------------------------------------------

--Q16)<br>
--YYYY/YY/YEAR : 년도(4자리 , 2자리, 문자)<br>
-- MONTH/MON/MM/RM : 달 (이름/약어/숫자/ 로마 기호 )<br>
--DDD/DD/D : 일 (1년기준 / 1달 기준 / 1주 기준)<br>

-Q : 분기 (1,2,3,4)<br>
-DAY/DY : 요일 (이름/ 약어)<br>
-HH(12)/HH24 : 12시간 / 24시간<br>
-AM|PM : 오전 / 오후<br>
-MI : 분 (0  ~ 59)<br>
-SS : 초 (0 ~ 59)<br>

SELECT TO_CHAR(SYSDATE, 'PM HH24:MI:SS') FROM DUAL;<br>

SELECT TO_CHAR(SYSDATE, 'AM HH:MI:SS') FROM DUAL;<br>

----------------------------------------------------------------------------------------

--Q17) 아래와 같이 오늘 날짜가 출력되도록 해보자.<br>

SELECT TO_CHAR(SYSDATE, 'MON DD, YYYY') FROM DUAL;<br>

8월 월, 2021<br>

----------------------------------------------------------------------------------------


--Q18)  오늘 날짜를 기점으로 분기를 나타내 보자.<br>
SELECT TO_CHAR(SYSDATE, 'year Q') FROM DUAL ;<br>

----------------------------------------------------------------------------------------

--Q19)사원테이블에서 사원의 이름과 입사일을 00년 00월 00일로 출력하도록하자.<br>
SELECT TO_CHAR(HIREDATE, 'YYYY "년" MM "월" DD "일" ')  AS 입사일 FROM EMP;<br>

SELECT ENAME AS 이름, SUBSTR(HIREDATE,1,2)||'년'|| SUBSTR(HIREDATE,4,2,)||'월'|| SUBSTR(HIREDATE,7,2)||'일' AS 입사일 FROM EMP;<br>



