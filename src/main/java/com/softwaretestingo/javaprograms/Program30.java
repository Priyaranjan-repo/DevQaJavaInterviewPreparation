package com.softwaretestingo.javaprograms;

public class Program30 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: Hello world,welcome to my world,my world
         *
         * Output: world Hello ,world my to welcome ,world my
         *
         */

        String ip = "Hello world,welcome to my world,my world";
        String op[] = ip.split(",");
        String op1 = "";

        for (int i = 0; i < op.length; i++) {
            if (i == op.length - 1) {
                op1 = op1 + reverseMe(op[i]);
            } else {
                op1 = op1 + reverseMe(op[i]) + ",";
            }
        }

        System.out.println(op1);
    }

    private static String reverseMe(String string) {
        // TODO Auto-generated method stub
        String reverse = "";
        String s[] = string.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            reverse = reverse + s[i] + " ";
        }
        return reverse;
    }

}
