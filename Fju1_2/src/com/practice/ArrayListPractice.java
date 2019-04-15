package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		List<String> night = new ArrayList<>();
		System.out.println("東部旅遊夜宿規劃");
		night.add("宜蘭");
		night.add("花蓮");
		night.add("天祥");
		night.add("花蓮");
		night.add("台東");
		night.add("知本");
		night.add(4,"池上");
		night.remove(night.indexOf("花蓮"));
		for(int i = 0; i<night.size();i++) {
			System.out.println("第"+(i+1)+"天夜宿地點:"+night.get(i));
		}
	}
}
