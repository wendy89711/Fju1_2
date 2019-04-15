package com.wen;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDomo {

	public static void main(String[] args) {
		Set<String> hset = new HashSet<>();
		Scanner keyin = new Scanner(System.in);
		System.out.println("輸入四個不重複的英文字串");
		int order = 1;
		String st;
		while(order<=4) {
			System.out.print("第"+order+"個字串?");
			st = keyin.nextLine();
			if(hset.add(st))
				order++;
			else
				System.out.println(" "+st+"字串重複輸入");
		}
		System.out.println("四個字串分別為: ");
		System.out.println(hset);
		System.out.println("輸入要找尋的字串:");
		String findSt1 = keyin.nextLine();
		if(hset.contains(findSt1))
			System.out.println(" "+ findSt1 +"字串存在集合物件中");
		else {
			System.out.println(" "+ findSt1 +"字串不在集合物件中");
		}
		System.out.println("輸入要刪除的字串:");
		String findSt2 = keyin.nextLine();
		if(hset.remove(findSt2)) {
			System.out.println(" "+ findSt2+"字串已刪除");
		}else {		
			System.out.println(" "+ findSt2 +"字串不在集合物件中");
		}
		System.out.println("目前集合物件個數為:"+ hset.size());
		keyin.close();
		
		
		

	}

}
