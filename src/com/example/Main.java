package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(9);
        nums.add(1);
        nums.add(3);
        nums.add(10);
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(List<Integer> nums) {
        Set<Integer> numsSet = new HashSet<>();
        int max = nums.get(0);
        int min = nums.get(0);
        for(Integer i : nums){
            numsSet.add(i);
            if(i < min){
                min = i;
            }
            if(i > max){
                max = i;
            }
        }
        for(int i = min; i < max; ++i){
            if(!numsSet.contains(i)){
                return i;
            }
        }
        return 0;
    }
}
