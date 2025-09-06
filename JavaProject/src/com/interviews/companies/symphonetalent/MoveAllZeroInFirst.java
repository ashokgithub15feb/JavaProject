package com.interviews.companies.symphonetalent;

import java.util.Arrays;

public class MoveAllZeroInFirst {

	public static void main(String[] args) {

        int[] input = {0,0,1,1,0,1,0,1,0,1,1,0,1,1};

        // Output: [0,0,0,0,0,0,0,1,1,1,1,1,1,1]

        //Move All the Zeroes to left

        //Minimal Time Complexity

        //O(1) Space Complexity

        System.out.println(Arrays.toString(input));
        moveZero(input);
        System.out.println(Arrays.toString(input));
    }

    private static void moveZero(int[] input) {

//        for(int i=1 ; i< input.length ; i++) {
//            for(int j = i ; j > 0 ; j--) {
//                if(input[j] < input[j-1]) {
//                    int temp = input[j];
//                    input[j] = input[j-1];
//                    input[j-1] = temp;
//                }
//            }
//        }

        // a1 = 0 = ?
        //a2 = 1 = ?

        int left  = 0;
        int rigth = input.length -1 ;

        while(left < rigth) {
            if(input[left] < input[rigth]) {
                left++;
            } else if(input[left] > input[rigth]) {
                int temp = input[left];
                input[left] = input[rigth];
                input[rigth] = temp;
                left++;
                rigth--;
            } else if (input[left]  == 0 &&  input[rigth] == 1){
                left++;
            } else if (input[left]  == 1 &&  input[rigth] == 0){
                int temp = input[left];
                input[left] = input[rigth];
                input[rigth] = temp;
                left++;
                rigth--;
            } else if(input[left] == 1 && input[rigth] == 1) {
                rigth--;
            }
        }
    }
}
