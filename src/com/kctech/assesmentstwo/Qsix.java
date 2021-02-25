package com.kctech.assesmentstwo;

import java.util.Arrays;
//import java.util.HashSet;
import java.util.List;

public class Qsix {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//HashSet<Integer> uniqueValues = new HashSet<>(numbers);

		numbers.stream()
	       .distinct()
	       .forEach(n -> System.out.println(n + "\t" +(int)Math.pow(n, 2)));
		}

	}

