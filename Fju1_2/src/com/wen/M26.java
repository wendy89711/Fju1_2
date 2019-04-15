package com.wen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M26 {

	public static void main(String[] args) {
		Map<String, String> buy = new HashMap<>();
		Scanner sca = new Scanner(System.in);
		String thing;
		String amount;
		int i = 1;
		while(i>=1) {
			System.out.println("Please enter item name:");
			thing = sca.nextLine();
			if(!"q".equals(thing)) {
				System.out.println("Please enter quantity:");
				amount = sca.nextLine();
				buy.put(thing, amount);
				System.out.println(buy);
			}else {
				break;
			}
		}
	}
}
