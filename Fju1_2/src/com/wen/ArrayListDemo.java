package com.wen;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		System.out.println("�F���ȹC�]�J�W��");
		List<String> night = new ArrayList<>();
		List<String> place = List.of("�y��","�Ὤ","�Ѳ�","�Ὤ","�x�F");
		for(String p : place) {
			night.add(p);
		}
		System.out.println("����W���]�J�a�I:" + night);
		System.out.println("����W���]�J�Ѽ�:" + night.size());
		night.add("����");
		night.add(4,"���W");
		System.out.println("�׭q��]�J�a�I:" + night);
		System.out.println("�]�J�Ѳ��b�ĴX��:"+(night.indexOf("�Ѳ�")+1));
		System.out.println("�谣�Ὤ�Ĥ@�ө]�J...");
		night.remove(night.indexOf("�Ὤ"));
		System.out.println("\n�T�w�]�J�Ѽ�:" + night.size());
		System.out.println("~�T�w�]�J��C~");
		for(int i = 0; i<night.size();i++) {
			System.out.println("��"+(i+1)+"�ѩ]�J�a�I:"+night.get(i));
		}
	}

}
