package com.greatlearning.assignment3.question1.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.greatlearning.assignment3.question1.services.SkyScraperServices;


public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building ");

		int skyScraperHeight = sc.nextInt();
		List<Integer> floorSizes = new ArrayList<>();
		for (int i = 1; i <= skyScraperHeight; i++) {
			System.out.println("enter the floor size given on day : " + i);
			int floor = sc.nextInt();
			floorSizes.add(floor);
		}
		
		SkyScraperServices obj = new SkyScraperServices();
		
		obj.assembleFloors(floorSizes);

		sc.close();

	}

}
