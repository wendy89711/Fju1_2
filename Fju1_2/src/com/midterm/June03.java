package com.midterm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class June03 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("One");
		for(int i=0; i<set.size(); i++) {
			System.out.println(set.size());
		}
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Jack");
		map.put(1, "Hank");
		System.out.println(map.get(1));
		List list = new ArrayList();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(3);
		list.add("Test");
		System.out.println(list.get(4));
		List<Integer> lists = new ArrayList<>();
		lists.add(5);
		lists.add(3);
		lists.add(9);
		lists.add(3);
		System.out.println(list.get(0));
		
		Set<String> set1 = new HashSet<>();
		set.add("Apple");
		set.add("Jack");
		System.out.println(set.contains("Jack"));
		
		
	}
}
