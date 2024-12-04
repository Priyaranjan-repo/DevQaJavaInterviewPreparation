package com.softwaretestingo.javaprograms;

public class Program12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: tomorrow
         *
         * Output: t#m##rr###w
         *
         */

        String s = "tomorrow";
        String op = s.replaceAll("o", "#");
        System.out.println(op);
    }

}
