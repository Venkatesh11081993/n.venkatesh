package com.techzenureDay4;

import java.util.Scanner;

public class AverageAgeCaliculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total no. of employees: ");
		int totalEmployees = sc.nextInt();
		
		int[] ages = new int[totalEmployees];
		System.out.println("Enter the age for " + totalEmployees + " employees:");
		for (int i = 0; i < totalEmployees; i++) {
			ages[i] = sc.nextInt();
		}
		
		calculateAverage(ages);
		System.out.println();
		
		 sc.close();
	}

	private static void calculateAverage(int[] ages) {
		int validEmployeeCount = 0;
		int sumOfAges = 0;
		
		for (int i = 0; i < age.length; i++) {
			if (age[i] >= 28 && age[i] <= 40) {
		}
		
	}

}
