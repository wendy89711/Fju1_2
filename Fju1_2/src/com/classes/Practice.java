package com.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("milk", 1);
		map.put("egg", 2);
		System.out.println(map.get("egg"));
		List<String> list = new ArrayList<>();
		list.add("�]��");
		list.add("�s�_");
		list.add(1, "�s��");
		System.out.println(list.get(1));
		Set<String> set = new HashSet<>();
		set.add("�����p�s");
		set.add("�p�p�L");
		System.out.println(set);

	}

}
