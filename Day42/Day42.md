# Day42

# Java 요약 정리

## 1.자바의 분류

J2SE(Java SE) : Java2 Standard Edition

J2EE(Java EE) : Java2 Enterprise Edition(EJB관련)_분산시스템

J2ME(Java ME) : Java2 Micro Edition(모바일관련)

## 2.자바의 특성

①이식성이 높다<br>
②단순하고 견고한 언어<br>

-C++언어와 비슷한 구문사용<br>

-다중상속, 구조체, 전역변수, 연산자 중복기능등을 제거하여 언어의 복잡성을 제거<br>

- 자동적으로 쓰레기처리<br>
i)메모리포인터를 사용하지 않는다(내부포인터사용)<br>
ii)사용되지않는 메모리를 자동으로 회수<br>

-명시적 선언 및 엄격한 형검사<br>

-예외처리<br>

③완벽한 객체지향 언어이다<br>

-프로그램의 재사용, 생산성향상<br>

-설계 단계부터 객체지향 개념을 고려<br>

④분산환경에 적합한 언어<br>

-TCP/IP 네트워킹 기능을 내장<br>

⑤안전한 언어<br>

-바이트 코드 검증기를 통해 코드를 검증<br>

-Java애플릿이 클라이언트에서 실행될때 사용할수 없는<br>
기능의 리스트가 된다

⑥다중 쓰레드 지원<br>
-다중쓰레드 : 여러개의 작업을 동시에 실행할수 있는 기능<br>
-스레드와 관련된 라이브러리 클래스 제공<br>

⑦동적인 언어<br>
-기존프로그램의 영향을 미치지 않고 라이브러리에 새로운<br>
메소드나 속성을 추가할수 있다<br>

## 3.JVM (Java Virtual Machine)의 메모리

(1)스택 영역 (Runtime Stack) : 실행시 사용하는 메모리 영역<br>
(2)힙 영역 (Garbage Collection Heap) : 동적 메모리 할당 영역<br>
(3)상수 영역 (Constant & Code Segment) : 상수 데이터 및 static 데이터 할당 영역<br>
(4)레지스터 영역 (Process Register) : 프로세서 실행 관련 메모리 할당 영역<br>

## 4.자바의 실행 과정

*.java 파일 -> 컴파일(javac) -> *.class 파일 -> 인터프리터(java) -> 실행 결과 <br>

## $ javac 파일명.확장명 <---- 컴파일
$ java 파일명 <---- 실행

5.사용자 정의 명칭 (클래스, Method, Field) - 식별자
(1)첫 글자는 ‘_’, ‘$’, 영문 대,소문자 (한글 가능)
(2)글자수에 제한 없다.
(3)공백문자 및 특수 문자 사용 불가
(4)숫자는 첫 글자가 아닐 때 사용 가능
(5)예약어 사용 불가
(6)기타 단순 약속 (대, 소문자의 규칙)
int a=10, A=20;  (O)
int _a=100;      (O)
int 100a=15;     (X)
int kor25=100;   (O)
int k g h = 50;  (X)
int System=100;  (X)

### 예약어

:자바언어 자체가 사용하기 위해 예약해 놓은 식별자가 있다
ex)if, for, try, extends.......

ⓐ클래스이름과 파일명은 반드시 동일해야 함
ⓑ컴파일이나 실행할때도 대.소문자를 구별함

1. 변수/상수
(1)변수
기본데이타형변수 / 레퍼런스형변수

※종류가 다른 데이터형의 변환

```
                                  수치형   ----  정수형 (byte, char, short, int)
                                     ↑    ----  실수형 (float, double)
                                    (X)
                  기본형             ↓

```

자바 ↑ 논리형 ---- boolean
(X)
데이타형 ↓
레퍼런스형 - 클래스
- 인터페이스
- 배열

byte → short ↘
int → long → float → double
char ↗

(2)상수
①논리형상수 : true/ false
②문자형상수 : ' ' (단일따옴표) - 문자
" " (이중따옴표) - 문자열
개행문자(New Line) : \n
리턴(Return) : \r -- 커서를 맨앞쪽으로 이동
탭(Tab) : \t -- 8칸띄우기
백스페이스 : \b
null : \0 (아무것도없다)
③정수형상수
④실수형상수

