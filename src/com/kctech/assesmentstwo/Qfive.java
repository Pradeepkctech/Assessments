package com.kctech.assesmentstwo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Qfive {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("core");
		list.add("");
		list.add("Java");
		list.add("kctech");
		list.add("");
		
		list = (ArrayList<String>) list.stream().filter(item-> !((String) item).isEmpty()).collect(Collectors.toList());
		System.out.println(list);

	}

}
