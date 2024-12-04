package com.softwaretestingo.javaprograms;

import java.util.LinkedHashMap;

public class Program35 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: Ramakant
         *
         * Output: R1a1m1a2k1a3n1t1
         *
         */

        String ip = "Ramakant";
        String op = "";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (char c : ip.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
                op = op + c + map.get(c);
            } else {
                op = op + c + "1";
                map.put(c, 1);
            }
        }
        System.out.println(op);
    }

}