1. 데이터타입
(1) 기본형
정수: byte(1) : -128 ~ + 127
short(2) : -32768 ~ +32767
int (4) : -2147483648~ +2147483647(default)
long(8)
실수 : float(4) ex)float kk = 34.67f;
double(8) - default
문자 : char(2) : 0~65535
논리 : boolean --->형변환 안됨(true/false)
ex) boolean sw = false;

(2)객체형(클래스)
String :문자열
ex) import [java.io](http://java.io/).*;  //예외처리   throws IOException
또는 try{   }catch(IOException e);
InputStreamReader sr = new InputStreamReader([System.in](http://system.in/));
BufferedReader s = new BufferedReader(sr);

```
       int a = Integer.parseInt(s.readLine());
       double b = Double.parseDouble(s.readLine());
       float  c = Float.parseFloat(s.readLine());
       //객체형클래스 -> 기본형(wrapper클래스)

```

ex) System.out.printf("이름 : %s",name);   [//jdk1.5버젼](notion://jdk1.xn--5-pu2f431a/) 이상

```
         %s  :  문자열(String)
         %d  :  정수(byte, short, int, long)
         %f  :  실수(float, double)
         %c  :  문자(char)

         %-10s,   %5d,    %10.2f (자릿수 맞출때)

```

==================================================================================
7. 연산자
(1)산술 : +, -, *, /,  %(나머지) - int형만 가능
ex)5 % 2 ===> 1    5 / 2 ===> 2

(2)증감 : ++, --
ex)  ++a;  --a;  (전치 : 연산후 사용)
a++;  a--;  (후치 : 사용후 연산)

(3)대입 : =, +=, -=, *=, %=

```
     ex)              해석
      a += b;      a = a + b
      a -= b;      a = a - b;
      a *= b;      a = a * b;
      a %= b;      a = a % b;

```

(4)논리 : ||(or연산) ,    &&(and연산),      ! (not연산)
(5)비트단위논리연산: &, |, ^(Exclusive-OR), ~(0 <==>1)
(6)관계 : ==, !=(같지않다), >=, <=, >, <
a=3(대입)    a==3(조건 ,비교)
ex) if(a==3)

(7)조건(삼항) : 간단한 if문
(형식)조건식?참일때:거짓일때;

---

예)  주소가 서울이거나 부산인 데이터 찾기(or조건  ,  || )
서울         1              0      ===> true
부산         0              1      ===> true
광주         0              0      ===> false
(addr == "서울"   ||  addr =="부산")

예) 점수가 80이상 95미만인 데이터찾기(and 조건, &&)
97 1 0 ===> false
55 0 1 ===> false
85 1 1 ===> true
(score >= 80 && score < 90)
80 <= score < 90 ====> X

★ASCII코드 (범위 : 0~255)
0~125(국제표준) 126~255(국가별)
A : 65
a : 97
공백(space) : 32
경고음 : 7
Enter : 13
New Line : 10 (맨 앞줄로이동)
1 : 49

1. 제어문
(1) if문 / if ~ else 문 / if ~ else if....~else문
i)if(조건식)
참일때;
실행문;

    ii)if(조건식)
    참일때;
    else
    거짓일때;

    iii)if(조건식)
    참일때;
    else if(조건식)
    참일때;
    :
    else
    거짓일때;

(2) switch(값) <-- char,int형 (선택문)
{
case 값1 : 실행문 ; break;
case 값2 : 실행문 ; break;
.
.
[default:]실행문;
}
(3)while문(조건반복문)
① while(조건식)
{
실행문; //조건이 만족하면 실행
}
② do
{
실행문; //실행한후 조건 비교
}while(조건식);
(4)for문(무조건반복문)
①단일for문
for(초기값; 조건식; 증감식)
{
}
② 다중for문
for(초기값; 조건식; 증감식)
{
for(초기값; 조건식; 증감식)
{
}
}
③ for(자료형 변수:배열명) //데이타가 없을때까지 반복(jdk1.5이상)
{
}
④ break : 블럭탈출
⑤ continue: Loop문에서 더이상 이후 실행문을 진행할필요없이
다음Loop를 진행시키고자 할때

