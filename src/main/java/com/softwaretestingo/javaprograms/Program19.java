package com.softwaretestingo.javaprograms;

import java.util.LinkedHashMap;

public class Program19 {
    public static void main(String[] args) {

        /*
         * Input: AAAABBCCCDDDDEEEG
         *
         * Output: A4B2C3D4E3G1
         *
         */

        String ip = "AAAABBCCCDDDDEEEG";

        String op = "";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < ip.length(); i++) {
            if (!map.containsKey(ip.charAt(i))) {
                map.put(ip.charAt(i), 1);
            } else {
                map.put(ip.charAt(i), map.get(ip.charAt(i)) + 1);
            }
        }

        for (Character ch : map.keySet()) {
            op = op + ch + +map.get(ch);
        }
        System.out.println(op);
    }
}
