package com.test04;

import java.util.ArrayList;
import java.util.List;

class AA{
	@Override	
	public String toString() {
		return "AA [toString()]";
	}
}

class BB extends AA{
	@Override
	public String toString() {
		return "BB [toString()]";
	}
}
class DD extends BB{
	@Override
	public String toString() {
		return "DD [toString()]";
	}
}

class EE extends BB{
	@Override
	public String toString() {
		return "EE [toString()]";
	}
}
public class W_test {
	public static void main(String[] args) {
		//extends는 선조를 제한
		//super는 후손을 제한 
		List <? extends BB> 	all = new ArrayList<>();
		all.add(new BB());
		all.add(new DD());
		all.add(new EE());
		System.out.println(all);
	}
	
}
