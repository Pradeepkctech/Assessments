package com.kctech.assesmentFour;

public class Qfour {
	public static int hill()
	    {
		int[] a= {10,20,40,50,25};
	        int upperRange = 0;
	        int i=1;
	        int[] workingArray = a.clone();
	        int c;
	        boolean valid;
	        while (i < a.length) {
	            // Making head as low as possible
	            workingArray[0]=a[0]-upperRange;
	            // Start from element 1
	            workingArray[i] = a[i] - upperRange;
	            //
	            c= -upperRange;
	            valid = true;
	            while(workingArray[i]<=workingArray[i-1]) {
	                if (c>upperRange) {
	                    upperRange++;
	                    // Ran out of numbers, let's go back to 0 and retry;
	                    valid = false;
	                    break;
	                }
	                workingArray[i] = a[i] + c;
	                c++;
	            }
	            if (valid) {
	                i++;
	            } else {
	                i=1;
	            }
	        }

	        return upperRange;
	    }

	    public static void main(String[] args) {
	        
	    	
	        System.out.print(Qfour.hill());

	    }
	}
	
