package com.softwaretestingo.javaprograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program21 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Input:[5, 0, 4, 6, 0, 7, 0]
         *
         * Output: 0 0 0 5 4 6 7
         */
        int[] a = {5, 0, 4, 6, 0, 7, 0};
        System.out.println(Arrays.toString(a));
        /*
         * for (int i = 0; i < a.length - 1; i++) { for (int j = 0; j <= a.length; j++)
         * { if (a[i] != 0) { int temp = a[i + 1]; a[i + 1] = a[i]; a[i] = temp; } } }
         */

        List<Integer> list0 = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                list0.add(a[i]);
            } else {
                list.add(a[i]);
            }
        }
        list0.addAll(list);
        System.out.println(list0);
    }

}