1. 메소드(Method) - 함수
: 반복되는작업을 처리
프로그램 수정,삭제가 용이하고 보기쉽다

(1)값에 의한 전달(Call By Value)

- 기본데이타형
(byte, short, int, long, float, double, char, boolean)
(2)참조에 의한전달(Call By Reference, Call By Address)
- 추상 데이터형
(배열, 객체)

[형식]
접근지정자 결과형 함수명();
-------  -----
|      void, int ,float, double........   (void : 리턴값이 없다)
|
public, private, protected

```
 (결과형)
  return;          //생략가능
  return 변수;
  return 수식;
  return  값;
 (주의 :  return은 1개만 가능)

  ex)  return a,b,c;      (X)

```

============================================================
10. 배열
: 자료형이 같은 데이타들의 모임
(1)1차원배열
(형식)자료형[ ] 배열명;      or    자료형 배열명[ ];

ex1)    int[ ] a;              <-- 배열선언
a = new int[5];        <-- 배열에 동적메모리할당(heap)

```
     a[0]=10;               <-- 배열요소이용
     a[1]=20;
     ------------------------------------------------------

```

ex2)   int [ ] a = new int[5];
------------------------------------------------------
ex3)   int [ ] a;
a = new int[ ] {1,2,3,4,5};
-------------------------------------------------------
ex4)   int [ ]a = {1,2,3,4,5};

(2)2차원배열
(형식) 자료형[][] 배열명;    or   자료형 배열명[][];
i)  int [][]data = new int[3][4];
ii) int [][]data;
data= new int[3][4];
ii) int [][]data={{10,40,70,100},{20,50,80,110},{30,60,90,120}};

(3)가변배열(참조형으로 처리)
: 행 또는 면의 크기가 가변적인것

```
(형식)자료형 [][]배열명 = new 자료형[첨자][];
      i) int [][]num = new int[3][];
  num[0] = new int[3];
  num[1] = new int[2];
  num[2] = new int[4];

```

ii)int [][]num = new int[3][];
num[0] = new int[]{1,2};
num[1] = new int[]{3,4,5};
num[2] = new int[]{6,7,8,9};

★참조형(Reference Type)
: 기본형변수는 해당 변수가 위치한 곳에 값을 보관하고 있다.
하지만 참조형은 값이 저장된 곳의 위치정보를 알고 있는 변수이다.
결국, 기본형은 변수의 위치와 값이 저장된위치가 동일한 반면
참조형은 값이 저장된 위치와 변수의 위치가 다르다.
참조라는 말은 주소(Address)라고도 말할수 있다.

Sort(정렬) - 오름/내림
① Selection Sort (선택)
② Bubble Sort

★ 난수함수 : 컴퓨터가 임의의 수를 발생
① import java.util.Random;
② Random 변수1 = new Random();
③ int 변수2 = 변수1.nextInt(최대값);
<-----  0 ~ (최대값 - 1)사이의 임의의 수

★패키지(package)처리
$ javac -d . 파일명.java <---컴파일
$ java 패키지명/파일명 <--- 실행

1. 객체지향프로그래밍(OOP : Object Orient Programming)
★자바의 메모리구조
: OS에 의하여 프로그램이 수행되면 JVM은 OS로부터 적절한
크기의 메모리공간을 얻어내게 된다. 그리고 얻어낸 메모리
공간을 JVM은 3영역으로 나누어 관리한다
① 메소드(method area)영역 : 메소드의byte코드 ,클래스의 전역변수
(static 멤버변수)
② 스택(Stack) : 매개변수, 지역변수
(메소드의 실행이 종료되면 자동반환)
③ 힙(Heap) : 클래스객체, 배열객체, 문자열객체
(new연산자 사용, 객체가 사용하는 메모리공간)

---

★객체지향의 중요한 3가지
(1) 상속성(Inheritance)
:이미 만들어진 코드에 새로운 코드를 추가
(프로그램 개발속도 증진, 프로그램 전체의 오류를 방지)
(2) 다형성(Polymorphism)
:상속받은것을 그대로 사용하지 않고 사용자 입맛에 맞게 바꾸어 사용
(3) 캡슐화(Encapsulation)
:데이터보호, 재사용성 - 데이터은닉화

