package com.softwaretestingo.javaprograms;

public class Program11 {

	public static void main(String[] args) {

		/*
		 * Input: AAAADDDCCCA
		 *
		 * Output: A4D3C3A1
		 * 
		 */

		String ip = "AAAADDDCCCAfff";
		String op = "";

		int count = 0;

		for (int i = 0; i < ip.length(); i++) {
			for (int j = 0; j < ip.length(); j++) {
				if (ip.charAt(i) == ip.charAt(j)) {
					++count;

				} else {
					op = op + ip.charAt(i) + count;
					count = 1;
				}
				i = j;

			}

		}
		op = op + ip.charAt(ip.length() - 1) + 1;
		System.out.println(op);
	}
}
