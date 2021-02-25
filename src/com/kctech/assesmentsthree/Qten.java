package com.kctech.assesmentsthree;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Qten {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("ArrayList :"+al);
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.addAll(al);
		System.out.println("LinkedHashSet :"+hs);
		

	}

}
