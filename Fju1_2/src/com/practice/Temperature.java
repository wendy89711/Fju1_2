package com.practice;

import java.util.HashMap;

public class Temperature {

	public static void main(String[] args) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i<24; i++) {
			int tem = (int)(Math.random()*7);
			tem += 28;
			Integer freq = m.get(tem);
			m.put(tem, freq == null ? 1: freq +1);
			System.out.println(i +"ÂI·Å«×" + tem + "«×C");
		}
	}

}
