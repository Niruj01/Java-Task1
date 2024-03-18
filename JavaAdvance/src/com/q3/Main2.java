package com.q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
	
	public static void main(String[] args) {
        // Create a list of student names
        List<String> studentNames = Arrays.asList("Aline Marsh", "Niruj", "Aline Sophia", "Alex", "Lavish", "Adam", "Dhanush", "Magesh", "Anu Ranjitha", "Sharan");

        // Use a lambda expression and the Stream API to filter the students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                                                .filter(name -> name.startsWith("A"))
                                                .collect(Collectors.toList());

        // Print the students whose names start with "A"
        System.out.println("Students whose names start with 'A':");
        studentsWithA.forEach(System.out::println);
    }

}
