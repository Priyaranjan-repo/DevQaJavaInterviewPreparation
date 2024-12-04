package com.softwaretestingo.javaprograms;

public class Program14 {

    /*
     * Input: Selenium
     *
     * eleniumS
     *
     * leniumeS
     *
     * eniumleS
     *
     * niumeleS
     *
     * iumneleS
     *
     * umineleS
     *
     * muineleS
     */
    public static void main(String[] args) {

        String ip = "Selenium";
        String op = "";
        for (int i = 1; i < ip.length(); i++) {
            op = ip.substring(i) + new StringBuffer(ip).reverse().toString().substring(ip.length() - i);
            System.out.println(op);
        }

    }
}