1. 함수 오버로딩(overloading)
: 같은 이름의 함수를 여러번 구현할수있다.
① 매개변수의 갯수가 다름
② 매개변수의 자료형이 틀림

ex) Add(2);
Add(10,20);
Add(23.45, 40.5);

1. 생성자(Constructor)
:객체가 만들어지면서 자동호출하는 함수
객체의 초기작업을 할경우에 이용

    ① 반드시 클래명과 동일
    ② 결과형(리턴값)이 없다 (void도 쓰면 안됨)
    ③ 객체가 생성될때 자동 호출(user임의로 호출할수 없다)
    ④ 멤버필드의 값을 초기화 한다
    ⑤ 생략하면 default생성자가 있는것으로 인식
    ⑥ 여러개의 생성자를 만들수 있다(생성자 overloading)
    ⑦ 생성자의 첫번째라인으로 this(매개변수)를 사용하여
    또 다른 생성자를 호출할수 있다(단, 1번만호출)
    ============================================================

2. Garbage 컬랙션
: C언어의 소멸자 개념,
new로 할당된 메모리를 JVM스스로 삭제
(프로그래머는 신경쓸 필요 없다)
============================================================
3. 다중 클래스
: 하나의 파일에서 여러개의 클래스를 만들수 있음
(단, public class는 하나만 존재, main()메소드가 있는 클래스에)
============================================================
4. 오브젝트(클래스) 배열
<형식> 클래스명 []object명 = new 클래스명[첨자];
object명[0] = new 클래스명(인자,인자..);
============================================================
5. 상속(Inheritance)
: 코드의 재사용 및 간결성을 위해
기존의 클래스(Super, Parent)라하고 확장하여 새롭게
정의한 클래스를 (Sub, Child)라 부른다. 다중상속 안됨
ex) class Parent
{
};
class Child extends Parent //extends(상속)
{
}
(다중상속이 안됨, 저장파일 : main이 들어있는 클래스명과 동일)
============================================================

### 18) this예약어

: this예약어는 자신의 오브젝트를 가리키는 예약어
①자신의 오브젝트속에 존재하는 멤버변수를 가리킬때
<형식> this.멤버변수 <--주로 매개변수이름과 동일할때 구별목적으로 사용
this.메소드()
②생성자 내부에서 자신의 클래스의 또다른 생성자를 지칭하는 메소드
<형식> this(값);
ⓐ반드시 생성자속의 첫번째 문장으로 1번만 기재
ⓑ자기자신클래스명 this <---0번째 매개변수는 기재할수 없다
============================================================

### 19) 공유필드를 위한 static (this변수 없다)

(1) static필드 :데이타 값의 공유를 위해 선언하는 공간(멤버필드만 가능)
①클래스이름으로 접근가능
②객체발생전 메모리할당
<형식> 클래스명.멤버변수 or 객체명.멤버변수
(2) static 초기화영역
<형식> static { 초기화구문; }
(3) static 메서드 : static필드를 컨트롤할 목적으로 쓰임
============================================================

### 20) final

① final 필드 : 상수값이 저장될 공간으로 값이 변경될수없음
(지역변수, 멤버필드 모두 사용가능)
② final 메서드 : 상속시 오버라이딩 되지 않아야할 메서드 지정
(overriding하게되면 error발생)
============================================================

### 21) super의 사용

<-- 반드시 생성자속의 첫번째 문장으로 기재(1번만 기재)
: 후손생성자속에서 선조생성자를 호출하면서 값을 올려줌
super() <--생략가능 / super(인자,인자...) / super.메소드()
============================================================

### 22) 접근지정자

(1)private : 하나의 클래스내에서만 사용가능한 멤버지정
(2)package(아무것도 기재하지 않음,default라고도 함)
: 동일파일 + 동일폴더
(3)protected : 동일파일 + 동일폴더 + 상속
(4)public : 객체를 가진 모든 영역
public > protected > default(생략) > private

```
         같은패키지                       다른패키지

```

---

```
         같은클래스 |다른클래스 |  상속      클래스 | 상속

```

---

public O O O O O
protected O O O X O
default(생략) O O O X X
private O X X X X

### 23) 다형성(polymorphism)

