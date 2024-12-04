package com.softwaretestingo.javaprograms;

import java.util.LinkedHashMap;

public class Program7 {
    public static void main(String[] args) {

        /*
         * Input: abbcccdeee
         *
         * Output: a1b2c3d1e3
         */

        String input = "abbcccdeee";
        String op = "";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), +1);

            }
        }

        for (Character c : map.keySet()) {

            op = op + c + map.get(c);

        }
        System.out.println(op);
    }

}
