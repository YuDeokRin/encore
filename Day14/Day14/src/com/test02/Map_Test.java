package com.test02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.myscore.Score;

public class Map_Test {
	public static void View(Map<Integer, Score> res) {
		System.out.println("1. Map�� Ű�� ���Ϲ޾� ��� �غ���");
		Set<Integer> key_res = res.keySet();
		for(Integer r: key_res) {
			System.out.println(r);
		}
	
		System.out.println("2. Value��  ���Ϲ޾� ��� �غ���");
		// Collection<V> values()
		Collection<Score> r = res.values();
		for(Score score_r : r) {
			System.out.println(score_r);
		}
		
		
		System.out.println("3. Map�� inner class�� Ÿ���� �̿��ؼ� key, value���Ϲ���");
		//Set<Map.Entry<K,V>> entrySet()
		
//		Set<Map.Entry<K,V>> n_res = res.entrySet();
		Set<Map.Entry<Integer,Score>> n_res = res.entrySet();
		
		for(Map.Entry<Integer,Score> myres : n_res) {
			
			System.out.println("key : "+ myres.getKey() + " vaule : " + myres.getValue() );
		}
		
		System.out.println("4. Ű���� 3�� �������� �̸��� \"���浿���� ���� �� ��ü ���");
		for(Map.Entry<Integer,Score> myres : n_res) {
			
			
			if(myres.getKey().equals(3)) {
				myres.getValue().setName("���浿");
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
