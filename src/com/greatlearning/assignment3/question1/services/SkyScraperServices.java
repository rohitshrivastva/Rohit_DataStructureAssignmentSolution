package com.greatlearning.assignment3.question1.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SkyScraperServices {

	List<Integer> remainingFloors;
	int currentFloor;
	List<Integer> floorsAtDayN;

	/*
	 * @description This function assembles the Bigger floors on button and smaller
	 * floors on Top
	 * 
	 * @param List<Integer> floorSizes
	 * 
	 */

	public void assembleFloors(List<Integer> floorSizes) {

		int height = floorSizes.size();
		currentFloor = height;
		remainingFloors = new ArrayList<>();

		for (int day = 0; day < height; day++) {
			floorsAtDayN = new ArrayList<>();
			int size = floorSizes.get(day);

			// add floors to assemble in nth day
			if (size == currentFloor) {
				floorsAtDayN.add(size);
				currentFloor = currentFloor - 1;

				// check the remaining floors in the temporary list
				checkRemainingList(currentFloor, remainingFloors);
			}

			// add the smaller floor in temporary list
			if (size < currentFloor) {
				remainingFloors.add(size);
			}

			// print the floor to assemble in nth day
			System.out.println();
			System.out.println("Day: " + (day + 1));
			for (int i : floorsAtDayN) {
				System.out.print(i + " ");
			}
		}
	}

	/*
	 * @description this function checks floor to add in nth day recursively
	 * 
	 * @param int currentFloow
	 * 
	 * @param List<Integer> remainingList
	 * 
	 */
	void checkRemainingList(int currentFloor, List<Integer> remainingList) {
		Iterator<Integer> itr = remainingList.iterator();
		while (itr.hasNext()) {
			int remFloor = itr.next();
			if (remFloor == currentFloor) {
				floorsAtDayN.add(remFloor);
				this.currentFloor = currentFloor - 1;
				checkRemainingList(this.currentFloor, remainingList);
			}
		}

	}

}
