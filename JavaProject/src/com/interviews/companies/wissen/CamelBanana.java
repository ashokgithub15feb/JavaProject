package com.interviews.companies.wissen;

public class CamelBanana {

	public static void main(String[] args) {
		
		int distance = 1000;
		int bananas = 3000;
		int capacity = 1000;
		
        //System.out.println("Max bananas delivered = " + maxBananas(distance, bananas, capacity)); // Output: 533

		maxBananas1(distance, bananas, capacity);
	}

	private static void maxBananas1(int distance, int bananas, int capacity) {
		int position = 0;
       
		while (distance > 0) {
            // How many times camel needs to cross this segment?
            int trips = (bananas + capacity - 1) / capacity; // ceil(bananas / capacity)
            // Camel needs to come back for all trips except the last one:
            int bananasConsumedPerKm = 2 * trips - 1;
            // How far can we go until we need to change the number of trips?
            int nextBreakpoint = bananas / (capacity * (trips - 1)) == 0 ? 1 : (capacity * (trips - 1));
            int step = Math.min(distance, nextBreakpoint);

            // If it's the last trip (bananas <= capacity), camel just go directly
            if (bananas <= capacity) {
                bananas -= distance;
                break;
            }
            // Eat bananas for this step
            bananas -= bananasConsumedPerKm * step;
            distance -= step;
        }
		System.out.println("Max bananas delivered = " + Math.max(bananas, 0)); 
	}

	private static int maxBananas(int distance, int bananas, int capacity) {
		
		int[][] dp = new int[distance + 1][bananas + 1];
		
		for(int i=0; i <= distance; i++) {
			for(int j=0; j <= distance; j++) {
				dp[i][j] = -1;
			}
		}
		
		//display(dp);
		
		int maxBanana = helper(distance, bananas, capacity, dp);
		
		return maxBanana;
	}

	private static int helper(int distance, int bananas, int capacity, int[][] dp) {
		
		if(bananas <= distance) { // Not enough bananas for the journey
			return 0;
		}
		
		if(bananas <= capacity) { // Only one trip needed, camel eats 1/km
			return bananas - distance;
		}
		
		if(distance == 0) { // All bananas already at destination
			return bananas;
		}
		
		if(dp[distance][bananas] != -1 && dp[distance][bananas] != 0) {
			return dp[distance][bananas];
		}
		
		int maxBanana = Integer.MIN_VALUE;
		
		int trip = (bananas % capacity == 0) ? ((2 * bananas) / capacity) - 1 : ((2 * bananas) / capacity) + 1;
		
		for(int i=1; i<= distance; i++) {
			int left = bananas - trip * i;
			
			if(left < 0) {
				break;
			}
			
			int val = helper(distance - i, left, capacity, dp);
			System.out.println(val);
			if(val > maxBanana) {
				maxBanana = val;
			}
			dp[distance][bananas] = maxBanana;
		}
		return maxBanana;
	}

	private static void display(int[][] dp) {
		for(int i=0; i <= dp.length - 1; i++) {
			for(int j=0; j <= dp[0].length - 1; j++) {
				System.out.print("|"+dp[i][j]+" ");
			}
			System.out.println("|");
		}		
	}
}
