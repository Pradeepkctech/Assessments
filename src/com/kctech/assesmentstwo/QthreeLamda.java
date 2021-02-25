package com.kctech.assesmentstwo;

import java.util.ArrayList;
import java.util.List;


  
	
	  
	public class QthreeLamda {  
		public static void main(String[] args)
		{
		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(3);
		list.add(4);
		list.add(55);
		list.add(2);  
		System.out.println(sum(list));
		}
	

public static int sum(List<Integer> list)
		{
		return list.stream().mapToInt(i -> i).sum();
		}
	}

		
