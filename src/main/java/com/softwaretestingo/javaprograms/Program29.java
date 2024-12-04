package com.softwaretestingo.javaprograms;

public class Program29 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input – Hi I am Naveen I need and answer
         *
         * Output – answer and deen I Naveen ma I Hi
         */
        String ip = "Hi I am Naveen I need and answer";
        String op[] = ip.split(" ");
        String op1 = "";
        for (int i = 0; i <= op.length - 1; i++) {
            op1 = op1 + op[op.length - 1 - i] + " ";
        }
        System.out.println(op1);

    }

}
