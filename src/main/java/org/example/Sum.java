package org.example;

import java.util.HashMap;
import java.util.Map;

public class Sum {

//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]



    static void meth(int target){
        int compliment;
        int[] nums = {2,7,11,15};
       int i=0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int j :nums){
            mp.put(j,++i);
        }
        Map<Integer,Integer> mp1 = new HashMap<>();

        for ( i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (mp.containsKey(complement)) {
                // Return indices of the two numbers that add up to the target
                mp1.put(complement,nums[i]);

            }

  }
        System.out.println(mp1);
    }


    static void usingSingleMap(int target)  {
        int[] nums = {2,7,11,15};
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {

                System.out.println(i + "," + numMap.get(complement));
            } else {
                numMap.put(nums[i], i);
            }
        }


    }


    public static void main(String[] args) {
        Sum.meth(9);

     Sum.usingSingleMap(9);
    }
}
