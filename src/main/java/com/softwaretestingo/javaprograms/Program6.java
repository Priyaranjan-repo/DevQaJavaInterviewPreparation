package com.softwaretestingo.javaprograms;

public class Program6 {
    public static void main(String[] args) {

        /*
         * Input: Welcome to Mis2is2ip2i Bla4k Adam 
         * Output:Welcome to Mississippi
         * Blaaaak Adam Welcome to Mississippi Blaaaak Adam
         *
         *
         */

        String ip = "Welcome to Mis2is2ip2i Bla4k Adam";
        String op = "";

        for (int i = 0; i < ip.length(); i++) {
            if (Character.isDigit(ip.charAt(i))) {
                for (int j = 0; j < Integer.parseInt(ip.charAt(i) + "") - 1; j++) {
                    op = op + ip.charAt(i - 1);
                }

            } else {
                op = op + ip.charAt(i);
            }

        }
        System.out.println(ip);
        System.out.println(op);
    }
}
