package com.softwaretestingo.javaprograms;

public class Program15 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: 1230
         *
         * Output: 03210
         */

        String no = "1230";
       // System.out.println(new StringBuffer(no).reverse().toString() + "0");
        String op =" ";
        String newop = null;
       for (int i = no.length()-1;i>0; i--) {
    	   op = op +no.charAt(i);
    	 newop = op.concat("1")+"0";
	}
       System.out.println(newop);
    }

}
