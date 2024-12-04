package com.softwaretestingo.javaprograms;

public class Program18 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Input: 11001101011
         *
         * Output: 11111110000
         *
         * 11111110000
         */

        String ip = "11001101011";
        String op = "";
        int count1 = 0, count0 = 0;
        for (int i = 0; i < ip.length(); i++) {
            if (ip.charAt(i) == '1') {
                count1++;
            } else {
                count0++;
            }
        }
        for (int i = 0; i < count1; i++) {
            op = op + 1;
        }
        for (int i = 0; i < count0; i++) {
            op = op + 0;
        }
        System.out.println(op);
    }

}
