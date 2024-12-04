package com.softwaretestingo.javaprograms;

public class Program27 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: reverse me without split
         *
         * Output: esrever em tuohtiw tilps
         */

        String ip = "reverse me without split";
        String op[] = ip.split(" ");// {"reverse","me","without","split"}
        String op1 = "";
        for (int i = 0; i < op.length; i++) {
            op1 = op1 + new StringBuffer(op[i]).reverse().toString() + " ";
        }
        System.out.println(op1.trim());
    }

}
