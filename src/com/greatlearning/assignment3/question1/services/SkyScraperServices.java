package com.greatlearning.assignment3.question1.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SkyScraperServices {

	List<Integer> remainingFloors;
	int currentFloor;
	List<Integer> floorsAtDayN;

	public void assembleFloors(List<Integer> floorSizes) {

		int height = floorSizes.size();
		currentFloor = height;
		remainingFloors = new ArrayList<>();

		for (int day = 0; day < height; day++) {
			floorsAtDayN = new ArrayList<>();
			int size = floorSizes.get(day);

			if (size == currentFloor) {
				floorsAtDayN.add(size);
				currentFloor = currentFloor - 1;
				checkRemainingList(currentFloor, remainingFloors);
			}

			if (size < currentFloor) {
				remainingFloors.add(size);
			}

			System.out.println();
			System.out.println("Day: " + (day + 1));
			for (int i : floorsAtDayN) {
				System.out.print(i + " ");
			}
		}
	}

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
