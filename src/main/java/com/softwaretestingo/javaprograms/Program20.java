package com.softwaretestingo.javaprograms;

public class Program20 {

    public static void main(String[] args) {
        /*
         * Input: 1B3A2D4C
         *
         * Output: BAAADDCCCC
         */

        String ip = "1B3A2D4C";
        String op = "";
        for (int i = 0; i < ip.length(); i = i + 2) {
            op = op + appendMe(ip.charAt(i + 1), Integer.parseInt(String.valueOf(ip.charAt(i))));
        }
        System.out.println(op);
    }

    private static String appendMe(char charAt, int no) {
        String op1 = "";
        for (int i = 0; i < no; i++) {
            op1 = op1 + charAt;
        }
        return op1;
    }
}
