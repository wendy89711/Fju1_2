package com.wen;

import java.util.HashMap;

public class Tem {

	public static void main(String[] args) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i<24; i++) {
			int tem = (int)(Math.random()*7);
			tem += 28;
			//生成一個int亂數tem值是0-6之間隨機這個值要再加上28
			Integer freq = m.get(tem);
			m.put(tem, freq == null ? 1: freq + 1);
			//null是則1不是則freq+1
			System.out.println(i + "點溫度" + tem + "度C");
		}

	}

}
