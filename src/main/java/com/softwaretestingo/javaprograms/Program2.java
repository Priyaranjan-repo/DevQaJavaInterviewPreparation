package com.softwaretestingo.javaprograms;

import java.util.Arrays;

public class Program2 {

    public static void main(String[] args) {

        /*
         * Input: today110is210my310interview
         *
         * Output: yadot110si210ym310weivretni yadotsi110ym210weivretni310
         *
         */

        String input = "today110is210my310interview";

        String op = "";

        String alpha[] = input.split("[^a-z]+");

        String nos[] = input.split("[a-z]+");

        System.out.println(Arrays.toString(alpha));
        System.out.println(Arrays.toString(nos));

        for (int i = 0; i < alpha.length; i++) {

            op = op + reverseMe(alpha[i]) + nos[i];

        }

        System.out.println("Op:"+ op);
    }

    private static String reverseMe(String s) {
        // TODO Auto-generated method stub
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
