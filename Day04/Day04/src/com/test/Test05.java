package com.test;

public class Test05 {

	// String name�� �޾Ƽ� name+"�� ȯ���մϴ� ~ "�� String ���� �����ϴ� �޼ҵ� 
	public static String getName(String name) {
		return name+"�� ȯ���մϴ� ~ ";
		
	}
	
	public static void main(String[] args) {
		String res = getName("ȫ�浿");
		System.out.println(res);
		
		System.out.println(getName("���浿"));
	}

}