: super(부모)클래스와 sub(자식)클래스에 동일한 이름의 함수가
존재(Overriding)할 경우 super클래스의 참조변수로 sub클래스의
인스턴스를 참조할수 있다.
===================================================================================

### 24) abstract class (추상 클래스)

(1)추상클래스
①추상클래스(abstract class)란?

- 내용이 구현되어 있지 않는 메소드가 1개라도 존재하면 추상클래스라고 함
- 자기자신으로 객체 생성이 불가능
- 하위클래스들이 특정메소드(추상메소드)를 반드시 강제overriding 하기 위함이다
- 다형성을 위해 존재

②추상클래스 사용방법
: abstract키워드를 사용한다.
<형식> abstract class 클래스 이름{
abstract 결과형 추상메소드이름()
}

25) 인터페이스(Interface):다중상속가능
: 자바는 단일상속만 지원하는데 이 단점을 보완하기 위해 나온 것
추상클래스와 달리 모든 메소드가 추상메소드이다.
사실, 인터페이스를 사용하는 가장 큰 목적은 다형성이다.

(1) 인터페이스의 특징.

```
             클래스        인터페이스
   ------------------------------------------
   키워드  class           interface
   상속    extends         implements
   함수    일반,abstract   abstract(모두다)
   변수    일반,final      final(모두다)
   상속    단일상속        단일,다중상속
   abstract  생략X          생략O
   final     생략X          생략O
   --------------------------------------------
   - class 대신에 interface 키워드 사용.
   - 멤버변수는 상수로 선언.즉 final 키워드를 사용한다는 것이고
     변경할 수 없다(final은 생략가능.)
   - 멤버메소드는 몸통이 없음.즉 abstract메소드이고 모든 메소드가
     abstract이므로 생략가능.
   - 부모의 인터페이스를 상속받을시는 extends 대신 implements 키워드 사용.

```

(2)인터페이스 형식
public interface 인터페이스이름{
... //상수선언. 상수선언이라 함은 final 키워드를 쓰는것.
... // 이름뿐인 메소드 선언
}

| 클래스 | 메소드 | 멤버변수/로컬상수

final | 상속불가 | 자식클래스에서 오버라이딩 불가 |변수값변경못함(즉,상수)

abstract | 추상클래스 | 추상메소드 | O

static | X | 객체생성없이 접근가능 | 객체생성없이 접근가능

public | 모두 접근가능 | 모두 접근가능 | 모두 접근가능

protected| X | 같은패키지,상속시         | 같은패키지,상속시
private |        | 다른패키지/같은클래스 | 다른패키지/같은클래스

★ 자바에서 생략할수 있는 것
import java.lang.*;
default 생성자
this
메소드의 0번째 매개변수(반드시생략)
extends Object
super()
toString() -->toString()메소드는 어떤 형식을
String 오브젝트로 반환해주는 메소드입니다

### 26) 중첩(내부) 클래스

(1)중첩 클래스 (Inner Class)
①클래스 내부에 또 다른 클래스를 가짐으로 클래스 관리의 효율을 높인 것
(static 포함불가)

②중첩 클래스의 형식과 생성파일
형식) class Outer { class Inner { … } }
생성파일) Outer.class, Outer$Inner.class

③중첩 클래스 객체 생성
Outer.Inner oi = new Outer().new Inner(); // or 객체명.new Inner();

(2)정적 중첩 클래스(Static Inner Class)
①중첩 클래스 내부에 static 멤버를 포함할 수 있는 형태
(Outer의 non-static 멤버 포함 불가)

②정적 중첩 클래스의 형식과 생성파일
형식) class Outer { static class Inner {…} }
생성파일) Outer.class, Outer$Inner.class

③정적 중첩 클래스 객체 생성
Outer.Inner oi = new Outer.Inner();

(3)지역 중첩 클래스(Local Inner Class)
①메서드 실행 시에 사용되는 클래스를 정의한 형식으로 static지정어를 가질 수 없다.
②지역 중첩 클래스의 형식 및 생성 파일
형식) class Outer {
method() { class Inner { … } } }
생성파일) Outer.class, Outer$숫자Inner.class
③객체 생성은 외부에서 할 수 없다.

