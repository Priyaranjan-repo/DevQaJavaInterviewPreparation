package com.softwaretestingo.javaprograms;

import java.util.LinkedList;

public class Program23 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * input : [3,R,M,4,89,f]
         *
         * OutPut: [3,4,89,M,R,f]
         */
        Object[] ob = {3, "R", "M", 4, "89", "f"};

        LinkedList listNo = new LinkedList();
        LinkedList list = new LinkedList();
        for (int i = 0; i < ob.length; i++) {
            if (isDigit(ob[i])) {
                listNo.add(ob[i]);
            } else {
                list.add(ob[i]);
            }
        }
        listNo.addAll(list);
        System.out.println(listNo);
    }

    public static boolean isDigit(Object ob) {
        boolean status = false;

        char c[] = ob.toString().toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                status = true;
            }
        }
        return status;

    }

}
