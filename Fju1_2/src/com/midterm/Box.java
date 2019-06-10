package com.midterm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Box {
	String name = "BOX";
	public Box(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		Box box = new Box("j");
		System.out.println(box.name);
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(13);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(1);
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				list.remove(i);
			}	
		}
		System.out.println(list);
		
		Set<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Six");
		set.add("Seven");
		set.add("Eight");
		for (String s : set) {
		    System.out.print(s);
		}
		Random random = new Random(10);
		System.out.println(random);
		
	}
}
