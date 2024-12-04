package com.softwaretestingo.javaprograms;

public class Program28 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: My n@me is 12Rahul
         *
         * Output: yM em@n si 12luhaR
         */

        String ip = "My n@me is 12Rahul";
        String op[] = ip.split(" ");// {"reverse","me","without","split"}
        String op1 = "";
        for (int i = 0; i < op.length; i++) {
            if (isContainsDigit(op[i])) {
                String dig = "";
                String alpha = "";
                char digits[] = op[i].toCharArray();
                for (int j = 0; j < digits.length; j++) {
                    if (Character.isDigit(digits[j])) {
                        dig = dig + digits[j];
                    } else {
                        alpha = alpha + digits[j];
                    }
                }
                op1 = op1 + dig + new StringBuffer(alpha).reverse().toString() + " ";

            } else {
                op1 = op1 + new StringBuffer(op[i]).reverse().toString() + " ";
            }
        }
        System.out.println(op1.trim());
    }

    private static boolean isContainsDigit(String string) {
        boolean isboolean = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                isboolean = true;
                break;
            }
        }
        return isboolean;
    }

}
