package com.softwaretestingo.javaprograms;

import java.util.LinkedHashMap;

public class Program22 {

    public static void main(String[] args) {
        /*
         * Input: 01IND02AUS03ENG
         *
         * Output: {“01″:”IND”,”02″:”AUS”,”03″:”ENG”}
         */
        String ip = "01IND02AUS03ENG";
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        for (int i = 0; i < ip.length(); i = i + 5) {
            map.put(ip.subSequence(i, i + 2) + "", ip.substring(i + 2, i + 5));
        }
        System.out.println(map);
    }

}
