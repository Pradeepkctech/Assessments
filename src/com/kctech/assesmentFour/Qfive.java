package com.kctech.assesmentFour;

public class Qfive {

	public static void main(String[] args)
	{
	    Integer[] v= {25,10,20,30,40,50,60,70,80};
	    Integer d=2;
	        int result, dev, last;
	        Pair p;
	        p = dev(v, 0, d);
	        result = p.max - p.min;
	        last = v.length - d;
	        for (int i = 1; i <= last; i++) {
	            
	        	p = dev(v, i, d);
	            dev = p.max - p.min;
	            if (result < dev) {
	                result = dev;
	            }
	            //}
	        }
	        System.out.println(result);
	    }

	    static Pair dev(Integer[] v, int i, int d) {
	        int min, max;
	        final int last = i + d;
	        min = v[i];
	        max = min;
	        for (int j = i + 1; j < last; j++) {
	            if (v[j] < min) {
	                min = v[j];
	            }
	            if (v[j] > max) {
	                max = v[j];
	            }
	        }
	        return new Pair(min, max);
	    }

	    static class Pair {
	        public int min;
	        public int max;
	        public Pair(int min, int max) {
	            this.min = min;
	            this.max = max;
	        }
	    
	}

}
