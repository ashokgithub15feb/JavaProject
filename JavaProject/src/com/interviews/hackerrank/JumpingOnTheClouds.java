package com.interviews.hackerrank;

import java.util.Arrays;
import java.util.List;

/*
 There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.

Example


 */
public class JumpingOnTheClouds {

	public static void main(String[] args) {

		int jumpingOnClouds = jumpingOnClouds(Arrays.asList(0, 0, 1, 0, 0, 1, 0));

		System.out.println("Result: " + jumpingOnClouds);
	}

	public static int jumpingOnClouds(List<Integer> c) {

		int count = -1;

		int length = c.size();

		for (int i = 0; i < length; i++, count++) {
			if (i + 2 < length && c.get(i + 2) == 0) {
				i++;
			}
		}

		return count;

	}
}
