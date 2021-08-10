package com.test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<String> all = new ArrayList<>();
	all.add("abc");
	all.add("zbc");
	all.add("cbc");
	System.out.println(all);
	
		Collections.sort(all);
		System.out.println(all);
	}
}
