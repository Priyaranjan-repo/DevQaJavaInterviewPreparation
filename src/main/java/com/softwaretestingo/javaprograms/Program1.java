package com.softwaretestingo.javaprograms;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Input: [Rama, Test, Type, Tata]
		// Expected: RTTTaeyamsptatea
		// RTTTaeyamsptatea

		String arr[] = { "Rama", "Test", "Type", "Tata" };

		String op = " ";
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				op = op + arr[j].charAt(i);
			}
		}
		System.out.println(op);
	}

}
