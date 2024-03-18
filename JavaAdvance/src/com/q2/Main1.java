package com.q2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
	
	 public static void main(String[] args) {
	        List<String> strings = Arrays.asList("abc", "", "be", "efg", "abcd","", "jkl");

	        List<String> nonEmptyStrings = strings.stream()
	                                              .filter(str -> !str.isEmpty())
	                                              .collect(Collectors.toList());

	        System.out.println("Non-empty strings in the list:");
	        System.out.println(nonEmptyStrings);
	    }

}
