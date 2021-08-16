package com.test;

import java.io.File;
import java.io.IOException;

public class Test_File {
	public static void View() {
		//File(String pathname)
		//Test 폴더 밑에 야구 폴더를 만들어 보자.
		File f = new File("C:\\Test\\배구");  // 자바는 대소문자를 가리지만 운영체제 윈도우는 대소문자 구분이 없다.

		
		//2. File(String parent, Stringg child)
		
		// c:\\Test\\배구 밑에 농구를 만들어 보자.
		File fi = new File("C:\\Test\\배구", "농구");
		
		//3. File(File parent, String child) 부모 경로를 파일의 객체로 생성
		// 배구 밑에 농구2를 만들어 보자 .
		File fi02 = new File(f, "농구2");
	
		
		
		if(fi02.exists()) { //대상의 존재 유무 리턴
			System.out.println("이미만들었어");
		}else {
			fi02.mkdir();			
		}
		
		//만들어진 객체가 f로 참조하고 난 후 mkdir()로 생성한 것을 확인 후 속성 정보를 출력해보자.
		System.out.println(fi02.canExecute()); // 실행 상태인지
		System.out.println(fi02.canRead()); // 읽기 상태인지
		System.out.println(fi02.canWrite()); // 쓰기 상태인지 확인
		System.out.println();
		//속성을 좀 더 자세히
		System.out.println(fi02.getAbsolutePath());
		System.out.println(fi02.getFreeSpace()); // 자유영역이란 ? 메모리내에서 최대로 잡을 수 있는 크기
		System.out.println(fi02.getName());
		System.out.println(fi02.getParent()); // 파일 경로 
		System.out.println(fi02.getTotalSpace());  //디렉토리 영역의 최대 크기 
	}
	
	public static void View02() {
		String str = "c:" + File.separatorChar+ "test";
		System.out.println(str);
	}
	
	public static void View03() {
		File fi02 = new File("c:\\test\\a.txt");
		
		// 파일만들 때 신경써야될 것  1.권한 , 2.읽기전용 파일 ,  3.  
		if(fi02.exists()) {
			System.out.println("존재한다.");
			//f.delete();
		}else {
			try {
				fi02.createNewFile();
			} catch (IOException e) {
				System.out.println("========================");
				e.printStackTrace();
			}//end catch    
		}//end else
		System.out.println(fi02.canExecute()); // 실행 상태인지
		System.out.println(fi02.canRead()); // 읽기 상태인지
		System.out.println(fi02.canWrite()); // 쓰기 상태인지 확인
		System.out.println();
		//속성을 좀 더 자세히
		System.out.println(fi02.getAbsolutePath()); //절대적 경로 
		System.out.println(fi02.getFreeSpace()); // 자유영역이란 ? 메모리내에서 최대로 잡을 수 있는 크기
		System.out.println(fi02.getName()); //생성된 파일 이름 불러오기  
		System.out.println(fi02.getParent()); // 파일 경로 
		System.out.println(fi02.getTotalSpace());  //디렉토리 영역의 최대 크기 
	}//end view03
	
	
	public static void View04() {
		//지정된 패스의 목록을 출력 해보자.
		
//		String ->list()
//		File -> listFiles()
		File f = new File("C:\\Windows\\System32");
		String[] res = f.list() ;
		for(String res_info  : res) {
			System.out.println(res_info);
		}
	}
	
	public static void View05() {
		
		//디렉토리는 [dir], 파일 [file]
		File f = new File("C:\\Windows\\System32");
		File[] res = f.listFiles() ;
		int dcnt = 0;
		int fcnt = 0;
		for(File res_info  : res) {
			if(res_info.isDirectory()) {
				dcnt++;
				System.out.println("[dir]"+ res_info.getAbsolutePath());
				
			}
			if(res_info.isDirectory()) {
				fcnt++;
				System.out.println("[file]"+res_info.getAbsolutePath());
				
			}
		}
		
		System.out.printf("dir cnt = %5d, file cnt = %5d개 \n", dcnt, fcnt);		
	}

	public static void main(String[] args) {
		View05();
	}
}
