package com.kctech.assesmentOne;

import java.util.ArrayList;
import java.util.List;

public class Q9 {

	public static void main(String[] args) {
		final List<Integer> list=	new ArrayList<>(); 
		list.add(1); 
		list.add(2); 
		list.add(3); 
		System.out.println("before remove:"+list);
		list.remove(2); 
		System.out.println("after remove:"+list);

	}

}
