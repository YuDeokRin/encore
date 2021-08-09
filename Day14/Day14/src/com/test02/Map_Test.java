package com.test02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.myscore.Score;

public class Map_Test {
	public static void View(Map<Integer, Score> res) {
		System.out.println("1. Map의 키만 리턴받아 출력 해보자");
		Set<Integer> key_res = res.keySet();
		for(Integer r: key_res) {
			System.out.println(r);
		}
	
		System.out.println("2. Value의  리턴받아 출력 해보자");
		// Collection<V> values()
		Collection<Score> r = res.values();
		for(Score score_r : r) {
			System.out.println(score_r);
		}
		
		
		System.out.println("3. Map의 inner class의 타입을 이용해서 key, value리턴받자");
		//Set<Map.Entry<K,V>> entrySet()
		
//		Set<Map.Entry<K,V>> n_res = res.entrySet();
		Set<Map.Entry<Integer,Score>> n_res = res.entrySet();
		
		for(Map.Entry<Integer,Score> myres : n_res) {
			
			System.out.println("key : "+ myres.getKey() + " vaule : " + myres.getValue() );
		}
		
		System.out.println("4. 키값이 3인 데이터의 이름을 \"정길동으로 변경 후 전체 출력");
		for(Map.Entry<Integer,Score> myres : n_res) {
			
			
			if(myres.getKey().equals(3)) {
				myres.getValue().setName("정길동");
			}
			System.out.println("key : "+ myres.getKey() 
			+ " vaule : " + myres.getValue() );
			
		
		}
		
		
	}
	public static void main(String[] args) {
		Map<Integer, Score> map = new HashMap< >();
		map.put(1, new Score("111",90,80,70));
		map.put(2, new Score("2",90,80,70));
		map.put(3, new Score("3",90,80,70));
		map.put(4, new Score("4",90,80,70));
		
		System.out.println(map);
		System.out.println();
		View(map);
	}
}
