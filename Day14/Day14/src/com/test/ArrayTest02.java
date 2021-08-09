package com.test;

import java.io.IOException;

public class ArrayTest02 {
	public static String ConString(String str) {
		// �Է¹��� ���ڿ��� �������� �����Ѵ�.
		//1)char[]�迭�� ���Ϲ޴´�.
		char[]res = str.toCharArray();//�迭�� ���� ���� ����
		char[]cv_str = new char[res.length]; //�������� ���� ����
		
		//2) ���� for�� �̿��ؼ� char[]�� ��� String �����ڷ� ��ü ���� �� ����
			for(int i = res.length-1 ; i>= 0 ; i--) {
				cv_str[res.length-i-1] =res[i];  // length(1����)�� index(0���� )�� �׻� 1���̰� ����. 
				
			}
			return new String(cv_str);		
	}

	
	public static void View_Res(String str) {
		
		int upper_cnt = 0 ; //�빮�� ����
		int lower_cnt = 0 ; // �ҹ��� ����
		int space_cnt = 0; // ���鿡 ����
		for(char r : str.toCharArray()) {
			if(Character.isUpperCase(r)) { //Character.isUpperCase(r)�� ������ r(0~str.toCharArray �� ���� �˻��ϸ� �빮���̸� upper_cnt�� �ø���.) 
				upper_cnt++; 			// �빮�� ���� ���
				//Character.toLowerCase(r); �빮���̸� �ҹ��ڷ� �ٲ۴�.
				//Character.toUpperCase(r); �ҹ����̸� �빮�ڷ� �ٲ۴�.
			}
			if(Character.isLowerCase(r)) { // Character.isLowerCase(r)�� r�� �ҹ��̸� lower_cnt�� ī���Ͱ� �ö󰣴�.
				lower_cnt++;			// �ҹ��� ���� ��� 
			}
			
			if(Character.isSpaceChar(r)) {
				space_cnt++;
			}
		}//for end
		System.out.println("�빮�� ���� : " + upper_cnt+", �ҹ��� : " + lower_cnt+ ", ���� ���� : " + space_cnt);
		
	}
	
	
	public static void View_Res02(String str) {
		
		int upper_cnt = 0 ; //�빮�� ����
		int lower_cnt = 0 ; // �ҹ��� ����
		int space_cnt = 0; // ���鿡 ����
		//case�� ���� ������ if�� ���ǹ��� ���� �� case���� ���� .
		for(char r : str.toCharArray()) {
			int res = Character.getType(r); // �Ǻ��� �� �� �ְ� ���ִ� ���� res , ���� �Է¹��� �ѱ��ھ� ��ö�� r�� �ִ´�.
			switch(res) {
			case Character.SPACE_SEPARATOR: //������ ����
				space_cnt++;
				break;
			case Character.LOWERCASE_LETTER:
				lower_cnt++;
				break;
			case Character.UPPERCASE_LETTER:
				upper_cnt++;
				break;
			}
		}//for end
		System.out.println("�빮�� ���� : " + upper_cnt+", �ҹ��� : " + lower_cnt + ", ���� ���� : "+ space_cnt);
		
	}
	public static void main(String[] args) {
	//�Ʒ� ������ View_Res�� �����ؼ� �ҹ����� ������ �빮���� ������ ����غ���.
	//1. ������ ������ ConString�� �����ؼ� �������� ���Ϲ޴´�.
	//2. 1���� ����� View_Res�� �����Ѵ�.
		String str  = "The String class represents character strings.";
		System.out.println("���� str: " + str);
		System.out.println("str�� ���� : " + ConString(str));
		View_Res(ConString(str)); // �빮�� , �ҹ��� ���� 
		View_Res02(ConString(str));
			}

}
