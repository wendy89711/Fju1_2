package com.wen;

import java.util.HashMap;

public class Tem {

	public static void main(String[] args) {
		HashMap<Integer, Integer> m = new HashMap<>();
		for(int i = 0; i<24; i++) {
			int tem = (int)(Math.random()*7);
			tem += 28;
			//�ͦ��@��int�ü�tem�ȬO0-6�����H���o�ӭȭn�A�[�W28
			Integer freq = m.get(tem);
			m.put(tem, freq == null ? 1: freq + 1);
			//null�O�h1���O�hfreq+1
			System.out.println(i + "�I�ū�" + tem + "��C");
		}

	}

}
