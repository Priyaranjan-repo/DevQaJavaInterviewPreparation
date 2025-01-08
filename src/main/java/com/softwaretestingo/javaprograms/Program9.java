zpackage com.softwaretestingo.javaprograms;

import java.util.Arrays;

public class Program9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
         * Input: 1234
         *
         * Output: [1234, 11223344, 111222333444, 1111222233334444]
         *
         * [1111, 11112222, 111122223333, 1111222233334444]
         *
         * [1234, 12341234, 123412341234, 1234123412341234]
         */

        String s = "1234";
        char c[] = s.toCharArray();
        String o[] = new String[s.length()];
        String s1 = "";
        
        for (int i = 0; i < s.length(); i++) {
        	
            for (int j = 0; j < o.length; j++) {
            	
                for (int j1 = 0; j1 < i + 1; j1++) {
                    s1 = s1 + c[i];
                    o[i] = s1;
                }
                s1 = "";
            }

        }

        System.out.println(Arrays.toString(o));
    }

}
