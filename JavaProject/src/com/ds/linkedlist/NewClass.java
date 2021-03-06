package com.ds.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewClass {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws IOException {

		int maxCounter = 0;
		int input;

		int lowerBound;
		int upperBound;
		int counter;
		int numberOfCycles;
		int maxCycles = 0;
		int lowerInt;
		BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
		String line = consoleInput.readLine();
		String[] splitted = line.split(" ");

		lowerBound = Integer.parseInt(splitted[0]);
		upperBound = Integer.parseInt(splitted[1]);

		int[] recentlyused = new int[1000001];

		if (lowerBound > upperBound) {
			int h = upperBound;
			upperBound = lowerBound;
			lowerBound = h;

		}
		lowerInt = lowerBound;
		while (lowerBound <= upperBound) {
			counter = lowerBound;
			numberOfCycles = 0;

			if (recentlyused[counter] == 0) {
				while (counter != 1) {

					if (recentlyused[counter] != 0) {

						numberOfCycles = recentlyused[counter] + numberOfCycles;
						counter = 1;
					} else {
						if (counter % 2 == 0) {
							counter = counter / 2;
						} else {
							counter = 3 * counter + 1;
						}
						numberOfCycles++;
					}

				}
			} else {

				numberOfCycles = recentlyused[counter] + numberOfCycles;
				counter = 1;
			}

			recentlyused[lowerBound] = numberOfCycles;

			if (numberOfCycles > maxCycles) {
				maxCycles = numberOfCycles;
			}

			lowerBound++;
		}
		System.out.println(lowerInt + " " + upperBound + " " + (maxCycles + 1));

	}

}
