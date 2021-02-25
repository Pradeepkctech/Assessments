package com.kctech.assesmentFour;

import java.util.Arrays;

public class Qone {

	public static void main(String [] args) {
		
		String[] firstWords	= {"rat","elbow","taste","night","inch","home","mouse"};
		String[] secondWords= {"tar","elbow","state","thing","chin","come","house"};
        for (int i = 0; i < firstWords.length; i++) {
            char[] s0 = firstWords[i].toCharArray();
            char[] s1 = secondWords[i].toCharArray();
            Arrays.sort(s0);
            Arrays.sort(s1);
            if (Arrays.equals(s0, s1))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
