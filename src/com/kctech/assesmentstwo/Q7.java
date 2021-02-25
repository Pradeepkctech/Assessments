package com.kctech.assesmentstwo;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Q7 {
	 public static void main(String[] args) 
	    {
	        Random random = new Random();
	         
	    
	 
	 
	     
	 
	        List<Long> longs = random.longs( 10 ).boxed().collect( Collectors.toList() );
	        System.out.println(longs);
	    }
	}

