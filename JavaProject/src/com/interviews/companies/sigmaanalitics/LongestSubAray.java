package com.interviews.companies.sigmaanalitics;

import java.util.HashMap;
import java.util.Map;

public class LongestSubAray {

	public static void main(String[] args) {

        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;

        int result = longestSubAray(nums, k);
        System.out.println("Result: "+result);
    }

    private static int longestSubAray(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {

            int diff = k - nums[i];
            System.out.println("Diff: "+diff);

            sum = sum + nums[i];
            System.out.println("Sum: "+sum);

            if(sum == k) {
                maxlen = i + 1;
            }

            int content = sum - k;
            System.out.println("sum - k: "+content);
            if(map.containsKey(content)) {
                maxlen = Math.max(maxlen, i - map.get(content));
            }
            map.put(nums[i], 1);
            System.out.println("Map: "+map);
        }
        return maxlen;
    }
}
