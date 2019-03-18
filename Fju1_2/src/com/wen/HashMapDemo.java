package com.wen;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> hmap = new HashMap<>();
		hmap.put("�i�T��", "���v");
		Map<String, String> post = Map.of("��E�s","�Юv","���|�p","ĵ��","�P����","�Юv");
		hmap.putAll(post);
		System.out.println("���X���e:" + hmap);
		System.out.println("hmap���X�������Ӽ�:" + hmap.size());
		
		System.out.println("\n�[�J\"��E�s\"...");
		if(hmap.containsKey("��E�s")) {
			System.out.println("\"��E�s\"�w�s�b�A���ƥ[�J��¾�~���Ʒ|�Q�л\�C");
		}
		hmap.put("��E�s", "�x�H");
		System.out.println("\"��E�s\"��¾�~��אּ:"+ hmap.get("��E�s"));
		System.out.println("�[�J\"�䤭��\"...");
		String name = "�䤭��";
		if(hmap.containsKey(name)) {
			System.out.println("\"+name+\"+�w�s�b�A���������C");
		}else {
			hmap.put(name, "�߮v");
		}System.out.println("\n���X���e:");
		for(Map.Entry e : hmap.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());
		}
		
	}

}
