package com.softwaretestingo.javaprograms;

import java.util.LinkedList;
import java.util.List;

public class Program13 {
    public static void main(String[] args) {

        /*
         * Input: [1, 2, 2, 3, 4, 5, 5, 3]
         *
         * Output: 1,3,4,3,
         */

        int ip[] = {1, 2, 2, 3, 4, 5, 5, 3};

        List list = new LinkedList();

        boolean found = false;

        for (int i = 0; i < ip.length - 1; i++) {
            if (ip[i] != ip[i + 1]) {
                list.add(ip[i]);
            } else {
                i++;
            }
        }

        if (ip[ip.length - 1] != ip[ip.length - 2]) {
            list.add(ip[ip.length - 1]);
        }
        System.out.println(list);

    }
}
