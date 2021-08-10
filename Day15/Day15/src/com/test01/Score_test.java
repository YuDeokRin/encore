package com.test01;
import java.util.*;

import com.myscore.*;
import com.mycom.*;

public class Score_test {
	public static void main(String[] args) {
		List<Score> all = new ArrayList<>();
		all.add(new Score("1",100,80,60));
		all.add(new Score("2",80,80,60));
		all.add(new Score("3",90,80,60));

		
		System.out.println("정렬 전");
		for(Score r: all) {
			System.out.println(r);
		}
		
		Collections.sort(all, new MySort());
		
		System.out.println("정렬 전");
		for(Score r: all) {
			System.out.println(r);
		}
		
	}
}
