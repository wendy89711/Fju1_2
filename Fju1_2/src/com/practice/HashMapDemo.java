package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("�i�T��", "���v");
		map.put("��E�s","�Юv");
		map.put("���|�p","ĵ��");
		map.put("�P����","�Юv");
		System.out.println(map);
		System.out.println(map.size());
		if(map.containsKey("��E�s")) {
			System.out.println("\"��E�s\"�w�s�b�A���ƥ[�J��¾�~���Ʒ|�Q�л\�C");			
		}
		map.put("��E�s", "�x�H");
		String name = "�䤭��";
		map.put(name, "�߮v");
		map.remove("�P����");
		for(Map.Entry e : map.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
	}	

}
