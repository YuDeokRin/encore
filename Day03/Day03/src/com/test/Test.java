package com.test;
// �����
// 1.package : ���� Ŭ������ ��ġ�� namespace
// 2.import  package : ���� Ŭ�������� ������ �� �ִ� Ŭ������ �ִ� namespace(package)
// 3.import static package : ���� Ŭ�������� ������ ��  �ִ� static �޼ҵ� ������ �� ��� 



public class Test { // .java ��� �����ؾ� �Ѵ�. �ڹ��� ���� ������ class�̴�.
	public static void Prn() {
		
		System.out.println("Test's Prn()");
		
	}
	public static void Disp() {
		System.out.println("Test's Disp");
		System.out.println("11111111111111111");
		
	}
	public static void main(String[] args) { // main()������ = main ,method
		Prn();
		System.out.println("==============main============");
		Disp();
		
	}
}

