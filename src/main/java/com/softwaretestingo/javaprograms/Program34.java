package com.softwaretestingo.javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Program34 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: [2, 1, 1, 4, 5, 5, 6, 7]
         *
         * Output: [2, 4, 6, 7]
         */

        int nos[] = {2, 1, 1, 4, 5, 5, 6, 7};
        List list = new LinkedList();
        HashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for (int i = 0; i < nos.length; i++) {
            if (map.containsKey(nos[i])) {
                map.put(nos[i], map.get(nos[i]) + 1);
            } else {
                map.put(nos[i], 1);
            }
        }

        for (Integer in : map.keySet()) {
            if (map.get(in) == 1) {
                list.add(in);
            }
        }
        System.out.println(list);
    }

}
