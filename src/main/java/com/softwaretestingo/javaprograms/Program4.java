package com.softwaretestingo.javaprograms;

import java.util.LinkedHashMap;

public class Program4 {
	public static void main(String[] args) {
		/*
		 * Input: dadeadrs
		 * 
		 * Output: dddaaers
		 */

		String input = "dadeadrs";
		String op = "";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			} else {
				map.put(input.charAt(i), +1);

			}
		}

		System.out.println(map);

		for (Character c : map.keySet()) {
			for (int i = 0; i < map.get(c); i++) {

				op = op + c;
			}
		}

		System.out.println(op);
	}

}
