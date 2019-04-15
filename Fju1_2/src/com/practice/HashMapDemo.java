package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("張三谷", "牧師");
		map.put("何九山","教師");
		map.put("李四裴","警察");
		map.put("周六圖","教師");
		System.out.println(map);
		System.out.println(map.size());
		if(map.containsKey("何九山")) {
			System.out.println("\"何九山\"已存在，重複加入時職業欄資料會被覆蓋。");			
		}
		map.put("何九山", "軍人");
		String name = "曹五操";
		map.put(name, "律師");
		map.remove("周六圖");
		for(Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
	}	

}
