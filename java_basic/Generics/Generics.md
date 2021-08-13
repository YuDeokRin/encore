# 2021.08.13

# 지네릭스(Generics)

JDK1.5에서 처음 도입된 지네릭스

## 지네릭스란?

- 지네릭스는 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입체크(complie-time type check)를 해주는 기능이다.
  객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입의 안정성을 높이고 형변환의 번거로움이 줄어든다.
타입 안정성을 높인다는 것은 의도하지 않은 타입의 객체가 저장되는 것을 막고, 저장된 객체를 꺼내올 때 원래의 타입과 다른 타입으로 잘못 형변환되어 발생할 수 있는 오류를 줄여준 다는 뜻이다.


- 지네릭스의 장점
1) 타입 안정성을 제공한다.
2) 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.
  

### 지네릭 클래스의 선언 

```java
class Box{
	Object item;
	
	void setItem(Object item) {this.item = item;}
	Object getItem() { return item;}
}	
```

위 클래스를 지네릭 클래스로 변경하면 다음과 같이 클래스 옆에 '<T>'를 붙이면 된다. 그리고 Object를 모두 'T'로 바꾼다.
```java
class Box<T>{  // 지네릭 타입 T를 선언
	T item;
		
	void setItem(T item) {this.item = item;}
	T getItem() { return item;}
}	
```

- T(Type Variable)
- E(Element)
- K(key)
- V(Value)


지네릭 클래스가 된 Box클래스의 객체를 생성할 때는 다음과 같이 참조변수와 생성자에 타입 T대신에 사용될 실제 타입을 지정해주어야 한다.<br>

```java
Box<String> b = new Box<String>();	// 타입 T대신, 실제 타입을 지정
b.setItem(new Object());			// 에러. String이외의 타입은 지정불가
b.setItem("ABC");					// OK. String 타입이므로 가능
String item = ~~(String)~~ b.getItem();	// 형변환이 필요 없음 
```

위의 코드에서 타입 T대신에 String타입을 지정해줬으므로, 지네릭 클래스 Box<T>는 다음과 같이 정의된 것과 같다.

```java

class Box{ // 지네릭 타입을 String으로 지정
	String item;
	void setItem(String item){ this.item = item;}
	String getItem() {return item;}
}

```


지네릭이 도입되기 이전의 코드와 호환을 위해, 지네릭 클래스인데도 예전의 방식으로 객체를 생성하는 것이 허용된다.<br>
다만 지네릭 타입을 지정하지 않아서 안전하지 않다는 경고가 발생한다.<br>

```java
Box b= new Box();		//OK. T는 Object로 간주된다. <br>
b.setItem("ABC");		//경고. unchecked or unsafe operation<br>
b.setItem(new Object());//경고. unchecked or unsafe operation<br>
```

아래와 같이 타입 변수 T에 Object타입을 지정하면, 타입을 지정하지 않은 것이 아니라 알고 적은 것이므로 경고는 발생하지 않는다.

```java
Box<Object> b = new Box<Object>();
b.setItem("ABC");		//경고 발생 안함.
b.setItem(new Object())	//경고 발생 안함. 
```

### 지네릭스의 용어
지네릭스에서 사용되는 용어들은 자칫 헷갈리기 쉽다. 진도를 더 나가기 전에, 지네릭스의 용어를 먼저 정리하고 넘어갖.

<사진1>


Box<T> : 지네릭 클래스. 'T의 Box'또는 'T Box'라고 읽는다.
T : 타입 변수 또는 타입 매개변수.(T는 타입문자)
Box : 원시타입(raw type)




	