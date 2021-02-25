package com.kctech.assesmentsthree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Qnine {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put (1, "Pradeep");
		map.put (2, "Bhuvi");
		System.out.println(map);
			List<String> list = new ArrayList<String>(map.values());
			for (String s : list) {
			System.out.println(s);
		}
		
		}
	}
