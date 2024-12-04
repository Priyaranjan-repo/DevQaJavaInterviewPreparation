package com.softwaretestingo.javaprograms;

public class Program32 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: GDP in 2016 has fallen from 6.8% to 4.5%
         *
         * Output: GDP in 6102 has fallen from 8.6% to 5.4%
         */
        String ip = "GDP in 2016 has fallen from 6.8% to 4.5%";
        String op = "";

        String ip1 = ip.replaceAll("", "");
        String op1[] = ip1.split(" ");
        for (int i = 0; i < op1.length; i++) {
            if (Character.isAlphabetic(op1[i].charAt(0))) {
                op = op + op1[i] + " ";
            } else if (Character.isDigit(op1[i].charAt(0)) && !op1[i].contains("%")) {
                op = op + new StringBuffer(op1[i]).reverse().toString() + " ";
            } else if (Character.isDigit(op1[i].charAt(0)) || op1[i].contains("%")) {
                String no = op1[i];
                no = no.replace("%", "");
                op = op + new StringBuffer(no).reverse().toString() + "% ";
            }
        }

        System.out.println(op.trim());
    }

}
