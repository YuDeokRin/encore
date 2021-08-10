package com.test01;

import java.util.Comparator;
import com.myscore.*;
public class MySort implements Comparator {

	@Override
	public int compare(Object ar01, Object ar02) {
		Score r01 = (Score)ar01;
		Score r02 = (Score)ar02;
		
		if(r01.getKor() > r02.getKor()) {
			return 1;
		}
		
		if(r01.getKor() > r02.getKor()) {
			return -1;
		}
		return 0;
	}

}
