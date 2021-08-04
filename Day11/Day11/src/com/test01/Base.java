package com.test01;

/**
 * @author Deok
 *	다형성 
 *  어떤 객체를 관리하는 동물원 각 기능들이 시작, 멈춤이다. 
 *  안에 걷기 멈추기가 다르다, 즉 기능이 다르다  
 *  
 *  1. 강제상속을 이용해서 후손클래스를 호출하겠다 .
 *  2. 선조가 가진 메소드 재정의  Static  vs Dynamic
 *  
 *  oop 특징
 *  클래스 , 상속, 다향성 :다향성원칙 동적바인딩  안에는 오버로드, 오버라
 *  
 */
public abstract class Base {

	public abstract void Start();
	
	public abstract void Stop();
}
