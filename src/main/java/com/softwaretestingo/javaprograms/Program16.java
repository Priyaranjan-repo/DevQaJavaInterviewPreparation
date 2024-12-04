package com.softwaretestingo.javaprograms;

public class Program16 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: he is a good boy
         *
         * Output: yo bd o ogas ieh
         */

        String ip = "he is a good boy";
        String op = "";
        op =new StringBuffer(ip).reverse().toString();
        System.out.println(op);
        
        op = op.replaceAll(" ", "");
        String oop = "";
        int count = 0;
        
        for (int i = 0; i < ip.length(); i++) {
        	
            if ((ip.charAt(i) + "").equals(" ")) {
                oop = oop + " ";
                ++count;
            } else {
                oop = oop + op.charAt(i - count);
            }
        }
        System.out.println(oop);
    }
    }


