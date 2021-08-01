
# 배열

-같은타입 의 여러 변수를 하나의 묶음으로 다루는 것을 '배열(array)'이라고 한다.
 

##배열의 선언 방법 
	
	타입 [] 변수이름 ;     선언 예 ) int[] score; 
							   String[] name;
							   
	타입 변수이름[];		선언 예) int score[];
							   int String[];
							   


## 배열의 생성
	배열의 선언한 다음에는 배열을 생성해야한다. 
	타입[] 변수이름;			//배열을 선언(배열을 다루기 위한 참조변수 선언)
	변수이름 = new 타입[길이]; // 배열을 생성 (실제 저장공간을 생성)
	
	int[] score; 		//int 타입의 배열을 다루기 위한 참조변수 score선언
	score = new int[5]	// int 타입의 값 5개를 저장할 수 있는 배열
	
	다음과 같이 배열의 선언과 생성을 동시에 하면 간략히 한 줄로 할 수 있는데, 대부분의 경우 이렇게한다.
	
	타입[] 변수이름 = new 타입[길이]; //배열의 선언과 생성을 동시에 
	int[] score = new int[5] ; 	// 길이 5인 int배열
	
<img src= "https://user-images.githubusercontent.com/56623911/127775168-a17c9ce1-e35c-4eda-84c8-d80baf42888b.png">



1. int[] score; 

	int형 배열 참조변수 score를 선언한다. 데이터를 저장할 수 있는 공간은 아직 마련되지 않았다.
	
	<img src= "https://user-images.githubusercontent.com/56623911/127775659-967f61c9-a45a-475f-a3b0-3c11884cc0a5.png">

	
	
2. score = new int[5];

	연산자'new'에 의해서 메모리의 빈 공간에 5개의 int형 데이터를 저장할 수 있는 공간이 마련된다.
	
	<img src="https://user-images.githubusercontent.com/56623911/127775672-82307e7c-df1a-4a08-b6a1-7fe2fba458cf.png">
	
	그리고 각 배열요소는 자동적으로 int의 기본값(default)인 0으로 초기화 된다.
	
	<img src="https://user-images.githubusercontent.com/56623911/127775695-ade907e1-e518-482a-a078-3eca5e4a3047.png">

	
	끝으로 대입 연산자 '='에 의해 배열의 주소가 int형 배열 참조변수 score에 저장된다.
	
	<img src="https://user-images.githubusercontent.com/56623911/127775744-a1a1bd15-38e3-46e1-942b-8a341e439774.png">


	
이제 참조변수 score를 통해서 생성된 배열에 값을 저장하거나 읽어 올 수 있다. 
이 배열은 '길이 5인 int배열'이며, 참조변수의 이름을 따서 '배열 score'라고 부르면 된다.

	
				
## 배열의 길이와 인덱스	

	생성된 배열의 각 저장공간을 '배열의 요소(element)'라고 하며, '배열이름[인덱스]'의 형식으로 배열의 요소에 접근한다.
	인덱스(index)는 배열의 요소마다 붙여진 일련번호로 각 요소를 구별하는데 사용된다.
	
<img src = "https://user-images.githubusercontent.com/56623911/127776019-7d5e4174-e757-4612-92ab-8a849d2d578e.png">

	
	
	배열에 값을 저장하고 읽어오는 방법은 변수와 같다. 단지 변수으름 대신 '배열이름[인덱스]'를 사용한다는 점만 다르다.
	
	score[3] = 100;		// 배열 score의 4번째 요소에 100을 저장한다.
	int value = score[3]	//배열 score의 4번째 요소에 저장된 값을 읽어서 value에 저장
	
	
	1) score[] = 100;		//배열 score의 4번째 요소에 100을 저장한다.

<img src = "https://user-images.githubusercontent.com/56623911/127776179-637045b3-b008-42a5-ba1e-9e01f53a4b60.png">

	
	2)int value = score[3];		//배열 score의 4번째 요소의 값을 읽어서 value에 저장.
	

<img src = "https://user-images.githubusercontent.com/56623911/127776263-7af823f3-b333-491a-8fd2-c463585707c8.png">

	

## 배열의 초기화

배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화되므로 
배열을 사용하기 전에 따로 초기화를 해주지 않아도된다. 원하는 값을 넣을려면 아래와 같이하면된다.

```java
int[] score = new int[5];
score[0] = 50;
score[1] = 60;
score[2] = 70;
score[3] = 80;
score[4] = 90;
```
----------------------------------------------------------------------------
배열의 길이가 큰 경우에는 for문 사용

```java
int[] score = new int[5];	//길이가 5인 int형 배열을 생성한다.

for(int i = 0; i < score.length; i++){
	score[i] = i * 10 + 50;
}
```

※주의 for문은 값에 일정한 규칙이 있어야만 가능

---------------------------------------------------------------------------------


배열을 간단히 초기화 할 수 있는 방법

```java
int[] score = new int[] {50, 60, 70, 80, 90};	//배열의 생성과 초기화를 동시에 
```
	
	



	
 
	
	
	

	










