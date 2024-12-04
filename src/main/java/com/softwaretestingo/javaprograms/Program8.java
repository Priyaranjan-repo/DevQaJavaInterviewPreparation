package com.softwaretestingo.javaprograms;

public class Program8 {

	public static void main(String[] args) {

		/*
		 * Input: Today is January 5th
		 *
		 * Output: 5thJa nu aryisTo day
		 * 
		 */

		String input = "Today is January 5th";
		String op = "";
		String oop = "";

		String a[] = input.split(" ");

		for (int i = 0; i < a.length; i++) {
			op = a[i] + op;
		}

		System.out.println(op);
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) + "").equals(" ")) {
				oop = oop + " ";
				++count;
			} else {
				oop = oop + op.charAt(i - count);
			}
		}
		System.out.println(oop);

	}

}
