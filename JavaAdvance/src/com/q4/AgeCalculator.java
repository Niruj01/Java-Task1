package com.q4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = scanner.nextLine();
        
        LocalDate birthDate = LocalDate.parse(input);
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(birthDate, currentDate);
        
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        
        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days");
    }

}