(4)익명 중첩 클래스(Anonymous Inner Class)
①기존 클래스의 특정 메서드를 오버라이딩 하여 원하는 형태로 재정의 하여
사용하는 방식( 외부 멤버 중 final만 포함할 수 있다)
②익명 중첩 클래스의 형식 및 생성파일
형식) class Inner { … }
class Outer { method() { new Inner() {…}}}
생성파일) Outer.class, Outer$숫자.class
③new Inner() 자체가 객체 생성임.

### 27) 예외처리

① throws 예약어 : 예외객체를 양도
<--- 예외상황을 다음 문장으로 전가
② try{ }catch{ } : 예외가 발생하면 예외객체를 잡아내어 원하는 동작을 수행
<-- 예외상황을 처리하고 다음문장 수행
③ try{ }catch{ }finally{ } : 예외가 발생하든 안하든 finally는 무조건수행
④ throw : 예외강제발생

Exception : 모든 예외상황
IOException : 입.출력에 관련된 예외
NumberFormatException : 숫자가 아닌 문자가 입력되는 예외
ArithmeticException : 0으로나누는 예외
ArrayIndexOutOfBoundsException : 배열초과

### 28.자바의 중요한 클래스

(1)String 클래스
①concat(str):str로 설정된 문자열결합
②substring(n1,n2):n1과 n2 사이의 문자열 반환
③toUpperCase():대문자로바꾸기
④equals():문자열비교        <----중요!!

(2)StringBuffer클래스
①append()  :추가
②reverse() :꺼꾸로출력
③delete()  :삭제
④length()  :문자열의길이
⑤capacity():버퍼의size (기본:16byte)

(3)StringTonkenizer클래스
①countTokens() : 문자열에 있는 토큰의 갯수반환
②nextToken()   : 다음 토큰 문자열을 반환
③hasMoreTokens():토큰이 있으면 true,없으면 false반환

(4)Calendar클래스
:날짜나 시간을 나타내는 클래스

(5)Random클래스 : import java.util.Random
: 임의의 난수 발생
①Random 변수1 = new Random();
②int 변수2 = 변수1.nextInt(최대값);

(6)List인터페이스
List인터페이스로 구현된 클래스로 ArrayList, Vector, Stack, LinkedList가 있다

1. ArrayList클래스
자바에서는 배열을 생성할때 배열의길이를 늘리거나 줄일수없다.
ArrayList클래스는 원소가 가득차게되면 자동적으로 저장영역을 늘려준다
2. Vecter클래스
:가변배열을 처리하는 클래스
배열(Array)은 고정길이를 사용하기 때문에 길이를 늘리거나 줄일수 없다
Vector클래스를 사용하면 배열의 크기를 늘리거나 줄일수 있다.

(형식) Vector<자료형> 객체명  = new Vector<자료형>(첨자,첨자);
초기값,늘릴갯수
①hasMoreElements():백터안에서 꺼낼 객체가 있으면true, 없으면 false
②nextElement() : 백터에서 객체를 가져옴
③elements()    : 백터요소들에 대한 Enumeration객체를 반환
④capacity()    : 현재 용량
⑤size()        : 현재data의 갯수
⑥addElement()  : data추가
⑦indexOf()     : 찾는위치
⑧contains()    : 비교
⑨remove()      : 삭제
⑨trimToSize()  : 빈공간제거

(7)Set인터페이스
1)Map인터페이스와 HashSet클래스
Map인터페이스는 해쉬테이블처럼(키와 객체)쌍으로 저장 관리할수 있다.
2)Hashtable클래스
자료를 테이블 구조로 쉽게 저장할수 있고, 검색할수 있는 클래스이다
Hashtable클래스는 Vector클래스에서 사용한 Enumeration인터페이스를
사용해 값을 가져올수 있다

(8)Iterator인터페이스
리스트는 원소를 순차적으로 접근하기 위해서 for문을 이용하지만,
반복자를 이용하여 원소에 접근할수 있다

(9)Enumeration인터페이스
Collection인터페이스로 부터 구현한 클래스안에 저장된 객체를 꺼낼수 있다
① hasMoreElements() : 요소가 있으면 true반환
② nextElement()     : 요소를 얻어낸다
