package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {
		List<String> night = new ArrayList<>();
		System.out.println("�F���ȹC�]�J�W��");
		night.add("�y��");
		night.add("�Ὤ");
		night.add("�Ѳ�");
		night.add("�Ὤ");
		night.add("�x�F");
		night.add("����");
		night.add(4,"���W");
		night.remove(night.indexOf("�Ὤ"));
		for(int i = 0; i<night.size();i++) {
			System.out.println("��"+(i+1)+"�ѩ]�J�a�I:"+night.get(i));
		}
	}
}
