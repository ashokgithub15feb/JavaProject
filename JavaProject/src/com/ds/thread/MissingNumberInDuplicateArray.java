package com.ds.thread;

public class MissingNumberInDuplicateArray {

	public static void missingNumberInDuplicateArray(int[] array1, int[] array2) { 
		
        if(array1 == null && array2 == null) {
            System.out.println("Input arrays are empty!" );
        } else if(array1 == null) {
            if(array2.length == 1) {
                System.out.println("Missing element = "  + array2[0]);
            } else {
                System.out.println("Input is not valid!" );
            }
        } else if(array2 == null) {
            if(array1.length == 1) {
                System.out.println("Missing element = "  + array1[0]);
            } else {
                System.out.println("Input is not valid!" );
            }
        } else {
            int len1 = array1.length;
            int len2 = array2.length;
            if(Math.abs(len1 - len2) != 1) {
                System.out.println("Input is not valid!" );
                return;
            }
            if(len1 > len2){
                findMissingNumber(array1, array2);
                missingNumberInDuplicateArrayUsingSum(array1, array2);
            } else {
                findMissingNumber(array2, array1);
                missingNumberInDuplicateArrayUsingSum(array2, array1);
            }
        }
    }

    private static void findMissingNumber(int[] array1, int[] array2) {
        int result = array1[0];
        for (int i = 1; i < array1.length ; i++) {
            result = result ^ array1[i];
        }
        for (int i = 0; i < array2.length ; i++) {
            result = result ^ array2[i];
        }
        System.out.println("Missing element = "  + result);
    }

     
    public static void missingNumberInDuplicateArrayUsingSum(int[] array1, int[] array2) {        
        if(array1 == null && array2 == null) {
            System.out.println("Input arrays are empty!" );
        } else if(array1 == null) {
            if(array2.length == 1) {
                System.out.println("Missing element = "  + array2[0]);
            } else {
                System.out.println("Input is not valid!" );
            }
        } else if(array2 == null) {
            if(array1.length == 1) {
                System.out.println("Missing element = "  + array1[0]);
            } else {
                System.out.println("Input is not valid!" );
            }
        } else {
            int len1 = array1.length;
            int len2 = array2.length;
            if(Math.abs(len1 - len2) != 1) {
                System.out.println("Input is not valid!" );
                return;
            }
            if(len1 > len2){
                findMissingNumberUsingSum(array1, array2);
            } else {
                findMissingNumberUsingSum(array2, array1);
            }
        }
    }

    private static void findMissingNumberUsingSum(int[] array1, int[] array2) {
        int result = 0;
        for(int i = 0; i < array1.length; i++) {
            result += array1[i];
        }
        for(int i = 0; i < array2.length; i++) {
            result -= array2[i];
        }
        System.out.println("Missing element = "  + result);
    }

    public static void main(String[] args) {
        int[] array1 = {5, 4, 2, 3, 1};
        int[] array2 = {2, 3, 1,5};
        missingNumberInDuplicateArray(array1, array2);
    }
}
